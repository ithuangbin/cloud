package com.huang.cloud.controller;

import com.huang.cloud.feign.DcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: huang
 * @Date: 2018/9/27 15:14
 * @Description:
 */
@RestController
public class DcController {

    @Autowired
    DcService dcService;

    @GetMapping("dc")
    public String info(){
        String info = dcService.info();
        return info;
    }
}