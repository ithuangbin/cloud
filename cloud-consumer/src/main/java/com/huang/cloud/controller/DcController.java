package com.huang.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: huang
 * @Date: 2018/9/27 11:39
 * @Description:
 */
@RestController
public class DcController {

    @Autowired
    RestTemplate restTemplate;

    @Value("${spring.rabbitmq.host}") // git配置文件里的key
     String host;

    @GetMapping("info")
    public String dc(){
//        ServiceInstance serviceInstance = loadBalancerClient.choose("client");
//        String url = "http://"+serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/dc";

        String resp = restTemplate.getForObject("http://client/dc", String.class)+""+host;
        return resp;
    }
}