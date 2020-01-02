package demo.service;

import demo.common.Result;
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
}
