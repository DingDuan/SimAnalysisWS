package demo.vo;
import lombok.Data;

import java.util.List;

@Data
public class DetailVO {

    private int stu1;

    private int stu2;

    private int[] topThreeSim;

    private List<String> MUT;

    private List<String> TF1;

    private List<String> TF2;

}
