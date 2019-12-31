package demo.controller;

import demo.common.Result;
import demo.vo.Inputs;
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

    @PostMapping("/detectionPDF")
    public Result detect(@RequestBody Inputs inputs){
        return tfService.detectBetweenTwo(inputs);
//        return null;
    }

    @GetMapping("/simValue")
    public Result getSimValue(@RequestParam("inputs") Inputs inputs) {
        return tfService.getSimValue(inputs);
    }
}
