package com.example.demo.service;

import com.example.demo.bean.User;

import java.util.List;

public interface IUserService {
    List<User>getUserList();

    User getUserById(int id);

    int update(User user);

    int delete(int id);

    int addUser(User user);

    int login(String name,String password);
}
