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
import demo.getData.DownloadCode;
import demo.getData.UnPackUtil;
import demo.pdf.GeneratePDF;
import demo.po.FragDetail;
import demo.po.GeneralResult;
import demo.po.PDFContent;
import demo.po.SimDetail;
import demo.service.TFService;
import demo.vo.*;
import me.xdrop.fuzzywuzzy.FuzzySearch;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.util.Arrays.asList;

@Service
public class TFServiceImpl implements TFService {
    double threshold = 0.8;

    @Resource
    private SimValueModelDao simValueModelDao;

    @Resource
    private MUTModelDao mutModelDao;

    @Resource
    private TFModelDao tfModelDao;

    @Override
    public Result getSimValue(Paths paths) {


        List<Double> result = new ArrayList<>();

        return Result.success().code(200).withData(result);
    }

    /*
     * @Author duanding
     * @Description 某个项目/题目的所有选手之间检测（包含下载解压）
     * @Date 5:11 PM 2019/12/30
     * @Param [paths]
     * @return demo.common.Result
     **/
    @Override
    public Result detectAll(Inputs inputs) {
        DownloadCode downloadCode = new DownloadCode();
        String downloadDestPre = "/Users/dd/study/iSE/Graduation-Design/ContestDataSet/";
        String subject = "";
//        String subject = "Province";
//        List<Url> codeUrlList = inputs.getCodeUrlList();
        List<Url> codeUrlList = downloadCode.getUrlList("Tarjan");
        long beginDownloadTime = System.currentTimeMillis();
        for(int i=0;i<codeUrlList.size();i++){
            Url codeUrl = codeUrlList.get(i);
            String urlStr = codeUrl.getCodeUrl();
            String[] list = urlStr.split("/");
            String[] lastContent = list[list.length-1].split("_");
            subject = lastContent[0];
            try {
                downloadCode.saveToFile(urlStr,downloadDestPre+subject+"/"+list[list.length-2]+"_"+list[list.length-1]);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        long endDownloadTime = System.currentTimeMillis();
        System.out.println("下载耗时："+(endDownloadTime-beginDownloadTime)+"ms");

        long beginUnpackTime = System.currentTimeMillis();
        UnPackUtil.batchUnPack(downloadDestPre+subject+"/","",downloadDestPre+subject+"/");
        long endUnpackTime = System.currentTimeMillis();
        System.out.println("解压耗时："+(endUnpackTime-beginUnpackTime)+"ms");

        long beginDetectTime = System.currentTimeMillis();

        String rootPath = downloadDestPre+subject+"/";
        File rootDir = new File(rootPath);
        String parentName = rootDir.getName();
        File[] allChildDirectories = rootDir.listFiles();
        List<File> dirList = new ArrayList<>();
        boolean flag;
        if (allChildDirectories != null && allChildDirectories.length > 0) {
            for (int i = 0; i < allChildDirectories.length; i++) {
                flag = false;
                File directory = allChildDirectories[i];
                if (".DS_Store".equals(directory.getName())) {
                    continue;
                }
                if (directory.isDirectory()) {
                    String[] dirName = directory.getName().split("_");
                    String dirNameFirst = dirName[0];
                    BigInteger dirNameLast = new BigInteger(dirName[dirName.length-1]);
                    if (directory.listFiles().length > 0 && parentName.equals(directory.getParentFile().getName())
//                            && directory.getName().contains(subject)) {
                            && directory.getName().contains("AStar")) {
                        Iterator it = dirList.iterator();
                        while(it.hasNext()){
                            File existDir = (File) it.next();
                            String[] existDirName = existDir.getName().split("_");
                            String existDirNameFirst = existDirName[0];
                            BigInteger existDirNameLast = new BigInteger(existDirName[existDirName.length-1]);
                            if(existDirNameFirst.equals(dirNameFirst)) {
                                if (existDirNameLast.compareTo(dirNameLast) == -1) {
                                    it.remove();
                                }else{
                                    flag = true;
                                }
                                break;
                            }
                        }
                        if(!flag) {
                            dirList.add(directory);
                        }
                    }
                }
            }
        }
        Paths paths = new Paths();
        paths.setSrcPath(rootPath);

        System.out.println("检测选手数量："+dirList.size());

        for(int i = 0;i < dirList.size();i++){
            paths.setP1Path(dirList.get(i).getPath());
            for(int j = i+1;j < dirList.size();j++){
//                if((i==119||j==119)) continue;
//                if(i<3||(i==3&&j<119)) continue;
                paths.setP2Path(dirList.get(j).getPath());
                    System.out.println("检测：");
                    System.out.println("选手一：" + i +"路径："+dirList.get(i).getPath());
                    System.out.println("选手二：" + j +"路径："+ dirList.get(j).getPath());
                    detectBetweenTwo(paths);
            }
        }

        long endDetectTime = System.currentTimeMillis();
        System.out.println("检测总耗时："+(endDetectTime-beginDetectTime)+"ms");

        outputAllPDF(dirList,subject);

        return Result.success().message("检测结果保存成功！");
    }

    /*
     * @Author duanding
     * @Description 两个选手之间检测
     * @Date 3:39 PM 2019/11/15
     * @Param [paths]
     * @return demo.common.Result
     **/
    @Override
    public Result detectBetweenTwo(Paths paths) {
        List<IndexDisplayVO> indexDisplayVOList = new ArrayList<>();
        String srcPath = paths.getSrcPath();
        String p1Path = paths.getP1Path();
        String p2Path = paths.getP2Path();
        double threshold = paths.getThreshold();
        List<MUTModel> mutModelList;
        String[] srcs = srcPath.split("/");
        String subject = "";
        if(srcs[srcs.length-1].equals("Province")) {
            subject = "AStar";
        }else if(srcs[srcs.length-2].equals("Datalog")){
            subject = srcs[srcs.length - 2];
        }else{
            subject = srcs[srcs.length - 1];
        }
        String[] p1s = p1Path.split("/");
        String[] p1LastContent = p1s[p1s.length-1].split("_");
        String cidStr1 = "1";
        if(p1Path.contains("junit")) {
            cidStr1 = p1LastContent[p1LastContent.length - 1];
        }else if(p1Path.contains("Province")){
            String temp = p1LastContent[0];
//            System.out.println("temp"+temp);
            int index = 0;
            if(temp.contains("AStar")) {
                index = temp.indexOf("A");
            }else if(temp.contains("TernaryTree")){
                index = temp.indexOf("T");
            }
            cidStr1 = temp.substring(0,index);
        }else{
            cidStr1 = p1LastContent[0];
        }
        int cid1 = Integer.parseInt(cidStr1);
        String[] p2s = p2Path.split("/");
        String[] p2LastContent = p2s[p2s.length-1].split("_");
        String cidStr2 = "2";
        if(p2Path.contains("junit")) {
            cidStr2 = p2LastContent[p2LastContent.length - 1];
        }else if(p2Path.contains("Province")){
            String temp = p2LastContent[0];
            int index = 0;
            if(temp.contains("AStar")) {
                index = temp.indexOf("A");
            }else if(temp.contains("TernaryTree")){
                index = temp.indexOf("T");
            }
            cidStr2 = temp.substring(0,index);
        }else{
            cidStr2 = p2LastContent[0];
        }
        int cid2 = Integer.parseInt(cidStr2);
        try {
            List<SimValueModel> simValueModelList = simValueModelDao.searchSimValueAllContentByPair(cid1, cid2,subject);
            if (simValueModelList.size() != 0) {
//                for (int i = 0; i < simValueModelList.size(); i++) {
//                    IndexDisplayVO indexDisplayVO = new IndexDisplayVO();
//                    indexDisplayVO.setMethodId(i + 1);
//                    SimValueModel simValueModel = simValueModelList.get(i);
//                    int mid = simValueModel.getMid();
//                    indexDisplayVO.setMethodName(mutModelDao.getMethodNameByMID(mid));
//
//                    indexDisplayVO.setTfid1(tfModelDao.getIdByMIDAndCid(mid, cid1));
//                    indexDisplayVO.setTfid2(tfModelDao.getIdByMIDAndCid(mid, cid2));
//
//                    double simValue = simValueModel.getSimValue();
//                    indexDisplayVO.setSimValue(simValue);
//                    if (simValue >= threshold * 100) {
//                        indexDisplayVO.setPlag(true);
//                    } else {
//                        indexDisplayVO.setPlag(false);
//                    }
//
//                    indexDisplayVOList.add(indexDisplayVO);
//                }
            } else {
                List<SimValueVO> resultList = new ArrayList<>();
                mutModelList = mutModelDao.getALLBySubejct(subject);
                if (mutModelList.size() == 0) {
                    mutModelList = PUTAnalysis.analyze(srcPath, subject);
                }
                for (MUTModel mutModel : mutModelList) {
                    MUTModel mutModelEntity = mutModelDao.save(mutModel);
                }

                List<TFModel> tfModelList1 = tfModelDao.getTFModelListByCid(cid1);
                if(tfModelList1.size() == 0) {
                    Map<Integer, List<ContestantTFModel>> tfMap1 = TPAnalysis.myAnalyze(mutModelList, p1Path);
                    saveTFToDB(tfMap1, subject);
                }
                List<TFModel> tfModelList2 = tfModelDao.getTFModelListByCid(cid2);
                if(tfModelList2.size() == 0) {
                    Map<Integer, List<ContestantTFModel>> tfMap2 = TPAnalysis.myAnalyze(mutModelList, p2Path);
//                    System.out.println("选手："+cid2+" 片段："+tfMap2.get(-2005394965));
                    saveTFToDB(tfMap2, subject);
                }

                // 计算测试片段之间相似度并存入数据库
                //两层list，第一层是不同的mid对应的选手之间相似度，第二层是某个mid（即某一个待测方法）里不同选手测该方法片段之间的相似度
                List<List<SimValueVO>> simValueList = tfAnalysisByTwo(mutModelList,subject,cid1,cid2);
                //11个list，每个里面一个元素


//                for (int i = 0; i < simValueList.size(); i++) {
//                        List<SimValueVO> list = simValueList.get(i);
//                        for (int j = 0; j < list.size(); j++) {
//                            SimValueVO simValueVO = list.get(j);
//                            if((simValueVO.getCid1() == cid1 && simValueVO.getCid2() == cid2)||
//                                    (simValueVO.getCid2() == cid1 && simValueVO.getCid1() == cid2)){
//                                IndexDisplayVO indexDisplayVO = new IndexDisplayVO();
//
//                                indexDisplayVO.setMethodId(i + 1);
//
//                                int mid = simValueVO.getMid();
//                                indexDisplayVO.setMethodName(mutModelDao.getMethodNameByMID(mid));
//
//                                indexDisplayVO.setTfid1(tfModelDao.getIdByMIDAndCid(mid, cid1));
//                                indexDisplayVO.setTfid2(tfModelDao.getIdByMIDAndCid(mid, cid2));
//
//                                double simValue = simValueVO.getSimValue();
//                                indexDisplayVO.setSimValue(simValue);
//                                if (simValue >= threshold * 100) {
//                                    indexDisplayVO.setPlag(true);
//                                } else {
//                                    indexDisplayVO.setPlag(false);
//                                }
//
//                                indexDisplayVOList.add(indexDisplayVO);
//                            }
//                        }
//                }
            }

//            List<Integer> MUTList = asList(-1185023915,738255133,1326593525,-373229334,955911267,-862597736,-699150091,-312350647,-1794624710,-1622325445,1985156826,-1466814440,-576060075,848030720,634542075,-119209151,1794288550,-1130370374,1029532411,-715073250,648303882,-2064526362,1540046353,997683594,-1965743371,-949293390,1421055235,-933063831,-1300706429,1450127482,-1135966537,1234382088,-92124590,802055090,921782765,-139073259,-723512252,-698809980,908918481,1957296140,-2041695313,137194604,-1787424067,-2027935236,-717360243,-1680305396	,561849238,896641703	,1027976968,8081654,-620252230,-620421252,-1215342824,-493494133,-1484881528);
//            pdfContent.setMutList(MUTList);
//            List<Integer> simlarityList1 = asList(0,64,65,79,79,81,81,0,0,53,0,0,0,0,0,0,0,0,0,0,0,0,0,50,58,0,0,0,56,62,0,0,0,0,0,0,0,0,0,0,6,67,0,0,64,64,57,60,57,0,0,0,0,0,0);
//            SimDetail simDetail = new SimDetail();
//            simDetail.setID(1);
//            simDetail.setCid1(cid1);
//            simDetail.setCid2(cid2);
//            simDetail.setSimilarityList(simlarityList1);
//            List<SimDetail> simDetailList = new ArrayList<>();
//            simDetailList.add(simDetail);
//            pdfContent.setSimDetailList(simDetailList);


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
     * @Description 生成检测所有选手的报告PDF
     * @Date 3:46 PM 2020/1/8
     * @Param [dirList, subject]
     * @return boolean
     **/
    public boolean outputAllPDF(List<File> dirList,String subject){
        List<Integer> players = new ArrayList<>();
        for(int i=0;i<dirList.size();i++){
            String path = dirList.get(i).getPath();
            String[] paths = path.split("/");
            String lastContent = paths[paths.length-1];
            String[] lastContents = lastContent.split("_");
            String cidStr = "";
            if(path.contains("Province")){
                int index = 0;
                if(lastContents[0].contains("AStar")) {
                    index = lastContents[0].indexOf("A");
                }else if(lastContents[0].contains("TernaryTree")){
                    index = lastContents[0].indexOf("T");
                }
                cidStr = lastContents[0].substring(0,index);
            }else{
                cidStr = lastContents[0];
            }
            Integer cid = Integer.parseInt(cidStr);
            players.add(cid);
        }
        PDFContent pdfContent = getPDFContentFromDB(players, threshold,subject);
        pdfContent.setSubject(subject);
        pdfContent.setPlayers(players);
        pdfContent.setThreshold(threshold);
        GeneratePDF generatePDF = new GeneratePDF();
        generatePDF.createPDF(pdfContent,true);
        return true;
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
        List<MUTModel> mutList = mutModelDao.getALLBySubejct(subject);
        pdfContent.setMutList(mutList);
        for(int i=0;i<players.size()-1;i++) {
            int cid1 = players.get(i);
            for (int j = i + 1; j < players.size(); j++) {
                int cid2 = players.get(j);
                List<SimValueModel> simValueList = simValueModelDao.searchSimValueAllContentByPair(cid1, cid2,subject);
                GeneralResult generalResult = new GeneralResult();
                SimDetail simDetail = new SimDetail();
                FragDetail fragDetail = new FragDetail();
                generalResult.setResultID(index);
                generalResult.setCid1(cid1);
                generalResult.setCid2(cid2);
                if (simValueList.size() != 0) {
                    Collections.sort(simValueList,simValueList.get(0));
                    Double maxSim = simValueList.get(0).getSimValue();
                    generalResult.setMaxSim(maxSim.intValue());
                    if (maxSim >= threshold * 100) {
                            generalResult.setPlag(true);
                            plgPairs++;
//                            System.out.println("plagPairs:"+plgPairs);
                        } else {
                            generalResult.setPlag(false);
                        }

                }else{
                    generalResult.setMaxSim(0);
                    generalResult.setPlag(false);
                }
                generalResultList.add(generalResult);
                index++;

                simDetail.setCid1(cid1);
                simDetail.setCid2(cid2);
                Map<Integer,Integer> similarityList = new HashMap<>();
                for(int k=0;k<mutList.size();k++){
                    MUTModel mutModel = mutList.get(k);
                    Integer mid = mutModel.getMethodId();
                }

                fragDetail.setCid1(cid1);
                fragDetail.setCid2(cid2);
            }
        }
        pdfContent.setPlagPairs(plgPairs);
        Collections.sort(generalResultList,generalResultList.get(0));
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

    /*
     * @Author duanding
     * @Description 只针对两个选手的测试片段分析
     * @Date 5:01 PM 2019/11/15
     * @Param [mutModelList, subject]
     * @return java.util.List<java.util.List<demo.vo.SimValueVO>>
     **/
    public List<List<SimValueVO>> tfAnalysisByTwo(List<MUTModel> mutModelList,String subject,int cid1,int cid2) {
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
        List<List<SimValueVO>> resultLists = calculateSimilarityBetweenTFByTwo(mIDArray, 1,subject,cid1,cid2);
        return resultLists;
    }


    public List<List<SimValueVO>> calculateSimilarityBetweenTF(int[] mIDArray, int category,String subject) {
        List<ContestantSimilarityByMID> contestantSimilarityByMIDList = new ArrayList<>(mIDArray.length);
        List<List<SimValueVO>> resultLists = new ArrayList<>();
        for (int mid : mIDArray) {
            if (mid == 0) {
                continue;
            }
            //针对TernaryTree的i=41的那个，跳过一些
//            if(mid == -1414274990||mid == -66085341||mid == 630826990){
//                continue;
//            }
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

    /*
     * @Author duanding
     * @Description 只针对两个选手之间的计算相似度
     * @Date 5:03 PM 2019/11/15
     * @Param [mIDArray, category, subject, cid1, cid2]
     * @return java.util.List<java.util.List<demo.vo.SimValueVO>>
     **/
    public List<List<SimValueVO>> calculateSimilarityBetweenTFByTwo(int[] mIDArray, int category,String subject,int cid1,int cid2) {
        List<ContestantSimilarityByMID> contestantSimilarityByMIDList = new ArrayList<>(mIDArray.length);
        List<List<SimValueVO>> resultLists = new ArrayList<>();
        for (int mid : mIDArray) {
            if (mid == 0) {
                continue;
            }
            int compareNumber = 0;
            System.out.println("MID：" + mid);
            ContestantSimilarityByMID contestantSimilarityByMID = new ContestantSimilarityByMID(mid);
            List<TFModel> tfModelList2 = tfModelDao.getTFModelListByMIDAndCid(mid,cid2);
            List<TFModel> tfModelList = tfModelDao.getTFModelListByMIDAndCid(mid,cid1);
            tfModelList.addAll(tfModelList2);
            if (tfModelList == null) {
                contestantSimilarityByMIDList.add(contestantSimilarityByMID);
                continue;
            }
            int count = tfModelList.size();
//            System.out.println("对比人数：" + count);
            if (count < 2) {
                contestantSimilarityByMIDList.add(contestantSimilarityByMID);
                continue;
            }
            long startTime=System.currentTimeMillis();
//            System.out.println("对比开始时间：" + startTime);
            List<ContestantSimilarity> contestantSimilarityList = new ArrayList<>(count);
            for (int index = 0; index < count; index++) {
                TFModel baseTFModel = tfModelList.get(index);
                int CID1 = baseTFModel.getCid();
//                System.out.println("CID1:"+CID1);
                ContestantSimilarity contestantSimilarity = new ContestantSimilarity(CID1);
                String baseTestFragment = baseTFModel.getFragment();
                if (baseTestFragment != null) {
                    List<TFSimilarityModel> tfSimilarityModelList = new ArrayList<>(count - index - 1);
                    for (int index1 = index + 1; index1 < count; index1++) {
                        TFModel tfModel = tfModelList.get(index1);
                        int CID2 = tfModel.getCid();
//                        System.out.println("CID2:"+CID2);
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
//            System.out.println("对比次数：" + compareNumber);
            long endTime=System.currentTimeMillis();
//            System.out.println("对比结束时间：" + endTime);
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
