package demo.controller;

import demo.common.Result;
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

    @PostMapping("/allDetection")
    public Result detectAll(@RequestBody Inputs inputs){
        return tfService.detectAll(inputs);
//        return null;
    }

    @GetMapping("/simValue")
    public Result getSimValue(@RequestParam("paths") Paths paths) {
        return tfService.getSimValue(paths);
    }
}
