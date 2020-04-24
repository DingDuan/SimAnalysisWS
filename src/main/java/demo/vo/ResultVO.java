package demo.vo;

import lombok.Data;

import java.util.List;

@Data
public class ResultVO {

    private String subjectName;

    //检测学生总数
    private int allDetectionNum;

    //其中抄袭学生数量
    private int plagNum;

    private List<StatisticResult> statisticResultList;



}
