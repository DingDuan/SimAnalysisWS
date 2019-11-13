package demo.service.impl;

import demo.com.tcsa.analysis.PUTAnalysis;
import demo.com.tcsa.analysis.SimAnalysis;
import demo.com.tcsa.analysis.TPAnalysis;
import demo.com.tcsa.model.ContestantSimilarity;
import demo.com.tcsa.model.ContestantSimilarityByMID;
import demo.com.tcsa.model.ContestantTFModel;
import demo.com.tcsa.model.TFSimilarityModel;
import demo.common.ResponseCode;
import demo.common.Result;
import demo.dao.MUTModelDao;
import demo.dao.SimValueModelDao;
import demo.dao.TFModelDao;
import demo.entity.MUTModel;
import demo.entity.SimValueModel;
import demo.entity.TFModel;
import demo.pdf.GeneratePDF;
import demo.po.GeneralResult;
import demo.po.PDFContent;
import demo.service.TFService;
import demo.vo.IndexDisplayVO;
import demo.vo.Inputs;
import demo.vo.SimValueVO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

@Service
public class TFServiceImpl implements TFService {

    @Resource
    private SimValueModelDao simValueModelDao;

    @Resource
    private MUTModelDao mutModelDao;

    @Resource
    private TFModelDao tfModelDao;

    @Override
    public Result getSimValue(Inputs inputs) {


        List<Double> result = new ArrayList<>();

        return Result.success().code(200).withData(result);
    }

    @Override
    public Result detect(Inputs inputs) {
        List<IndexDisplayVO> indexDisplayVOList = new ArrayList<>();
        String srcPath = inputs.getSrcPath();
        String p1Path = inputs.getP1Path();
        String p2Path = inputs.getP2Path();
        double threshold = inputs.getThreshold();
        List<MUTModel> mutModelList;
        String[] srcs = srcPath.split("/");
        String subject = srcs[srcs.length - 2];
        String[] p1s = p1Path.split("/");
        int cid1 = Integer.parseInt(p1s[p1s.length - 1]);
        String[] p2s = p2Path.split("/");
        int cid2 = Integer.parseInt(p2s[p2s.length - 1]);
        try {
            List<SimValueModel> simValueModelList = simValueModelDao.searchSimValueAllContentByPair(cid1, cid2,subject);
            if (simValueModelList.size() != 0) {
                for (int i = 0; i < simValueModelList.size(); i++) {
                    IndexDisplayVO indexDisplayVO = new IndexDisplayVO();
                    indexDisplayVO.setMethodId(i + 1);
                    SimValueModel simValueModel = simValueModelList.get(i);
                    int mid = simValueModel.getMid();
                    indexDisplayVO.setMethodName(mutModelDao.getMethodNameByMID(mid));

                    indexDisplayVO.setTfid1(tfModelDao.getIdByMIDAndCid(mid, cid1));
                    indexDisplayVO.setTfid2(tfModelDao.getIdByMIDAndCid(mid, cid2));

                    double simValue = simValueModel.getSimValue();
                    indexDisplayVO.setSimValue(simValue);
                    if (simValue >= threshold * 100) {
                        indexDisplayVO.setPlag(true);
                    } else {
                        indexDisplayVO.setPlag(false);
                    }

                    indexDisplayVOList.add(indexDisplayVO);
                }
            } else {
                mutModelList = mutModelDao.getALLBySubejct(subject);
                if (mutModelList.size() == 0) {
                    mutModelList = PUTAnalysis.analyze(srcPath, subject);
                }
                Map<Integer, List<ContestantTFModel>> tfMap1 = TPAnalysis.myAnalyze(mutModelList, p1Path);
                Map<Integer, List<ContestantTFModel>> tfMap2 = TPAnalysis.myAnalyze(mutModelList, p2Path);

                List<SimValueVO> resultList = new ArrayList<>();
                for (MUTModel mutModel : mutModelList) {
                    MUTModel mutModelEntity = mutModelDao.save(mutModel);
                }

                saveTFToDB(tfMap1, subject);
                saveTFToDB(tfMap2, subject);
                // 计算测试片段之间相似度并存入数据库
                List<List<SimValueVO>> simValueList = tfAnalysis(mutModelList,subject);
                //11个list，每个里面一个元素


                for (int i = 0; i < simValueList.size(); i++) {
                    List<SimValueVO> list = simValueList.get(i);
                    for (int j = 0; j < list.size(); j++) {
                        IndexDisplayVO indexDisplayVO = new IndexDisplayVO();
                        indexDisplayVO.setMethodId(i + 1);

                        SimValueVO simValueVO = list.get(j);
                        int mid = simValueVO.getMid();
                        indexDisplayVO.setMethodName(mutModelDao.getMethodNameByMID(mid));

                        indexDisplayVO.setTfid1(tfModelDao.getIdByMIDAndCid(mid, cid1));
                        indexDisplayVO.setTfid2(tfModelDao.getIdByMIDAndCid(mid, cid2));

                        double simValue = simValueVO.getSimValue();
                        indexDisplayVO.setSimValue(simValue);
                        if (simValue >= threshold * 100) {
                            indexDisplayVO.setPlag(true);
                        } else {
                            indexDisplayVO.setPlag(false);
                        }

                        indexDisplayVOList.add(indexDisplayVO);
                    }
                }
            }
            List<Integer> players = new ArrayList<>();
            players.add(1);
            players.add(2);
            PDFContent pdfContent = getPDFContentFromDB(players, 0.8,subject);
            pdfContent.setSubject(subject);
            pdfContent.setPlayers(players);
            pdfContent.setThreshold(0.8);
            GeneratePDF generatePDF = new GeneratePDF();
            generatePDF.createPDF(pdfContent);


            return Result.success().message("检测结果保存成功！").withData(indexDisplayVOList);
        }catch (NullPointerException npe){
            npe.printStackTrace();
            return Result.error().message("提供数据不全！").code(ResponseCode.INCOMPLETE_INFO);
        }catch (Exception e){
            e.printStackTrace();
            return Result.error().message("检测结果保存失败，数据库更新错误！").code(ResponseCode.DB_UPDATE_ERROR);

        }
    }
    
