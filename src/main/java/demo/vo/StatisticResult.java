package demo.vo;

import lombok.Data;

import java.util.Comparator;

@Data
public class StatisticResult implements Comparator<StatisticResult> {

    private int id;

    private int stu1;

    private int stu2;

    //百分号前面
    private int maxSim;

    private boolean isPlag;

    //降序排列
    @Override
    public int compare(StatisticResult o1, StatisticResult o2) {
        if(o1.getMaxSim() < o2.getMaxSim()){
            return 1;
        }else if (o1.getMaxSim()==o2.getMaxSim()){
            return 0;
        }else{
            return -1;
        }
    }
}
