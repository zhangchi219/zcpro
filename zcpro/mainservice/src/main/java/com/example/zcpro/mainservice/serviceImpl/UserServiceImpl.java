package com.example.zcpro.mainservice.serviceImpl;

import com.example.zcpro.mainservice.dao.UserMapper;
import com.example.zcpro.mainservice.model.User;
import com.example.zcpro.mainservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User getUser(String userName) {
        User user= userMapper.getUser(userName);
        return user;
    }

    @Override
    public List<User> getUsers() {
        List<User> userList =  userMapper.getUsers();
        return userList;
    }

    @Override
    public void insertUser(User user) {
        userMapper.insertUser(user);
        int i=0;
        int j=0;
        int k = i/j;
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    @Override
    public void deleteUser(String userName) {
        userMapper.deleteUser(userName);
    }
}
