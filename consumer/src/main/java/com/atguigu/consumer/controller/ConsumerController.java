package com.atguigu.consumer.controller;

import com.atguigu.consumer.feign.ProviderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {


    @Autowired
    private ProviderFeign providerFeign;
    @GetMapping("hi")
    public String hi(){
        //return "hi consumer";
        return this.providerFeign.hello();
    }
}
