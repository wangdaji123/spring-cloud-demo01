package com.wangdj.controller;

import com.wangdj.client.Service3Client;
import com.wangdj.service.Service1Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service1Controller {
   @Autowired
   private Service3Client service3Client;
    @Autowired
    private Service1Test service1Test;

    @GetMapping("/test/")
    public String test()
    {
        System.out.println(service3Client);
        return service3Client.test();
    }
}
