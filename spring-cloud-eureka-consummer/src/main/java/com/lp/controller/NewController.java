package com.lp.controller;

import com.lp.service.NewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewController {

    @Autowired
    private NewService newService;

    @RequestMapping("/newstart")
    public String getUrl(){
        return newService.getUrl();
    }

}
