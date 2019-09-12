package com.test.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @创建人: 闫明伟
 * @描述:
 * @创建时间 2019/05/09 11:30
 */
@RestController
public class DemoController {

    @RequestMapping("/demo")
    public String demo(){
        return "abke！";
    }

    public static void main(String[] args) {
        long time = 1557043426000L;
        Date date = new Date(time);
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sd.format(date));
//        return sd.format(date);
    }
}
