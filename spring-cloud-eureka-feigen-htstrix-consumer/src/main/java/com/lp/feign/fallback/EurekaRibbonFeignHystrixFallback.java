package com.lp.feign.fallback;

import com.lp.feign.EurekaRibbonFeignHystrix;
import com.lp.pojo.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EurekaRibbonFeignHystrixFallback implements EurekaRibbonFeignHystrix {
    @Override
    public User getUserOne(int id) {
        User user = new User(-100, "EurekaRibbonFeignHystrixFallback-getUser", 8009);
        return user;
    }

    @Override
    public List<User> getUser(User user) {
        List<User> list = new ArrayList<>();
        list.add(new User(-100, "EurekaRibbonFeignHystrixFallback-getUser", 8009));
        return list;
    }
}
