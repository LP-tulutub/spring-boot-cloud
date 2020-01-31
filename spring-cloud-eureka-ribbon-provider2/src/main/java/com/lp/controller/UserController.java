package com.lp.controller;

import com.lp.pojo.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @RequestMapping("/provider")
    public List<User> getUsers(){
        List<User> list = new ArrayList<>();
        list.add(new User(1,"zhangsan",20));
        list.add(new User(2,"lisi",22));
        list.add(new User(3,"wangwu",20));
        list.add(new User(4,"copy",20));
        return list;
    }

    @RequestMapping("/user/{id}")
    public User getUserOne(@PathVariable int id){
        User user = new User();
        user.setId(id);
        user.setAge(8004);
        user.setName("端口");
        return user;
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public List<User> getUser(@RequestBody User user){
        User userRe = new User(user.getId(), "雷神", 23);
        User userRe2 = new User(50, "端口", 8004);
        List<User> list = new ArrayList<>();
        list.add(userRe);
        list.add(userRe2);
        return list;
    }

}
