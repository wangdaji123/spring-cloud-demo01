package com.wangdj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class Service2 {
    public static void main(String[] args){
        SpringApplication.run(Service2.class,args);
    }
    @GetMapping("/service2")
    public String service2(){
        return "service2";
    }
}
