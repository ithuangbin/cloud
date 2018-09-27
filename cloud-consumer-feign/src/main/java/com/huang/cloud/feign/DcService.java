package com.huang.cloud.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Auther: huang
 * @Date: 2018/9/27 14:18
 * @Description:
 */
@FeignClient("client")
public interface DcService {

    @GetMapping("info")
    String info();
}