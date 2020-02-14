package com.lp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZkMemberController {

    @RequestMapping("/test")
    public String test(){
        return "test：内容";
    }

}
