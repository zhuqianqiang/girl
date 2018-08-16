package com.zqq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("redis")
public class RedisController {

    @Autowired
    private StringRedisTemplate strRedis;

    @RequestMapping(value = "/test")
    public String test(){
        Girl g = new Girl();
        g.setCupSize("p");
        g.setAge(10);
        strRedis.opsForValue().set("Hello","Hi");
        return strRedis.opsForValue().get("Hello");
    }
}
