package demo.pdf;

import java.awt.Color;
import java.lang.management.ManagementFactory;

import javax.management.InstanceAlreadyExistsException;
import javax.management.MBeanRegistrationException;
import javax.management.MBeanServer;
import javax.management.MalformedObjectNameException;
import javax.management.NotCompliantMBeanException;
import javax.management.ObjectName;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPTableEvent;

/**
 * ClassName:AlternatingBackground <br/> Function: TODO ADD FUNCTION. <br/> Reason: TODO ADD REASON.
 *
 * @author Administrator
 * @version
 * @see
 */
public class AlternatingBackground implements PdfPTableEvent {

    public void tableLayout(PdfPTable table, float[][] widths, float[] heights, int headerRows, int rowStart, PdfContentByte[] canvases) {

        int columns;
        Rectangle rect;

        //合适的颜色：（235，235，235）
        int footer = widths.length - table.getFooterRows();
        int header = table.getHeaderRows() - table.getFooterRows();
        for (int row = header; row < footer; row += 2) {
            if(row == header){
                columns = widths[row].length - 1;
                rect = new Rectangle(widths[row][0], heights[row], widths[row][columns], heights[row + 1]);
                rect.setBackgroundColor(new BaseColor(89,112,207));
                rect.setBorder(Rectangle.NO_BORDER);
                canvases[PdfPTable.BASECANVAS].rectangle(rect);
            }else{
                columns = widths[row].length - 1;
                rect = new Rectangle(widths[row][0], heights[row], widths[row][columns], heights[row + 1]);
                rect.setBackgroundColor(new BaseColor(235,235,235));
                rect.setBorder(Rectangle.NO_BORDER);
                canvases[PdfPTable.BASECANVAS].rectangle(rect);
            }

        }
    }

}
