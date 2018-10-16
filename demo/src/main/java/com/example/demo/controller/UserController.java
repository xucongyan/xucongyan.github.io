package com.example.demo.controller;

import com.example.demo.po.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getUserByUserName")
    public User getUserByUserName(@RequestParam(value = "userName") String userName) {
        return userService.getUserByUserName(userName);
    }

    @RequestMapping(value = "/getUserByUserId")
    public User getUserByUserId(@RequestParam(value = "userId") Integer userId) {
        return userService.getUserByUserId(userId);
    }
}