    /*
     * @Author duanding
     * @Description 从数据库获取生成PDF所需数据
     * @Date 1:59 PM 2019/11/11
     * @Param [cids]
     * @return demo.po.PDFContent
     **/
    public PDFContent getPDFContentFromDB(List<Integer> players,double threshold,String subject){
        PDFContent pdfContent = new PDFContent();
        List<GeneralResult> generalResultList = new ArrayList<>();
        int index = 1;
        int plgPairs = 0;
        for(int i=0;i<players.size()-1;i++) {
            int cid1 = players.get(i);
            for (int j = i + 1; j < players.size(); j++) {
                int cid2 = players.get(j);
                List<Double> simValueList = simValueModelDao.searchSimValueByPair(cid1, cid2,subject);
                GeneralResult generalResult = new GeneralResult();
                if (simValueList.size() != 0) {
                    generalResult.setResultID(index);
                    generalResult.setCid1(cid1);
                    generalResult.setCid2(cid2);
                    Collections.sort(simValueList);
                    Double maxSim = simValueList.get(simValueList.size()-1);
                    generalResult.setMaxSim(maxSim.intValue());
                    if (maxSim >= threshold * 100) {
                            generalResult.setPlag(true);
                            plgPairs++;
                        } else {
                            generalResult.setPlag(false);
                        }

                    index++;
                }
                generalResultList.add(generalResult);
            }
        }
        pdfContent.setPlagPairs(plgPairs);
        pdfContent.setResultList(generalResultList);
        return pdfContent;
    }

    public void saveTFToDB(Map<Integer, List<ContestantTFModel>> tfMap,String subject){
        Iterator<Map.Entry<Integer,List<ContestantTFModel>>> entries = tfMap.entrySet().iterator();
        while(entries.hasNext()) {
            Map.Entry<Integer, List<ContestantTFModel>> entry = entries.next();
            int MID = entry.getKey();
            List<ContestantTFModel> contestantTFModelList = entry.getValue();
            if (contestantTFModelList != null) {
                for (ContestantTFModel contestantTFModel :
                        contestantTFModelList) {
                    TFModel tfModel = new TFModel();
                    tfModel.setMid(MID);
                    tfModel.setCid(contestantTFModel.getCID());
                    tfModel.setFragment(contestantTFModel.getTestFragment());
                    tfModel.setStateNum(contestantTFModel.getStateNumber());
                    tfModel.setLength(contestantTFModel.getFragmentLength());
                    tfModel.setSubject(subject);
                    TFModel tfModelEntity = tfModelDao.save(tfModel);
                }
            }
        }
    }

    public List<List<SimValueVO>> tfAnalysis(List<MUTModel> mutModelList,String subject) {
//        mutModelList = mutModelDao.getMUTModelList();
        int[] mIDArray = new int[mutModelList.size()];
        int index = 0;
        for (MUTModel mutModel : mutModelList) {
            long mid =  mutModel.getMethodId();
//            if (mid == -373229334 || mid == -561849238|| mid == -576060075
//                    || mid == -620252230 || mid == -620421252
//                    || mid == -698809980 || mid == -699150091
//                    || mid == -715073250 || mid == -717360243
//                    || mid == -723512252 || mid == -862597736
//                    || mid == -949293390 ) {
            mIDArray[index] = mutModel.getMethodId();
            index++;
//            }
        }

        // category: 0-ratio; 1-partial Ratio(部分比例，即只有百分数的百分号前的);
        List<List<SimValueVO>> resultLists = calculateSimilarityBetweenTF(mIDArray, 1,subject);
        return resultLists;
    }

