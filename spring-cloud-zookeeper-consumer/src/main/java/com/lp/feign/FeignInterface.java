package com.lp.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="spring-cloud-zookeeper-provider")
public interface FeignInterface {

    @RequestMapping(value="/test",method= RequestMethod.GET)
    String test();


}
