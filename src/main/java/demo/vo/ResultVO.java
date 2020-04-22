package demo.vo;

import lombok.Data;

import java.util.List;

@Data
public class ResultVO {

    private String subject;

    private int allDetectionNum;

    private int plagNum;

    private List<StatisticResult> statisticResultList;

}
