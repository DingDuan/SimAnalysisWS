package demo.pdf;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.LineSeparator;
import demo.po.PDFContent;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class GeneratePDF {
    private static Font headfont ;// 设置字体大小
    private static Font keyfont;// 设置字体大小
    private static Font chtextfont;// 设置中文字体
    private static Font entextfont;// 设置英文及数字字体
    private static Font redfont;//红色字体
    int maxWidth = 520;
    static{
        BaseFont bfChinese;
        BaseFont bfEnglish;
        try {
            //bfChinese = BaseFont.createFont("STSong-Light","UniGB-UCS2-H",BaseFont.NOT_EMBEDDED);
            bfChinese = BaseFont.createFont("STSong-Light","UniGB-UCS2-H",BaseFont.NOT_EMBEDDED);
            bfEnglish = BaseFont.createFont();
            headfont = new Font(bfChinese, 14, Font.BOLD);
            keyfont = new Font(bfChinese, 12, Font.BOLD);
            chtextfont = new Font(bfChinese, 12, Font.NORMAL);
            entextfont = new Font(bfEnglish,12,Font.NORMAL);
            redfont = new Font(bfEnglish,12,Font.NORMAL);
            redfont.setColor(BaseColor.RED);
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
        generatePDF.createPDF(pdfContent);

    }

    public boolean createPDF(PDFContent pdfContent){
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream("/Users/dd/Desktop/report.pdf"));
            document.addTitle("测试脚本相似度检测报告");
            document.open();
            BaseFont bfChinese = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
            Font FontChinese = new Font(bfChinese, 12, Font.NORMAL);

            Font titleFont = new Font(bfChinese, 23, Font.BOLD);
            Paragraph title = new Paragraph("测试脚本相似度检测报告",titleFont);
            title.setAlignment(1);
            document.add(title);
            document.add(new Paragraph("\n"));

            LineSeparator line = new LineSeparator(2f,100,BaseColor.BLUE,Element.ALIGN_CENTER,0f);
            document.add(line);
//            document.add(new Paragraph("\n"));

            PdfPTable NoAndTime = createTwoParallel("","No: 000120191104093030",Element.ALIGN_LEFT,"检测时间：","2019-11-04 09:30:30",Element.ALIGN_RIGHT);
            document.add(NoAndTime);

            Paragraph subject = new Paragraph(titleChineseStrEnglish("题目：","Datalog"));
            Paragraph players = new Paragraph(titleChineseStrEnglish("检测选手范围：","1 - 500"));
            Paragraph threshold = new Paragraph(titleChineseStrEnglish("相似度阈值：","80%"));
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
            Font FontChinese2 = new Font(bfChinese, 16, Font.BOLD);
            Paragraph result = new Paragraph("检测结果",FontChinese2);
            document.add(result);
            document.add(new Paragraph("\n"));

            PdfPTable totalAndPlag = createTwoParallel("共检测选手对：","124750",Element.ALIGN_CENTER,"抄袭选手对：","4723",Element.ALIGN_CENTER);
            document.add(totalAndPlag);

            document.add(new Paragraph("\n"));

            PdfPTable table = createTable(4);
//            table.addCell(createCell("序号", keyfont,Element.ALIGN_LEFT,4,false));

            table.addCell(createCell("序号", keyfont, Element.ALIGN_CENTER));
            table.addCell(createCell("选手ID对", keyfont, Element.ALIGN_CENTER));
            table.addCell(createCell("最大相似度", keyfont, Element.ALIGN_CENTER));
            table.addCell(createCell("是否抄袭", keyfont, Element.ALIGN_CENTER));

            for(int i=0;i<5;i++){
                table.addCell(createCell((i+1)+"", entextfont));
                int j = i+2;
                table.addCell(createCell("<1,"+j+">", entextfont));
                int k = 100-i;
                if(k >= 90){
                    table.addCell(createCell(k + "%", redfont));
                }else {
                    table.addCell(createCell(k + "%", entextfont));
                }
                table.addCell(createCell("是", chtextfont));
            }
            document.add(table);



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

    public PdfPCell createCell(String value, Font font, int align){
        PdfPCell cell = new PdfPCell();
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell.setHorizontalAlignment(align);
        cell.setPhrase(new Phrase(value,font));
        return cell;
    }

    public PdfPCell createCell(String value,Font font){
        PdfPCell cell = new PdfPCell();
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setPhrase(new Phrase(value,font));
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

    public PdfPTable createBlankTable(){
        PdfPTable table = new PdfPTable(1);
        table.getDefaultCell().setBorder(0);
        table.addCell(createCell("", keyfont));
        table.setSpacingAfter(20.0f);
        table.setSpacingBefore(20.0f);
        return table;
    }

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
        Phrase phrase = new Phrase();
        phrase.add(leftTitleChunk);
        phrase.add(leftStrChunk);
        return phrase;
    }
}
