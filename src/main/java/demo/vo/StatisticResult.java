package demo.vo;

import lombok.Data;

@Data
public class StatisticResult {

    private int id;

    private int stu1;

    private int stu2;

    //百分号前面
    private int maxSim;

    private boolean isPlag;
}
