package com.hedian.service_es.controller;

import com.hedian.service_es.service.EsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 和电科技 on 2019/3/15 14:24
 */
@RestController
@RequestMapping("/es")
public class EsController {

    @Autowired
    private EsService esService;

    @GetMapping("/get")
    public List<String> getEs(String name) {
        List<String> str = esService.getEsInfo(name);
        return str;
    }

}
