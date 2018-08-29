package com.example.demo.dao;

import com.example.demo.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    List<User> getUserList();

    User login(@Param("username") String name,@Param("pass") String password);

//    int insertUser(User user);
}
