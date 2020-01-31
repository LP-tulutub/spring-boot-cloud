package com.lp.controller;

import java.util.List;

import com.lp.pojo.User;
import com.lp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/consumer")
	public List<User> getUsers(){
		return this.userService.getUsers();
	}
}
