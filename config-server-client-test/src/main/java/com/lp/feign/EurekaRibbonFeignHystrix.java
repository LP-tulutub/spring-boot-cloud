package com.lp.feign;

import com.lp.feign.fallback.EurekaRibbonFeignHystrixFallback;
import com.lp.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Component
@FeignClient(name = "eureka-ribbon-provider", fallback = EurekaRibbonFeignHystrixFallback.class)
public interface EurekaRibbonFeignHystrix {

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    User getUserOne(@PathVariable int id);

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    List<User> getUser(@RequestBody User user);

}
