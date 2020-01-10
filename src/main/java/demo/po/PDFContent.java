package demo.po;
import demo.entity.MUTModel;
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

    private List<MUTModel> mutList;

    private List<SimDetail> simDetailList;

    private List<FragDetail> fragDetailList;
}
