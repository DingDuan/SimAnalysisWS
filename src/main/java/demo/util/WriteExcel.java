package demo.util;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {
    private static final String EXCEL_XLS = "xls";
    private static final String EXCEL_XLSX = "xlsx";

    public static void main(String[] args) {
        ArrayList<String> result = new ArrayList<>();
        result.add("132");
        result.add("dfs");
//        WriteExcel.writeExcel(result,"/Users/dd/try.xlsx",3);
        writeExcel("/Users/dd/study/try.xlsx",result);
    }

    /*
     * @Author duanding
     * @Description 把list中数据写入excel
     * @Date 3:42 PM 2019/12/21
     * @Param [path, list]
     * @return void
     **/
    public static void writeExcel(String path,List<String> list){
        File file = new File(path);
        //创建工作簿
        Workbook wb = null;
        try {
            wb = getWorkbok(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //创建 Sheet页
        Sheet sheet = wb.createSheet("time");
        for(int i=0; i<list.size(); i++){
            //创建单元行
            Row row = sheet.createRow(i);
            Cell cell = row.createCell(0);
            cell.setCellValue(list.get(i));
        }
        try {
            //路径需要存在
            FileOutputStream fos = new FileOutputStream(path);
            wb.write(fos);
            fos.close();
//            wb.close();
            System.out.println("写数据结束！");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }



    /**
     * 判断Excel的版本,获取Workbook
     * @param file
     * @return
     * @throws IOException
     */
    public static Workbook getWorkbok(File file) throws IOException{
        Workbook wb = null;
        FileInputStream in = new FileInputStream(file);
        if(file.getName().endsWith(EXCEL_XLS)){     //Excel&nbsp;2003
            wb = new HSSFWorkbook(in);
        }else if(file.getName().endsWith(EXCEL_XLSX)){    // Excel 2007/2010
            wb = new XSSFWorkbook(in);
        }
        return wb;
    }
}