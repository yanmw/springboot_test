package com.swagge2.demo.test;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @创建人: 闫明伟
 * @描述:
 * @创建时间 2019/06/21 9:18
 */
@RestController
@RequestMapping(value = "/demo", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class demo1 {

    @GetMapping(value = "hello")
    public String hello(){
        return "hello";
    }
}
