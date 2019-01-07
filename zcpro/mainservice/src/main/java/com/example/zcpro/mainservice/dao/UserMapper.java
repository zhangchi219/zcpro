package com.example.zcpro.mainservice.dao;

import com.example.zcpro.mainservice.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface UserMapper {
    public User getUser(String userName);
    public List<User> getUsers();
    public void insertUser(User user);
    public void updateUser(User user);
    public void deleteUser(String userName);
}
