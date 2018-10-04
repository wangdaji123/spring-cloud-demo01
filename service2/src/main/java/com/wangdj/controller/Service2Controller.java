package com.wangdj.controller;

import org.apache.commons.lang.time.FastDateFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import sun.nio.cs.FastCharsetProvider;

import java.util.Date;

@RestController
public class Service2Controller {
    @GetMapping("/test/")
    public String test() {
        return FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss.sss").format(new Date());
    }
}
