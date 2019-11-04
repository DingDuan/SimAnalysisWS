package demo.pdf;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class GeneratePDF {
    public static void main(String[] args){
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream("Helloworld.PDF"));
            document.open();
            document.add(new Paragraph("Hello World"));
            document.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (DocumentException e) {
            e.printStackTrace();
        }



    }
}
