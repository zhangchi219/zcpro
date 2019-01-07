package com.example.zcpro.mainservice;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class testRedis {
    //@Autowired
    //RedisTemplate redisTemplate;

    //@Autowired
    //StringRedisTemplate stringRedisTemplate;
    @Test
    public void set(){
        List list = new ArrayList();
        list.add("111");
        list.add("222");
        list.add("333");
        //redisTemplate.opsForValue().set("zc4",list);
       // redisTemplate.opsForList().leftPush("user:list", JSON.toJSONString(list));

    }
}
