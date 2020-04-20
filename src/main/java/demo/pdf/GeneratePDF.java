package demo.pdf;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import com.itextpdf.text.pdf.draw.LineSeparator;
import demo.entity.MUTModel;
import demo.po.FragDetail;
import demo.po.GeneralResult;
import demo.po.PDFContent;
import demo.po.SimDetail;
import demo.service.impl.TFServiceImpl;
import io.swagger.models.auth.In;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;

import static java.util.Arrays.asList;


public class GeneratePDF {
    private static Font headfont;// 设置字体大小
    private static Font keyfont;// 设置字体大小
    private static Font newkeyfont;// 设置矩阵标题字体大小
    private static Font chtextfont;// 设置中文字体
    private static Font entextfont;// 设置英文及数字字体
    private static Font newentextfont;// 设置矩阵英文及数字字体
    private static Font redenfont;//红色英文字体
    private static Font redchfont;//红色中文字体
    private static Font anchorfont;//跳转锚点字体
    int maxWidth = 520;
    static{
        BaseFont bfChinese;
        BaseFont bfEnglish;
        try {
            bfChinese = BaseFont.createFont("STSong-Light","UniGB-UCS2-H",BaseFont.NOT_EMBEDDED);
            bfEnglish = BaseFont.createFont();
            headfont = new Font(bfChinese, 14, Font.BOLD);
            keyfont = new Font(bfChinese, 12, Font.BOLD,BaseColor.WHITE);
            newkeyfont = new Font(bfChinese, 5, Font.BOLD,BaseColor.WHITE);
            chtextfont = new Font(bfChinese, 12, Font.NORMAL);
            entextfont = new Font(bfEnglish,12,Font.NORMAL);
            newentextfont = new Font(bfEnglish,4,Font.NORMAL);
            redenfont = new Font(bfEnglish,12,Font.NORMAL);
            redenfont.setColor(BaseColor.RED);
            redchfont = new Font(bfChinese,12,Font.NORMAL);
            redchfont.setColor(BaseColor.RED);
            anchorfont = new Font(bfChinese,12,Font.UNDERLINE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
//        try {
//            Document document = new Document();
//            PdfWriter.getInstance(document, new FileOutputStream("/Users/dd/Desktop/Helloworld.PDF"));
//            document.addTitle("测试脚本相似度检测报告");
//            document.open();
//            document.add(new Paragraph("Hello World"));
//            Chunk chunk1 = new Chunk("This text is underlined", FontFactory.getFont(FontFactory.HELVETICA, 12, Font.UNDERLINE));
//            Phrase phrase = new Phrase();
//            phrase.add(chunk1);
//            document.add(phrase);
//            BaseFont bfChinese = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
//            Font FontChinese = new Font(bfChinese, 12, Font.NORMAL);
//            Paragraph paragraph=new Paragraph("你好", FontChinese);
//            document.add(paragraph);
//            document.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (DocumentException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        GeneratePDF generatePDF = new GeneratePDF();
        PDFContent pdfContent = new PDFContent();
        pdfContent.setSubject("Tarjan");
        List<Integer> players = new ArrayList<>();
        players.add(19229);
        players.add(2843);
        players.add(12976);
        players.add(20636);
        players.add(15089);
        pdfContent.setPlayers(players);
        pdfContent.setThreshold(0.8);
        pdfContent.setPlagPairs(2);
        GeneralResult generalResult1 = new GeneralResult(1,19229,2843,91,true);
        GeneralResult generalResult2 = new GeneralResult(2,2843,12976,80,true);
        GeneralResult generalResult3 = new GeneralResult(3,19229,12976,69,false);
        GeneralResult generalResult4 = new GeneralResult(4,12976,20636,67,false);
        GeneralResult generalResult5 = new GeneralResult(5,2843,20636,62,false);
        GeneralResult generalResult6 = new GeneralResult(6,19229,20636,59,false);
        GeneralResult generalResult7 = new GeneralResult(7,15089,20636,54,false);
        GeneralResult generalResult8 = new GeneralResult(8,12976,15089,53,false);
        GeneralResult generalResult9 = new GeneralResult(9,19229,15089,51,false);
        GeneralResult generalResult10 = new GeneralResult(10,2843,15089,50,false);
        List<GeneralResult> generalResults = new ArrayList<>();
        generalResults.add(generalResult1);
        generalResults.add(generalResult2);
        generalResults.add(generalResult3);
        generalResults.add(generalResult4);
        generalResults.add(generalResult5);
        generalResults.add(generalResult6);
        generalResults.add(generalResult7);
        generalResults.add(generalResult8);
        generalResults.add(generalResult9);
        generalResults.add(generalResult10);
        pdfContent.setResultList(generalResults);
        List<Integer> MUTList = asList(-1185023915,738255133,1326593525,-373229334,955911267,-862597736,-699150091,-312350647,-1794624710,-1622325445,1985156826,-1466814440,-576060075,848030720,634542075,-119209151,1794288550,-1130370374,1029532411,-715073250,648303882,-2064526362,1540046353,997683594,-1965743371,-949293390,1421055235,-933063831,-1300706429,1450127482,-1135966537,1234382088,-92124590,802055090,921782765,-139073259,-723512252,-698809980,908918481,1957296140,-2041695313,137194604,-1787424067,-2027935236,-717360243,-1680305396	,561849238,896641703	,1027976968,8081654,-620252230,-620421252,-1215342824,-493494133,-1484881528);
//        pdfContent.setMutList(MUTList);
        List<Integer> simlarityList1 = asList(0,64,65,79,79,81,81,0,0,53,0,0,0,0,0,0,0,0,0,0,0,0,0,50,58,0,0,0,56,62,0,0,0,0,0,0,0,0,0,0,6,67,0,0,64,64,57,60,57,0,0,0,0,0,0);
        SimDetail simDetail = new SimDetail();
        simDetail.setID(1);
        simDetail.setCid1(1);
        simDetail.setCid2(2);
//        simDetail.setSimilarityList(simlarityList1);
        List<SimDetail> simDetailList = new ArrayList<>();
        simDetailList.add(simDetail);
        pdfContent.setSimDetailList(simDetailList);
        generatePDF.createPDF(pdfContent,false);
    }

    /*
     * @Author duanding
     * @Description 生成PDF
     * @Date 4:27 PM 2020/1/8
     * @Param [pdfContent, isAll:是否是全部选手]
     * @return boolean
     **/
    public boolean createPDF(PDFContent pdfContent,boolean isAll){
        try {
            Document document = new Document();
            PdfPTableEvent event = new AlternatingBackground();
            Date currentTime = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString = formatter.format(currentTime);
            SimpleDateFormat formatter2 = new SimpleDateFormat("yyyyMMddHHmmssSSS");
            String dateID = formatter2.format(currentTime);
            PdfWriter.getInstance(document, new FileOutputStream("/Users/dd/Desktop/report"+dateID+".pdf"));
            document.addTitle("测试脚本相似度检测报告");
            document.open();
            BaseFont bfChinese = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
            Font FontChinese = new Font(bfChinese, 12, Font.NORMAL);

            Font titleFont = new Font(bfChinese, 23, Font.BOLD);
            Paragraph title = new Paragraph("测试脚本相似度检测报告",titleFont);
            title.setAlignment(1);
            document.add(title);

            //添加内部锚点
//            Anchor anchor2 = new Anchor("innter", FontFactory.getFont(FontFactory.HELVETICA, 12, Font.UNDERLINE, BaseColor.BLUE));
//            anchor2.setReference("#string");
//            //设置锚点的名称（用户在使用内部锚点时定位的地方）
//            anchor2.setName("inner");
//            document.add(anchor2);


            document.add(new Paragraph("\n"));

            LineSeparator line = new LineSeparator(2f,100,new BaseColor(169,169,169),Element.ALIGN_CENTER,1f);
            document.add(line);

            PdfPTable NoAndTime = createTwoParallel("","No: "+dateID,Element.ALIGN_LEFT,"检测时间：",dateString,Element.ALIGN_RIGHT);
            document.add(NoAndTime);

            String subjectStr = pdfContent.getSubject();
            Paragraph subject = new Paragraph(titleChineseStrEnglish("题目：",subjectStr));
            List<Integer> playerIDs = pdfContent.getPlayers();
            String playerStr = "";
            Paragraph players;
            if(isAll){
                playerStr = playerIDs.size()+"";
                players = new Paragraph(titleChineseStrEnglish("检测选手范围：全部选手 共计：",playerStr));
            }else {
//                playerStr = generatePlayerStr(playerIDs);
//                players = new Paragraph(titleChineseStrEnglish("检测选手范围：",playerStr));
                players = new Paragraph(titleChineseStrEnglish("检测选手范围：","19229,2843,12976,20636,15089"));
            }
            String threStr = pdfContent.getThreshold()*100+"%";
            Paragraph threshold = new Paragraph(titleChineseStrEnglish("相似度阈值：",threStr));
            subject.setIndentationLeft(23);
            players.setIndentationLeft(23);
            threshold.setIndentationLeft(23);
            subject.setLeading(23);
            players.setLeading(23);
            threshold.setLeading(23);
            document.add(subject);
            document.add(players);
            document.add(threshold);

            document.add(new Paragraph("\n"));
            document.add(line);
            Font FontChinese2 = new Font(bfChinese, 16, Font.BOLD);
            Paragraph result = new Paragraph("检测结果",FontChinese2);
            document.add(result);
            document.add(new Paragraph("\n"));

            int playerNum = playerIDs.size();
            int totalPairs = playerNum * (playerNum-1) / 2;
            int plagPairs = pdfContent.getPlagPairs();
            PdfPTable totalAndPlag = createTwoParallel("共检测选手对：",""+totalPairs,Element.ALIGN_CENTER,"抄袭选手对：",""+plagPairs,Element.ALIGN_CENTER);
            document.add(totalAndPlag);

            document.add(new Paragraph("\n"));

            int index = 0;
            List<GeneralResult> generalResults = pdfContent.getResultList();
            while(index<generalResults.size()){
                if(index+100<generalResults.size()) {
                    generateMainPartFromBeginToEnd(pdfContent, document, index, index + 100);
                }else{
                    generateMainPartFromBeginToEnd(pdfContent, document, index, generalResults.size());
                }
                index = index+100;
            }
            document.add(new Paragraph("选手对：<19229,2843>",chtextfont));
            document.add(new Paragraph("\n"));

            PdfPTable detail1 = createTable(2);
            detail1.addCell(createCell("Value value1=new Value(\"value\"); \n" +
                    "Argument argument1=Argument.value(value1); \n" +
                    "Datalog dl1 = new Datalog(pd1,ags1); \n" +
                    "Predicate pd1 = new Predicate(\\\"test0001\\\"); \n" +
                    "Argument[] ags1 = {ag1,ag2}; \n" +
                    "assertNotNull(dl1.getPredicate())",entextfont,Element.ALIGN_LEFT));
            detail1.addCell(createCell("Value value1=new Value(\\\"va\\\"); \n" +
                    "Argument argument1=Argument.value(va); \n" +
                    "Datalog dl1 = new Datalog(p1,a1); \n" +
                    "Predicate pd1 = new Predicate(\\\"t1\\\") \n" +
                    "Argument[] ags1 = {a1,a2}; \n" +
                    "assertNotNull(dl1.getPredicate());",entextfont,Element.ALIGN_LEFT));
            document.add(detail1);

            document.add(new Paragraph("\n"));
            document.add(new Paragraph("\n"));
            document.add(new Paragraph("\n"));
            document.add(new Paragraph("\n"));



            document.add(new Paragraph("选手对：<2843,12976>",chtextfont));
            document.add(new Paragraph("\n"));

            PdfPTable detail2 = createTable(2);
            detail2.addCell(createCell("Datalog dl1 = new Datalog(pd1,ags1);\n"+
                    "Predicate pd1 = new Predicate(\"test0001\");\n"+
                    "Argument[] ags1 = {ag1,ag2};\n"+
                    "assertNotNull(dl1.getPredicate());",entextfont,Element.ALIGN_LEFT));
            detail2.addCell(createCell("Datalog dl1 = new Datalog(p1,a1);\n"+
                    "Predicate pd1 = new Predicate(\"t1\");\n"+
                    "Argument[] ags1 = {a1,a2};\n"+
                    "assertNotNull(dl1.getPredicate());",entextfont,Element.ALIGN_LEFT));
            document.add(detail2);

            document.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }

    /*
     * @Author duanding
     * @Description 分段展示pdf主要内容
     * @Date 11:06 AM 2020/1/18
     * @Param [pdfContent, document, begin, end]
     * @return boolean
     **/
    public boolean generateMainPartFromBeginToEnd(PDFContent pdfContent,Document document,int begin,int end){
        try {
            PdfPTableEvent event = new AlternatingBackground();
            LineSeparator line = new LineSeparator(2f,100,new BaseColor(169,169,169),Element.ALIGN_CENTER,1f);
            List<GeneralResult> generalResults = pdfContent.getResultList();
            PdfPTable table = createTable(5);
    //            table.addCell(createCell("序号", keyfont,Element.ALIGN_LEFT,4,false));

            Chunk maxSimTitle = new Chunk("最大相似度", keyfont);
    //            Anchor anchorMore = new Anchor("-", keyfont);
    //            anchorMore.setReference("#moreDetail");
            //设置锚点的名称（用户在使用内部锚点时定位的地方）
    //            anchorMore.setName("more");
            Phrase phraseSim = new Phrase();
            phraseSim.add(maxSimTitle);
    //            phraseSim.add(anchorMore);

            table.addCell(createFixedCell("序号", keyfont, Element.ALIGN_CENTER));
            table.addCell(createFixedCell("选手ID对", keyfont, Element.ALIGN_CENTER));
            table.addCell(createCell(phraseSim, Element.ALIGN_CENTER));
            table.addCell(createFixedCell("是否抄袭", keyfont, Element.ALIGN_CENTER));
            table.addCell(createFixedCell("详情信息", keyfont, Element.ALIGN_CENTER));

            for(int i=begin;i<end;i++){
                GeneralResult generalResult = generalResults.get(i);
                table.addCell(createCell(generalResult.getResultID()+"", entextfont));
                table.addCell(createCell("<"+generalResult.getCid1()+","+generalResult.getCid2()+">", entextfont));
                int maxSim = generalResult.getMaxSim();
                if(maxSim >= pdfContent.getThreshold()*100){
                    table.addCell(createAnchoredCell(maxSim + "%", redenfont,Element.ALIGN_CENTER,"#moreDetail","more"));
                }else {
                    table.addCell(createAnchoredCell(maxSim + "%", entextfont,Element.ALIGN_CENTER,"#moreDetail","more"));
                }
                if(generalResult.isPlag()) {
                    table.addCell(createCell("是", redchfont));
                }else{
                    table.addCell(createCell("否", chtextfont));
                }
                table.addCell(createAnchoredCell("详情", anchorfont,Element.ALIGN_CENTER,"#moreDetail","more"));
            }
            table.setTableEvent(event);

                document.add(table);


            document.add(new Paragraph("\n"));
            document.add(line);
            Anchor anchorMoreDetail = new Anchor("详细相似度矩阵", headfont);
            anchorMoreDetail.setReference("#more");
            //设置锚点的名称（用户在使用内部锚点时定位的地方）
            anchorMoreDetail.setName("moreDetail");
    //            Paragraph anchorMoreDetailPara = new Paragraph(anchorMoreDetail);
            document.add(anchorMoreDetail);
            document.add(new Paragraph("\n",chtextfont));



//                PdfPTable simMatrix = createTable(57);
//                simMatrix.addCell(createCell("序号",newkeyfont,Element.ALIGN_CENTER));
//                simMatrix.addCell(createCell("选手ID对", newkeyfont, Element.ALIGN_CENTER));
//                List<Integer> MUTList = pdfContent.getMutList();
//                for(int i=0;i<MUTList.size();i++){
//                    simMatrix.addCell(createCell("方法"+(i+1),newkeyfont,Element.ALIGN_CENTER));
//                }
//                List<SimDetail> simDetailList = pdfContent.getSimDetailList();
//                for(int i=0;i<simDetailList.size();i++){
//                    SimDetail simDetail = simDetailList.get(i);
//                    simMatrix.addCell(createCell(""+simDetail.getID(),newentextfont,Element.ALIGN_CENTER));
//                    simMatrix.addCell(createCell("<"+simDetail.getCid1()+","+simDetail.getCid2()+">", newentextfont));
//                    List<Integer> simlarityList = simDetail.getSimilarityList();
//                    for(int j=0;j<simlarityList.size();j++){
//                        simMatrix.addCell(createCell(simlarityList.get(j)+"",newentextfont));
//                    }
//                }

//                simMatrix.setTableEvent(event);
//                document.add(simMatrix);


//            List<MUTModel> mutModelList = pdfContent.getMutList();
//            Set<String> classNameSet = new HashSet<>();
//            for(MUTModel mutModel:mutModelList){
//                classNameSet.add(mutModel.getClassName());
//            }
//            List<List<MUTModel>> newMUTModelList = new ArrayList<>();
//            for(String className:classNameSet){
//    //                System.out.println(className);
//                List<MUTModel> mutOfOneClassList = new ArrayList<>();
//                for(MUTModel mutModel:mutModelList){
//                    if(mutModel.getClassName().equals(className)){
//                        mutOfOneClassList.add(mutModel);
//    //                        mutModelList.remove(mutModel);
//                    }
//                }
//                newMUTModelList.add(mutOfOneClassList);
//            }
//    //            for(List<MUTModel> list:newMUTModelList){
//    //                for(MUTModel mutModel:list){
//    //                    System.out.println("className: "+mutModel.getClassName());
//    //                    System.out.println("methodName: "+mutModel.getMethodName());
//    //                }
//    //            }
//            List<SimDetail> simDetailList = pdfContent.getSimDetailList();
//            for(int i=begin;i<end;i++){
//                SimDetail simDetail = simDetailList.get(i);
//                int cid1 = simDetail.getCid1();
//                int cid2 = simDetail.getCid2();
//                document.add(new Paragraph("选手对：<"+cid1+","+cid2+">",chtextfont));
//                document.add(new Paragraph("\n"));
//
//                Map<Integer,Double> similarityMap = simDetail.getSimilarityMap();
//                for(List<MUTModel> listOfOneClassName: newMUTModelList){
//                    String className = listOfOneClassName.get(0).getClassName();
//                    PdfPTable simMatrix = createTable(listOfOneClassName.size()+1);
//                    simMatrix.addCell(createCell("类名",keyfont,Element.ALIGN_CENTER));
//                    PdfPCell cell=createCell(className,keyfont,Element.ALIGN_CENTER);
//                    cell.setColspan(listOfOneClassName.size());
//                    simMatrix.addCell(cell);
//
//                    simMatrix.addCell(createCell("方法名",chtextfont,Element.ALIGN_CENTER));
//                    for(int j=0;j<listOfOneClassName.size();j++){
//                        simMatrix.addCell(createCell(listOfOneClassName.get(j).getMethodName(),entextfont,Element.ALIGN_CENTER));
//                    }
//
//                    simMatrix.addCell(createCell("相似度",chtextfont,Element.ALIGN_CENTER));
//                    for(int j=0;j<listOfOneClassName.size();j++){
//                        int mid = listOfOneClassName.get(j).getMethodId();
//                        double sim = 0.0;
//                        if(null!=similarityMap.get(mid)){
//                            sim = similarityMap.get(mid);
//                        }
//                        simMatrix.addCell(createAnchoredCell(sim+"%",entextfont,Element.ALIGN_CENTER,"#fragDetail","sim"));
//                    }
//                    simMatrix.setTableEvent(event);
//                    document.add(simMatrix);
//                }
//                document.add(new Paragraph("\n"));
//                document.add(line);
//                document.add(new Paragraph("\n"));
//            }




                document.add(new Paragraph("选手对：<19229,2843>",chtextfont));
                document.add(new Paragraph("\n"));
                PdfPTable simMatrix1 = createTable(9);

                simMatrix1.addCell(createCell("类名",keyfont,Element.ALIGN_CENTER));
                PdfPCell cell1=createCell("Argument",keyfont,Element.ALIGN_CENTER);
                cell1.setColspan(8);
                simMatrix1.addCell(cell1);

                simMatrix1.addCell(createCell("方法名",chtextfont,Element.ALIGN_CENTER));
                simMatrix1.addCell(createCell("Argument",entextfont,Element.ALIGN_CENTER));
                simMatrix1.addCell(createCell("value",entextfont,Element.ALIGN_CENTER));
                simMatrix1.addCell(createCell("variable",entextfont,Element.ALIGN_CENTER));
                simMatrix1.addCell(createCell("getValue",entextfont,Element.ALIGN_CENTER));
                simMatrix1.addCell(createCell("getVariable",entextfont,Element.ALIGN_CENTER));
                simMatrix1.addCell(createCell("isValue",entextfont,Element.ALIGN_CENTER));
                simMatrix1.addCell(createCell("isVariable",entextfont,Element.ALIGN_CENTER));
                simMatrix1.addCell(createCell("toString",entextfont,Element.ALIGN_CENTER));
                simMatrix1.addCell(createCell("相似度",chtextfont,Element.ALIGN_CENTER));
                simMatrix1.addCell(createAnchoredCell("0%",entextfont,Element.ALIGN_CENTER,"#fragDetail","sim"));
                simMatrix1.addCell(createAnchoredCell("91%",entextfont,Element.ALIGN_CENTER,"#fragDetail","sim"));
                simMatrix1.addCell(createAnchoredCell("69%",entextfont,Element.ALIGN_CENTER,"#fragDetail","sim"));
                simMatrix1.addCell(createAnchoredCell("78%",entextfont,Element.ALIGN_CENTER,"#fragDetail","sim"));
                simMatrix1.addCell(createAnchoredCell("71%",entextfont,Element.ALIGN_CENTER,"#fragDetail","sim"));
                simMatrix1.addCell(createAnchoredCell("58%",entextfont,Element.ALIGN_CENTER,"#fragDetail","sim"));
                simMatrix1.addCell(createAnchoredCell("77%",entextfont,Element.ALIGN_CENTER,"#fragDetail","sim"));
                simMatrix1.addCell(createAnchoredCell("74%",entextfont,Element.ALIGN_CENTER,"#fragDetail","sim"));
                simMatrix1.setTableEvent(event);
                document.add(simMatrix1);

            document.add(new Paragraph("\n"));
            document.add(new Paragraph("\n"));
            document.add(new Paragraph("\n"));
            document.add(new Paragraph("\n"));
            document.add(new Paragraph("\n"));
            document.add(new Paragraph("\n"));


            document.add(new Paragraph("选手对：<2843,12976>",chtextfont));
                document.add(new Paragraph("\n"));
                PdfPTable simMatrix2 = createTable(9);

                simMatrix2.addCell(createCell("类名",keyfont,Element.ALIGN_CENTER));
                PdfPCell cell2=createCell("Argument",keyfont,Element.ALIGN_CENTER);
                cell2.setColspan(8);
                simMatrix2.addCell(cell2);

                simMatrix2.addCell(createCell("方法名",chtextfont,Element.ALIGN_CENTER));
                simMatrix2.addCell(createCell("Argument",entextfont,Element.ALIGN_CENTER));
                simMatrix2.addCell(createCell("value",entextfont,Element.ALIGN_CENTER));
                simMatrix2.addCell(createCell("variable",entextfont,Element.ALIGN_CENTER));
                simMatrix2.addCell(createCell("getValue",entextfont,Element.ALIGN_CENTER));
                simMatrix2.addCell(createCell("getVariable",entextfont,Element.ALIGN_CENTER));
                simMatrix2.addCell(createCell("isValue",entextfont,Element.ALIGN_CENTER));
                simMatrix2.addCell(createCell("isVariable",entextfont,Element.ALIGN_CENTER));
                simMatrix2.addCell(createCell("toString",entextfont,Element.ALIGN_CENTER));
                simMatrix2.addCell(createCell("相似度",chtextfont,Element.ALIGN_CENTER));
                simMatrix2.addCell(createAnchoredCell("0%",entextfont,Element.ALIGN_CENTER,"#fragDetail","sim"));
                simMatrix2.addCell(createAnchoredCell("66%",entextfont,Element.ALIGN_CENTER,"#fragDetail","sim"));
                simMatrix2.addCell(createAnchoredCell("64%",entextfont,Element.ALIGN_CENTER,"#fragDetail","sim"));
                simMatrix2.addCell(createAnchoredCell("73%",entextfont,Element.ALIGN_CENTER,"#fragDetail","sim"));
                simMatrix2.addCell(createAnchoredCell("71%",entextfont,Element.ALIGN_CENTER,"#fragDetail","sim"));
                simMatrix2.addCell(createAnchoredCell("58%",entextfont,Element.ALIGN_CENTER,"#fragDetail","sim"));
                simMatrix2.addCell(createAnchoredCell("67%",entextfont,Element.ALIGN_CENTER,"#fragDetail","sim"));
                simMatrix2.addCell(createAnchoredCell("64%",entextfont,Element.ALIGN_CENTER,"#fragDetail","sim"));
                simMatrix2.setTableEvent(event);
                document.add(simMatrix2);

            Anchor frag = new Anchor("片段详情", headfont);
            frag.setReference("#sim");
            //设置锚点的名称（用户在使用内部锚点时定位的地方）
            frag.setName("fragDetail");
            document.add(frag);
            document.add(new Paragraph("\n",chtextfont));

//            List<FragDetail> fragDetailList = pdfContent.getFragDetailList();
//            for(int i=begin;i<end;i++){
//                FragDetail fragDetail = fragDetailList.get(i);
//                int cid1 = fragDetail.getCid1();
//                int cid2 = fragDetail.getCid2();
//                document.add(new Paragraph("选手对：<"+cid1+","+cid2+">",chtextfont));
//                document.add(new Paragraph("\n"));
//
//                Map<Integer,List<String>> fragmentMap = fragDetail.getFragmentMap();
//                for(List<String> frags:fragmentMap.values()){
//                    if(frags.size()>1) {
//                        PdfPTable detail = createTable(2);
//                        for (int j=0;j<frags.size();j++){
//                            String fragStr = frags.get(j);
//                            String[] splits = fragStr.split(";");
//                            String newFragStr = "";
//                            for(int k=0;k<splits.length;k++){
//                                newFragStr += splits[k].trim();
//                                if(k!=splits.length-1){
//                                    newFragStr += "\n";
//                                }
//                            }
//                            detail.addCell(createCell(newFragStr,entextfont,Element.ALIGN_LEFT));
//                        }
//                        document.add(detail);
//                    }
//                }
//                document.add(new Paragraph("\n"));
//                document.add(line);
//                document.add(new Paragraph("\n"));
//            }
        } catch (DocumentException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    /*
     * @Author duanding
     * @Description 创建表格单元格，高度不固定
     * @Date 5:35 PM 2020/1/8
     * @Param [value, font, align]
     * @return com.itextpdf.text.pdf.PdfPCell
     **/
    public PdfPCell createCell(String value, Font font, int align){
        PdfPCell cell = new PdfPCell();
//        cell.setPadding(2);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell.setHorizontalAlignment(align);
        cell.setPhrase(new Phrase(value,font));
        return cell;
    }

    /*
     * @Author duanding
     * @Description 创建表格的单元格，包括设置水平格式,设置固定高度
     * @Date 2:04 PM 2019/11/8
     * @Param [value, font, align]
     * @return com.itextpdf.text.pdf.PdfPCell
     **/
    public PdfPCell createFixedCell(String value, Font font, int align){
        PdfPCell cell = new PdfPCell();
//        cell.setPadding(2);
        cell.setFixedHeight(25f);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell.setHorizontalAlignment(align);
        cell.setPhrase(new Phrase(value,font));
        return cell;
    }

    /*
     * @Author duanding
     * @Description 创建带跳转的cell
     * @Date 4:35 PM 2019/12/30
     * @Param [value, font, align]
     * @return com.itextpdf.text.pdf.PdfPCell
     **/
    public PdfPCell createAnchoredCell(String value, Font font, int align,String anchorRef,String anchorName){
        PdfPCell cell = new PdfPCell();
//        cell.setPadding(2);
        cell.setFixedHeight(25f);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell.setHorizontalAlignment(align);
        Anchor anchorFrag = new Anchor(value, font);
        anchorFrag.setReference(anchorRef);
        //设置锚点的名称（用户在使用内部锚点时定位的地方）
        anchorFrag.setName(anchorName);
        Phrase phraseSim = new Phrase();
        phraseSim.add(anchorFrag);
        cell.setPhrase(phraseSim);
        return cell;
    }

    /*
     * @Author duanding
     * @Description 创建表格单元格,根据内容value
     * @Date 2:07 PM 2019/11/8
     * @Param [value, font]
     * @return com.itextpdf.text.pdf.PdfPCell
     **/
    public PdfPCell createCell(String value,Font font){
        PdfPCell cell = new PdfPCell();
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setPhrase(new Phrase(value,font));
        return cell;
    }

    /*
     * @Author duanding
     * @Description 创建表格单元格，直接放phrase
     * @Date 10:02 AM 2019/11/14
     * @Param [phrase, align]
     * @return com.itextpdf.text.pdf.PdfPCell
     **/
    public PdfPCell createCell(Phrase phrase,int align){
        PdfPCell cell = new PdfPCell();
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell.setHorizontalAlignment(align);
        cell.setPhrase(phrase);
        return cell;
    }

    public PdfPCell createCell(String value,Font font,int align,int colspan){
        PdfPCell cell = new PdfPCell();
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell.setHorizontalAlignment(align);
        cell.setColspan(colspan);
        cell.setPhrase(new Phrase(value,font));
        return cell;
    }
    public PdfPCell createCell(String value,Font font,int align,int colspan,boolean boderFlag){
        PdfPCell cell = new PdfPCell();
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell.setHorizontalAlignment(align);
        cell.setColspan(colspan);
        cell.setPhrase(new Phrase(value,font));
        cell.setPadding(3.0f);
        if(!boderFlag){
            cell.setBorder(0);
            cell.setPaddingTop(15.0f);
            cell.setPaddingBottom(8.0f);
        }
        return cell;
    }

    /*
     * @Author duanding
     * @Description 创建表格，设置列数
     * @Date 2:09 PM 2019/11/8
     * @Param [colNumber]
     * @return com.itextpdf.text.pdf.PdfPTable
     **/
    public PdfPTable createTable(int colNumber){
        PdfPTable table = new PdfPTable(colNumber);
        try{
            table.setTotalWidth(maxWidth);
            table.setLockedWidth(true);
            table.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.getDefaultCell().setBorder(1);
        }catch(Exception e){
            e.printStackTrace();
        }
        return table;
    }

    public PdfPTable createTable(float[] widths){
        PdfPTable table = new PdfPTable(widths);
        try{
            table.setTotalWidth(maxWidth);
            table.setLockedWidth(true);
            table.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.getDefaultCell().setBorder(1);
        }catch(Exception e){
            e.printStackTrace();
        }
        return table;
    }

    /*
     * @Author duanding
     * @Description 创建空表
     * @Date 2:11 PM 2019/11/8
     * @Param []
     * @return com.itextpdf.text.pdf.PdfPTable
     **/
    public PdfPTable createBlankTable(){
        PdfPTable table = new PdfPTable(1);
        table.getDefaultCell().setBorder(0);
        table.addCell(createCell("", keyfont));
        table.setSpacingAfter(20.0f);
        table.setSpacingBefore(20.0f);
        return table;
    }

    /*
     * @Author duanding
     * @Description 创建两个并排内容
     * @Date 2:11 PM 2019/11/8
     * @Param [leftTitle, leftStr, leftAlignment, rightTitle, rightStr, rightAlignment]
     * @return com.itextpdf.text.pdf.PdfPTable
     **/
    public PdfPTable createTwoParallel(String leftTitle,String leftStr,int leftAlignment,String rightTitle,String rightStr,int rightAlignment){
        PdfPTable tbl = new PdfPTable(2);
        tbl.setTotalWidth(maxWidth);
        tbl.setLockedWidth(true);
        Phrase leftPhrase = titleChineseStrEnglish(leftTitle,leftStr);
        PdfPCell cell = new PdfPCell(leftPhrase);
        cell.setHorizontalAlignment(leftAlignment);
        cell.disableBorderSide(Rectangle.BOX);
        tbl.addCell(cell);
        Phrase rightPhrase = titleChineseStrEnglish(rightTitle,rightStr);
        cell = new PdfPCell(rightPhrase);
        cell.setHorizontalAlignment(rightAlignment);
        cell.disableBorderSide(Rectangle.BOX);
        tbl.addCell(cell);

        return tbl;
    }
    
    /*
     * @Author duanding
     * @Description 标示是中文字体，内容是英文字体
     * @Date 2:51 PM 2019/11/6
     * @Param []
     * @return com.itextpdf.text.Phrase
     **/
    public Phrase titleChineseStrEnglish(String title,String str){
        Chunk leftTitleChunk = new Chunk(title,chtextfont);
        Chunk leftStrChunk = new Chunk(str,entextfont);
//        System.out.println(str);
//        System.out.println(entextfont);
//        System.out.println(leftStrChunk);
        Phrase phrase = new Phrase();
        phrase.add(leftTitleChunk);
        phrase.add(leftStrChunk);
        return phrase;
    }

    /*
     * @Author duanding
     * @Description 生成选手范围的字符串
     * @Date 9:41 AM 2019/11/8
     * @Param [playerIDs]
     * @return java.lang.String
     **/
    public String generatePlayerStr(List<Integer> playerIDs){
        int begin = 0;
        int end = 0;
        String result = ""+playerIDs.get(begin);
        if(playerIDs.size() > 1) {
            for (int i = 1; i < playerIDs.size(); i++) {
                int playerID = playerIDs.get(i);
                if (playerID - playerIDs.get(end) > 1) {
                    String temp = "";
                    if(end != begin){
                        temp += " - "+playerIDs.get(end);
                    }
                    temp += ","+playerID;
                    result += temp;
                    begin = end = i;
                }else{
                    end = i;
                    if(i == playerIDs.size()-1){
                        result += " - "+playerIDs.get(end);
                    }
                }

            }
        }
        return result;
    }
}
