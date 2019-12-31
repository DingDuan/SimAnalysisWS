package demo.service;

import demo.common.Result;
import demo.vo.Inputs;

public interface TFService {
    Result getSimValue(Inputs inputs);

    Result detectAll(Inputs inputs);

    /*
     * @Author duanding
     * @Description 两个选手之间检测
     * @Date 3:39 PM 2019/11/15
     * @Param [inputs]
     * @return demo.common.Result
     **/
    Result detectBetweenTwo(Inputs inputs);
}
