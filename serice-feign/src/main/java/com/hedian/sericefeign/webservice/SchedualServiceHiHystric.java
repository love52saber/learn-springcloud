package com.hedian.sericefeign.webservice;

import org.springframework.stereotype.Component;

/**
 * Created by 和电科技 on 2019/3/20 10:54
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry"+name;
    }
}
