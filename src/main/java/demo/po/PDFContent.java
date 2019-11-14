package demo.po;
import lombok.Data;

import java.util.List;

@Data
public class PDFContent {

    private int ID;

    private String dateTime;

    private String subject;

    private List<Integer> players;

    private double threshold;

    private int totalPairs;

    private int plagPairs;

    private List<GeneralResult> resultList;

    private List<Integer> mutList;

    private List<SimDetail> simDetailList;
}
