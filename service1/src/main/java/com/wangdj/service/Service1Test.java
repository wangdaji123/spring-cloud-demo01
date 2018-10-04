package com.wangdj.service;

import org.apache.commons.lang.time.FastDateFormat;
import org.springframework.stereotype.Service;

import java.util.Date;
@Service
public class Service1Test {
    public String test(){
        return FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss.sss").format(new Date());
    }
}
