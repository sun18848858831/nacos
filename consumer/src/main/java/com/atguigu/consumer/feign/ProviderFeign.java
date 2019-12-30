package com.atguigu.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("provider")
public interface ProviderFeign {

    @RequestMapping("hello")
    public String hello();
}
