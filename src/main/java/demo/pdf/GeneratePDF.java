package demo.pdf;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import com.itextpdf.text.pdf.draw.LineSeparator;
import demo.po.GeneralResult;
import demo.po.PDFContent;
import demo.po.SimDetail;
import demo.service.impl.TFServiceImpl;
import io.swagger.models.auth.In;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
            anchorfont = new Font(bfChinese,12,Font.UNDEFINED);
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
        pdfContent.setSubject("Datalog");
        List<Integer> players = new ArrayList<>();
        players.add(1);
        players.add(2);
        players.add(3);
        players.add(4);
        players.add(5);
        pdfContent.setPlayers(players);
        pdfContent.setThreshold(0.8);
        pdfContent.setPlagPairs(5);
        GeneralResult generalResult1 = new GeneralResult(1,1,2,100,true);
        GeneralResult generalResult2 = new GeneralResult(2,1,3,96,true);
        GeneralResult generalResult3 = new GeneralResult(3,1,4,93,true);
        GeneralResult generalResult4 = new GeneralResult(4,1,5,91,true);
        GeneralResult generalResult5 = new GeneralResult(5,2,3,86,true);
        GeneralResult generalResult6 = new GeneralResult(6,2,4,79,false);
        GeneralResult generalResult7 = new GeneralResult(7,2,5,77,false);
        GeneralResult generalResult8 = new GeneralResult(8,3,4,65,false);
        GeneralResult generalResult9 = new GeneralResult(9,3,5,62,false);
        GeneralResult generalResult10 = new GeneralResult(10,4,5,48,false);
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
        pdfContent.setMutList(MUTList);
        List<Integer> simlarityList1 = asList(0,64,65,79,79,81,81,0,0,53,0,0,0,0,0,0,0,0,0,0,0,0,0,50,58,0,0,0,56,62,0,0,0,0,0,0,0,0,0,0,6,67,0,0,64,64,57,60,57,0,0,0,0,0,0);
        SimDetail simDetail = new SimDetail();
        simDetail.setID(1);
        simDetail.setCid1(1);
        simDetail.setCid2(2);
        simDetail.setSimilarityList(simlarityList1);
        List<SimDetail> simDetailList = new ArrayList<>();
        simDetailList.add(simDetail);
        pdfContent.setSimDetailList(simDetailList);
        generatePDF.createPDF(pdfContent);
    }

    /*
     * @Author duanding
     * @Description 生成PDF
     * @Date 2:02 PM 2019/11/8
     * @Param [pdfContent]
     * @return boolean
     **/
    public boolean createPDF(PDFContent pdfContent){
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
//            document.add(new Paragraph("\n"));


            PdfPTable NoAndTime = createTwoParallel("","No: "+dateID,Element.ALIGN_LEFT,"检测时间：",dateString,Element.ALIGN_RIGHT);
//            NoAndTime.setTableEvent(event);
            document.add(NoAndTime);

            String subjectStr = pdfContent.getSubject();
            Paragraph subject = new Paragraph(titleChineseStrEnglish("题目：",subjectStr));
            List<Integer> playerIDs = pdfContent.getPlayers();
            String playerStr = generatePlayerStr(playerIDs);
            Paragraph players = new Paragraph(titleChineseStrEnglish("检测选手范围：",playerStr));
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

            List<GeneralResult> generalResults = pdfContent.getResultList();
            PdfPTable table = createTable(5);
//            table.addCell(createCell("序号", keyfont,Element.ALIGN_LEFT,4,false));

            Chunk maxSimTitle = new Chunk("最大相似度", keyfont);
            Anchor anchorMore = new Anchor("", keyfont);
            anchorMore.setReference("#moreDetail");
            //设置锚点的名称（用户在使用内部锚点时定位的地方）
            anchorMore.setName("more");
            Phrase phraseSim = new Phrase();
            phraseSim.add(maxSimTitle);
            phraseSim.add(anchorMore);

            table.addCell(createCell("序号", keyfont, Element.ALIGN_CENTER));
            table.addCell(createCell("选手ID对", keyfont, Element.ALIGN_CENTER));
            table.addCell(createCell(phraseSim, Element.ALIGN_CENTER));
            table.addCell(createCell("是否抄袭", keyfont, Element.ALIGN_CENTER));
            table.addCell(createCell("详情信息", keyfont, Element.ALIGN_CENTER));

            for(int i=0;i<generalResults.size();i++){
                GeneralResult generalResult = generalResults.get(i);
                table.addCell(createCell(generalResult.getResultID()+"", entextfont));
                table.addCell(createCell("<"+generalResult.getCid1()+","+generalResult.getCid2()+">", entextfont));
                int maxSim = generalResult.getMaxSim();
                if(maxSim >= pdfContent.getThreshold()*100){
                    table.addCell(createCell(maxSim + "%", redenfont));
                }else {
                    table.addCell(createCell(maxSim + "%", entextfont));
                }
                if(generalResult.isPlag()) {
                    table.addCell(createCell("是", redchfont));
                }else{
                    table.addCell(createCell("否", chtextfont));
                }
                table.addCell(createCell("详情", chtextfont));
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

            document.add(new Paragraph("选手对：<551,556>",chtextfont));
            document.add(new Paragraph("\n"));

//            PdfPTable simMatrix = createTable(57);
//            simMatrix.addCell(createCell("序号",newkeyfont,Element.ALIGN_CENTER));
//            simMatrix.addCell(createCell("选手ID对", newkeyfont, Element.ALIGN_CENTER));
//            List<Integer> MUTList = pdfContent.getMutList();
//            for(int i=0;i<MUTList.size();i++){
//                simMatrix.addCell(createCell("方法"+(i+1),newkeyfont,Element.ALIGN_CENTER));
//            }
//            List<SimDetail> simDetailList = pdfContent.getSimDetailList();
//            for(int i=0;i<simDetailList.size();i++){
//                SimDetail simDetail = simDetailList.get(i);
//                simMatrix.addCell(createCell(""+simDetail.getID(),newentextfont,Element.ALIGN_CENTER));
//                simMatrix.addCell(createCell("<"+simDetail.getCid1()+","+simDetail.getCid2()+">", newentextfont));
//                List<Integer> simlarityList = simDetail.getSimilarityList();
//                for(int j=0;j<simlarityList.size();j++){
//                    simMatrix.addCell(createCell(simlarityList.get(j)+"",newentextfont));
//                }
//            }
//
//            simMatrix.setTableEvent(event);
//            document.add(simMatrix);

            PdfPTable simMatrix = createTable(9);

            simMatrix.addCell(createCell("类名",keyfont,Element.ALIGN_CENTER));
            PdfPCell cell=createCell("Argument",keyfont,Element.ALIGN_CENTER);
            cell.setColspan(8);
            simMatrix.addCell(cell);

            simMatrix.addCell(createCell("方法名",chtextfont,Element.ALIGN_CENTER));
            simMatrix.addCell(createCell("Argument",entextfont,Element.ALIGN_CENTER));
            simMatrix.addCell(createCell("value",entextfont,Element.ALIGN_CENTER));
            simMatrix.addCell(createCell("variable",entextfont,Element.ALIGN_CENTER));
            simMatrix.addCell(createCell("getValue",entextfont,Element.ALIGN_CENTER));
            simMatrix.addCell(createCell("getVariable",entextfont,Element.ALIGN_CENTER));
            simMatrix.addCell(createCell("isValue",entextfont,Element.ALIGN_CENTER));
            simMatrix.addCell(createCell("isVariable",entextfont,Element.ALIGN_CENTER));
            simMatrix.addCell(createCell("toString",entextfont,Element.ALIGN_CENTER));
            simMatrix.addCell(createCell("相似度",chtextfont,Element.ALIGN_CENTER));
            simMatrix.addCell(createCell("0",entextfont,Element.ALIGN_CENTER));
            simMatrix.addCell(createCell("0.64",entextfont,Element.ALIGN_CENTER));
            simMatrix.addCell(createCell("0.79",entextfont,Element.ALIGN_CENTER));
            simMatrix.addCell(createCell("0.81",entextfont,Element.ALIGN_CENTER));
            simMatrix.addCell(createCell("0.72",entextfont,Element.ALIGN_CENTER));
            simMatrix.addCell(createCell("0.64",entextfont,Element.ALIGN_CENTER));
            simMatrix.addCell(createCell("0.82",entextfont,Element.ALIGN_CENTER));
            simMatrix.addCell(createCell("0.75",entextfont,Element.ALIGN_CENTER));
            simMatrix.setTableEvent(event);
            document.add(simMatrix);

            document.add(new Paragraph("\n"));
            document.add(line);
            Anchor a = new Anchor("片段详情", headfont);
            document.add(a);
            document.add(new Paragraph("\n",chtextfont));

            document.add(new Paragraph("选手对：<551,556>",chtextfont));
            document.add(new Paragraph("\n"));

            PdfPTable detail = createTable(2);
            detail.addCell(createCell("Datalog d = new Datalog(\"1\");\n" +
                    " boolean NotEqual = d.equals(dd));\n" +
                    " boolean Equal = d.equals(new Datalog(\"12\"));",entextfont,Element.ALIGN_CENTER));
            detail.addCell(createCell("Datalog d = new Datalog(\"1\");\n" +
                    " boolean NotEqual = d.equals(dd);\n" +
                    " boolean Equal = d.equals(new Datalog(\"12\"));",entextfont,Element.ALIGN_CENTER));
            document.add(detail);

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
     * @Description 创建表格的单元格，包括设置水平格式
     * @Date 2:04 PM 2019/11/8
     * @Param [value, font, align]
     * @return com.itextpdf.text.pdf.PdfPCell
     **/
    public PdfPCell createCell(String value, Font font, int align){
        PdfPCell cell = new PdfPCell();
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell.setHorizontalAlignment(align);
        cell.setPhrase(new Phrase(value,font));
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
