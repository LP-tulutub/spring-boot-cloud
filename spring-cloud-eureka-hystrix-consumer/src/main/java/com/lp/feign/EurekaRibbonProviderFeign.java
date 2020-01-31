package com.lp.feign;

import com.lp.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("eureka-ribbon-provider")
public interface EurekaRibbonProviderFeign {
    @RequestMapping("/user/{id}")
    User getUserOne(@PathVariable int id);

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    List<User> getUser(@RequestBody User user);

}
