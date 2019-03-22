package com.hedian.enurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 和电科技 on 2019/3/7 15:35
 */
@RestController
public class TestController {

    @Value("${server.port}")
    String port;

    @RequestMapping(value = "/hi",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String hello(@RequestParam(value = "name", defaultValue = "forezp") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }
}
