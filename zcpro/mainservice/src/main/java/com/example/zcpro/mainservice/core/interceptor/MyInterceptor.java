package com.example.zcpro.mainservice.core.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Component
public class MyInterceptor extends HandlerInterceptorAdapter {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        String requestUrl = request.getRequestURL().toString();
        if(session.getAttribute("user")!=null){
            return true;
        }else {
            String url = "/login/doLogin";
            response.sendRedirect(url);
            return false;
        }
    }

}
