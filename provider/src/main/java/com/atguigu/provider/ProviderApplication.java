package com.atguigu.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//通过Spring Cloud原生注解 `@EnableDiscoveryClient` 开启服务注册发现功能
@EnableDiscoveryClient
@SpringBootApplication
public class ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
        //123ggergegvdfvfaefvaewfjafoajefaowfjaoif
    }

}
