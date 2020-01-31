package com.lp.springboothelloworld.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lp.springboothelloworld.exception.ApplicationException;

@RestController
public class HelloWorldController {
	
	//@Value("${hello.msg2}")
	private String msg;

	@RequestMapping("/hello")
	public String showMsg(){
		/*String str = null;
		str.length();*/
		//int a = 1/0;
		throw new ApplicationException("出错了");
		//return this.msg;
	}
}
