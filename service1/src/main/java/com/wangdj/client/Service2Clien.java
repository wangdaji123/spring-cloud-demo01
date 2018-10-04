package com.wangdj.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
//1.创建FeignClient,@FeignClient的值，就是service2的spring.application.name
@FeignClient("service2")
public interface Service2Clien {
    //2.在service1的工程内，将service0的test方法，复制一份，但不提供实现，因为实现是在service2那边，而不在service1里，所以这里只需要提供一个方法签名一致的接口方法即可
    @GetMapping("/test/")
    String test();
}
