package com.lp.controller;

import com.lp.feign.EurekaRibbonFeignHystrix;
import com.lp.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

	@Autowired
	private EurekaRibbonFeignHystrix eurekaRibbonFeignHystrix;

	@RequestMapping("/show")
	public String show(){
		return "启动成功";
	}

	@RequestMapping("/users")
	public List<User> getUsers(){
		User user = new User();
		user.setId(100);
		List<User> userList = this.eurekaRibbonFeignHystrix.getUser(user);
		return userList;
	}

	@RequestMapping("/user/{id}")
	public User getUserOne(@PathVariable int id){
		User userRe = this.eurekaRibbonFeignHystrix.getUserOne(id);
		return userRe;
	}


}
