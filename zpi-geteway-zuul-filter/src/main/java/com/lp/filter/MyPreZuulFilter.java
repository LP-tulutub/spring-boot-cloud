package com.lp.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

@Component
public class MyPreZuulFilter extends ZuulFilter{
    /**
     * 类型包含pre post route error
     * pre 代表在路由代理之前执行
     * route 达标代理的时候执行
     * error 代表出错的时候执行
     * post 代表在route或者是error执行完成后执行
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 这个值代表filter的优先顺序，值越小越优先
     * @return
     */
    @Override
    public int filterOrder() {
        return 1;
    }

    /**
     * 是否使用这个过滤器
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 具体需要做的事务
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        System.err.println("这个filter已执行: "+this.filterType()+this.filterOrder());
        return null;
    }
}