    public List<List<SimValueVO>> calculateSimilarityBetweenTF(int[] mIDArray, int category,String subject) {
        List<ContestantSimilarityByMID> contestantSimilarityByMIDList = new ArrayList<>(mIDArray.length);
        List<List<SimValueVO>> resultLists = new ArrayList<>();
        for (int mid : mIDArray) {
            if (mid == 0) {
                continue;
            }
            int compareNumber = 0;
            System.out.println("MID：" + mid);
            ContestantSimilarityByMID contestantSimilarityByMID = new ContestantSimilarityByMID(mid);
            List<TFModel> tfModelList = tfModelDao.getTFModelListByMID(mid);
            if (tfModelList == null) {
                contestantSimilarityByMIDList.add(contestantSimilarityByMID);
                continue;
            }
            int count = tfModelList.size();
            System.out.println("对比人数：" + count);
            if (count < 2) {
                contestantSimilarityByMIDList.add(contestantSimilarityByMID);
                continue;
            }
            long startTime=System.currentTimeMillis();
            System.out.println("对比开始时间：" + startTime);
            List<ContestantSimilarity> contestantSimilarityList = new ArrayList<>(count);
            for (int index = 0; index < count; index++) {
                TFModel baseTFModel = tfModelList.get(index);
                int CID1 = baseTFModel.getCid();
                ContestantSimilarity contestantSimilarity = new ContestantSimilarity(CID1);
                String baseTestFragment = baseTFModel.getFragment();
                if (baseTestFragment != null) {
                    List<TFSimilarityModel> tfSimilarityModelList = new ArrayList<>(count - index - 1);
                    for (int index1 = index + 1; index1 < count; index1++) {
                        TFModel tfModel = tfModelList.get(index1);
                        int CID2 = tfModel.getCid();
                        String testFragment = tfModel.getFragment();
                        int simValue = 0;
//                        if (category == 0) {
//                            simValue = SimAnalysis.getSimValue(baseTestFragment, testFragment);
//                        }
                        if (category == 1) {
                            simValue = SimAnalysis.fuzzyPartialRatio(baseTestFragment, testFragment);
                        }
                        compareNumber++;
                        TFSimilarityModel tfSimilarityModel = new TFSimilarityModel(CID1, CID2, simValue);
                        tfSimilarityModelList.add(tfSimilarityModel);
                    }
                    contestantSimilarity.setTfSimilarityModelList(tfSimilarityModelList);
                }
                contestantSimilarityList.add(contestantSimilarity);
            }
            contestantSimilarityByMID.setContestantSimilarityList(contestantSimilarityList);
            contestantSimilarityByMIDList.add(contestantSimilarityByMID);
            System.out.println("对比次数：" + compareNumber);
            long endTime=System.currentTimeMillis();
            System.out.println("对比结束时间：" + endTime);
            System.out.println("对比运行耗时：" + (endTime - startTime) + "ms");
            resultLists.add(saveTFSimValueToDatabase(contestantSimilarityByMIDList, category,subject));
            contestantSimilarityByMIDList.clear();
        }
        return resultLists;
    }

    private List<SimValueVO> saveTFSimValueToDatabase(List<ContestantSimilarityByMID> contestantSimilarityByMIDList
            , int category,String subject) {
        List<SimValueVO> resultList = new ArrayList<>();
        for (ContestantSimilarityByMID contestantSimilarityByMID:
                contestantSimilarityByMIDList) {
            int MID = contestantSimilarityByMID.getMID();
            List<ContestantSimilarity> contestantSimilarityList = contestantSimilarityByMID.getContestantSimilarityList();
            if (contestantSimilarityList == null) {
                // no contestant testing this MUT.
                continue;
            }
            for (ContestantSimilarity contestantSimilarity :
                    contestantSimilarityList) {
                int CID1 = contestantSimilarity.getCID();
                List<TFSimilarityModel> tfSimilarityModelList = contestantSimilarity.getTfSimilarityModelList();
                if (tfSimilarityModelList == null) {
                    // no more than one contestant testing this MUT.
                    continue;
                }
                for (TFSimilarityModel tFSimilarityModel:
                        tfSimilarityModelList) {
                    int CID2 = tFSimilarityModel.getCID2();
                    int simValue = tFSimilarityModel.getSimValue();
                    SimValueModel simValueModel = new SimValueModel();
                    simValueModel.setMid(MID);
                    simValueModel.setCid1(CID1);
                    simValueModel.setCid2(CID2);
                    simValueModel.setSimValue(simValue);
                    simValueModel.setCategory(category);
                    simValueModel.setSubject(subject);
                    simValueModelDao.save(simValueModel);

                    SimValueVO result = new SimValueVO();
                    BeanUtils.copyProperties(simValueModel, result);
                    resultList.add(result);
                }
            }
        }
        return resultList;
    }
}
