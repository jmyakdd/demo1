package com.example.demo.controller;

import com.example.demo.bean.User;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping(path = "getList")
    public String getUserList(Model model){
        List<User> users = userService.getUserList();
        for (User u : users){
            System.out.println(u.toString());
        }
        model.addAttribute("users",users);
        return "index.html";
    }

    @GetMapping(path = "jump")
    public String jump(Model model){
        List<User> users = userService.getUserList();
        for (User u : users){
            System.out.println(u.toString());
        }
        model.addAttribute("user",users.get(0));
        return "index2.html";
    }

    @GetMapping(path = "map")
    public String map(){
        return "map.html";
    }
}
