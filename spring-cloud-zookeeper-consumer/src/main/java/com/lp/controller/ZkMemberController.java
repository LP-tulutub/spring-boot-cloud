package com.lp.controller;

import com.lp.feign.FeignInterface;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class ZkMemberController {

    @Resource
    private FeignInterface feignInterface;

    @RequestMapping("/test")
    @ResponseBody
    public String orderToMember() {
        return this.feignInterface.test();
    }

}
