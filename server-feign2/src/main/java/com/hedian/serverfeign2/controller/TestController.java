package com.hedian.serverfeign2.controller;

import com.hedian.serverfeign2.feignInterface.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 和电科技 on 2019/3/19 19:27
 */
@RestController
public class TestController {

    @Autowired
    private HiService hiService;

    @RequestMapping("/sayhi")
    public String sayHi(String name) {
        return hiService.getHi(name);
    }
}
