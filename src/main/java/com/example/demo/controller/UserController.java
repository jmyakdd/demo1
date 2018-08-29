package com.example.demo.controller;

import com.example.demo.bean.User;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping(path = "/")
    public String index(Model model){
        List<User>users = userService.getUserList();
        model.addAttribute("users",users);
        return "index";
    }

    @PostMapping(path = "/login")
    public String login(Model model,@RequestParam String name,@RequestParam String password){
        int result = userService.login(name,password);
        if(result == 0){
            return "map";
        }else{
            List<User> users = userService.getUserList();
            model.addAttribute("users",users);
            return "index2";
        }
    }

    @GetMapping(path = "/index2")
    public String index2(){
        return "index2";
    }
}
