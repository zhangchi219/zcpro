package com.example.zcpro.mainservice.service;

import com.example.zcpro.mainservice.model.User;

import java.util.List;

public interface UserService {
    public User getUser(String userName);
    public List<User> getUsers();
    public void insertUser(User user);
    public void updateUser(User user);
    public void deleteUser(String userName);
}
