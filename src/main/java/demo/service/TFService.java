package demo.service;

import demo.common.Result;
import demo.vo.DetailVO;
import demo.vo.Inputs;
import demo.vo.Paths;

public interface TFService {
    Result getSimValue(Paths paths);

    Result detectAll(Inputs inputs);

    /*
     * @Author duanding
     * @Description 两个选手之间检测
     * @Date 3:39 PM 2019/11/15
     * @Param [paths]
     * @return demo.common.Result
     **/
    Result detectBetweenTwo(Paths paths);

    /*
     * @Author duanding
     * @Description 获取详情页面需要的详情信息
     * @Date 12:20 AM 2020/4/25
     * @Param [subject, stu1, stu2]
     * @return demo.vo.DetailVO
     **/
    DetailVO getDetail(String subject, int stu1, int stu2);

    /*
     * @Author duanding
     * @Description 生成检测报告对外接口
     * @Date 1:06 AM 2020/4/29
     * @Param [subject]
     * @return boolean
     **/
    boolean generateReport(String subject);
}
