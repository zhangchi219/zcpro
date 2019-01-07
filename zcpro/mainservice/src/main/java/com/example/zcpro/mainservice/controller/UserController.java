package com.example.zcpro.mainservice.controller;

import com.example.zcpro.mainservice.dao.UserMapper;
import com.example.zcpro.mainservice.model.User;
import com.example.zcpro.mainservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/testRest/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/{name}")
    public Object getUsersByCondition(@PathVariable String name){
        User user = userService.getUser(name);
        return user;
    }
    @GetMapping(value = "/")
    public  Object getUsersList(){
        List<User> userList =  userService.getUsers();
        return userList;
    }
    @PostMapping(value = "/")
    public Object insertUser(HttpServletRequest request, @ModelAttribute User user){
        userService.insertUser(user);
        return "success";
    }
    @PutMapping(value = "/{id}")
    public Object updateUser(@PathVariable int id,@ModelAttribute User user){
        user.setId(id);
        userService.updateUser(user);
        return "success";
    }
    @DeleteMapping(value = "/{id}")
    public Object deleteUser(@PathVariable String userName){
        userService.deleteUser(userName);
        return "success";
    }
}
