import com.itextpdf.text.Document;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import demo.util.ImportExcel;
import demo.util.WriteExcel;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Try {
    public static void main(String[] args) throws Exception {
        ImportExcel importExcel = new ImportExcel();
        List<List<String>> list1 = importExcel.read("/Users/dd/study/iSE/Graduation-Design/ContestDataSet/Project-mooctest-DD.xlsx");
        List<String> caseIdList = new ArrayList<>();
        List<String> timeList = new ArrayList<>();
        if(list1 != null){
            for(int i=0;i<list1.size();i++) {
                List<String> cellList = list1.get(i);
                for (int j = 1; j < cellList.size(); j++) {
                    caseIdList.add(cellList.get(0));
                }
            }
        }
        List<List<String>> list2 = importExcel.read("/Users/dd/study/iSE/Graduation-Design/ContestDataSet/Project-Time.xlsx");
        if(list2 != null){
            for(int j=0;j<caseIdList.size();j++){
                for(int i=1;i<list2.size();i++) {
                    List<String> cellList = list2.get(i);
                    if(caseIdList.get(j).equals(cellList.get(2))){
                        timeList.add(cellList.get(3));
                    }
                }
            }
        }

        WriteExcel.writeExcel("/Users/dd/study/iSE/Graduation-Design/ContestDataSet/Project-mooctest-DD.xlsx",timeList);

    }
}
