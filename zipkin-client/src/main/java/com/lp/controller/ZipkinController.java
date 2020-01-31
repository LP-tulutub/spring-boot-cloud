package com.lp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZipkinController {
    @Value("${server.port}")
    private String port;

    @RequestMapping("/zipkin")
    public String zipkinTest(){
        return "返回这个客户端的端口: " + port;
    }
}
