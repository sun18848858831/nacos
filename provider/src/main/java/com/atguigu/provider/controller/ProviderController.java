package com.atguigu.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ProviderController {

    @Value("${myName}")
    private  String name;

    @Value("${jdbc.url}")
    private String jdbcUrl;

    @Value("${redis.url}")
    private String redisUrl;

    @GetMapping("hello")
    public String hello(){
        //System.out.println(u.getURI());
        return "hello=======provider"+","+name+",redis-url="+redisUrl+",jdbc-url="+jdbcUrl;
        //jdisaofjaiefjaofj

    }
}
