package com.example.demo.service.imp;

import com.example.demo.bean.User;
import com.example.demo.dao.UserDao;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getUserList() {
        return userDao.getUserList();
    }

    @Override
    public User getUserById(int id) {
        return null;
    }

    @Override
    public int update(User user) {
        return 0;
    }

    @Override
    public int delete(int id) {
        return 0;
    }

    @Override
    public int addUser(User user) {
        return 0;
    }

    @Override
    public int login(String name, String password) {
        User user = userDao.login(name,password);
        if (user != null) {
            return 1;
        }
        return 0;
    }
}
