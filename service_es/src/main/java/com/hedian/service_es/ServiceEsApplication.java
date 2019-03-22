package com.hedian.service_es;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@FeignClient
@EnableElasticsearchRepositories(basePackages = "com.hedian.service_es.dao")
public class ServiceEsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceEsApplication.class, args);
    }

}
