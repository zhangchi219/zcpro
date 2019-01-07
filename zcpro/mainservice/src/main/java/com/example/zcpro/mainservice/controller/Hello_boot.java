package com.example.zcpro.mainservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class Hello_boot {
    public final static Logger logger = LoggerFactory.getLogger(Hello_boot.class);
    @RequestMapping("/hello_boot")
    public Object hello_boot(){
        logger.warn("hahahahqqq");
        logger.error("hahahah");
        return  "/testtRest/restOne";
    }
    @GetMapping(value = "/testUnit")
    public Object testUnit(){
        int i = 5;
        int j = 0;
        int s = i/j;
        logger.info("hahahah");
        logger.info("hahahssah");
        return i;
    }
}
