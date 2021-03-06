package demo.controller;

import demo.common.Result;
import demo.vo.DetailInput;
import demo.vo.DetailVO;
import demo.vo.Inputs;
import demo.vo.Paths;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import demo.service.TFService;

import javax.annotation.Resource;

@RestController
@Slf4j
@RequestMapping("/API/TF")
public class TFController {
    @Resource
    private TFService tfService;

//    @PostMapping("/detection")
//    public Result detect(@)

    /*
     * @Author duanding
     * @Description 检测后端服务接口
     * @Date 7:28 PM 2020/4/22
     * @Param [inputs]
     * @return demo.common.Result
     **/
    @PostMapping("/allDetection")
    public Result detectAll(@RequestBody Inputs inputs){
        return tfService.detectAll(inputs);
//        return null;
    }

    /*
     * @Author duanding
     * @Description 获取详情信息
     * @Date 1:07 AM 2020/4/29
     * @Param [detailInput]
     * @return demo.vo.DetailVO
     **/
    @PostMapping("/getDetail")
    public DetailVO getDetail(@RequestBody DetailInput detailInput){
        String subject = detailInput.getSubject();
        int stu1 = detailInput.getStu1();
        int stu2 = detailInput.getStu2();
//        System.out.println("stu1:"+stu1);
        return tfService.getDetail(subject,stu1,stu2);
    }

    /*
     * @Author duanding
     * @Description 生成检测报告
     * @Date 1:09 AM 2020/4/29
     * @Param [subject]
     * @return boolean
     **/
    @GetMapping("/generateReport")
    public boolean generateReport(@RequestParam("subject") String subject){
        System.out.println("reportSubject:"+subject);
        return tfService.generateReport(subject);
    }

    @GetMapping("/simValue")
    public Result getSimValue(@RequestParam("paths") Paths paths) {
        return tfService.getSimValue(paths);
    }
}
