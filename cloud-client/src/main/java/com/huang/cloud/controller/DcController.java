package com.huang.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: huang
 * @Date: 2018/9/27 11:09
 * @Description:
 */
@RestController
public class DcController {

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("dc")
    public String dc(){
        String service = "Service:"+discoveryClient.getServices();
        return service;
    }

    @GetMapping("info")
    public String info(){
        String service = "Service:"+discoveryClient.getServices();
        return service;
    }
}