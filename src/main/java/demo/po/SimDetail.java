package demo.po;
import lombok.Data;

import java.util.List;

@Data
public class SimDetail {
    private int ID;

    private int cid1;

    private int cid2;

    private List<Integer> similarityList;
}
