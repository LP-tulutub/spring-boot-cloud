package com.lp.feign.fallback;

import com.lp.feign.EurekaRibbonFeignHystrixFactory;
import com.lp.pojo.User;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EurekaRibbonFeignHystrixFallbackFactory implements FallbackFactory<EurekaRibbonFeignHystrixFactory> {

    @Override
    public EurekaRibbonFeignHystrixFactory create(Throwable throwable) {
        return new EurekaRibbonFeignHystrixFactory() {
            @Override
            public User getUserOne(int id) {
                User user = new User(-200, "EurekaRibbonFeignHystrixFallbackFactory-getUser", 8010);
                return user;
            }

            @Override
            public List<User> getUser(User user) {
                List<User> list = new ArrayList<>();
                list.add(new User(-200, "EurekaRibbonFeignHystrixFallbackFactory-getUser", 8010));
                return list;
            }
        };
    }
}
