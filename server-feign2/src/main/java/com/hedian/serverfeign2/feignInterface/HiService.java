package com.hedian.serverfeign2.feignInterface;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("service-hi")
public interface HiService {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String getHi(String name);
}
