package com.hedian.enurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EnurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EnurekaClientApplication.class, args);
    }

}
