package com.lp.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewController {
    @Qualifier("eurekaClient")
    @Autowired
    private EurekaClient eurekaClient;

    @RequestMapping("/new")
    public String info(){
        InstanceInfo nextServerFromEureka = eurekaClient.getNextServerFromEureka("EUREKA-PROVIDER", false);

        String url = nextServerFromEureka.getHomePageUrl();
        return url;
    }

}
