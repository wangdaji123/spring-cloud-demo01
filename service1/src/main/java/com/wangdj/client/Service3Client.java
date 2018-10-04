package com.wangdj.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("service2")
public interface Service3Client {
    //@GetMapping("/test/")
    @RequestMapping(method = RequestMethod.GET,path = "/test/")
    String test();

}
