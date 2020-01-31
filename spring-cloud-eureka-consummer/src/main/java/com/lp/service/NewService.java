package com.lp.service;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class NewService {

    @Qualifier("eurekaClient")
    @Autowired
    private EurekaClient eurekaClient;

    public String getUrl(){
        InstanceInfo nextServerFromEureka = eurekaClient.getNextServerFromEureka("EUREKA-PROVIDER", false);
        String url = nextServerFromEureka.getHomePageUrl();
        return  url;
    }



}
