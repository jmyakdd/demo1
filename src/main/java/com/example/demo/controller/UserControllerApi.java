package com.example.demo.controller;

import com.example.demo.bean.User;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserControllerApi {
    @Autowired
    private IUserService userService;

    @RequestMapping(path = "user")
    public List<User> getUser(){
        return userService.getUserList();
    }
}
