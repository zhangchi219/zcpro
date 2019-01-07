package com.example.zcpro.mainservice.controller;

import com.example.zcpro.mainservice.model.User;
import com.example.zcpro.mainservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/login")
public class loginController {
    @Autowired
    private UserService userService;
    @GetMapping("/doLogin")
    public Object login(){
        return "/system/login";
    }
    @RequestMapping("/regisLogin")
    @ResponseBody
    public Object loginVerify(HttpServletRequest request, HttpSession session){
        String userName = (String) request.getParameter("userName");
        User user = userService.getUser(userName);
        Map map = new HashMap();;
        if(user!=null){
            session.setAttribute("user",user.getUserName());
            map.put("sessionId",session.getId());
            map.put("serverPort",request.getServerPort());
            map.put("success",true);
        }else{
            map.put("success",false);
        }
        return  map;
    }
}
