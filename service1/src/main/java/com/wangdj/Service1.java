package com.wangdj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.feign.FeignClientsConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(defaultConfiguration=FeignClientsConfiguration.class)
@RestController
public class Service1 {
    public static void main(String[] args){
        SpringApplication.run(Service1.class,args);
    }
    @GetMapping("/service1")
    public String service1(){
        return "service1";
    }
}
