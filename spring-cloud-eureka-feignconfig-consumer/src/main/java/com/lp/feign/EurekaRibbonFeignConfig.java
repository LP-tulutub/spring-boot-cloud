package com.lp.feign;

import com.lp.config.MyFeignConfig;
import com.lp.pojo.User;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "eureka-ribbon-provider", configuration = MyFeignConfig.class)
public interface EurekaRibbonFeignConfig {

    @RequestLine("GET /user/{id}")
    User getUserOne(@Param("id") int id);

    @RequestLine("POST /users")
    List<User> getUser(@RequestBody User user);
}
