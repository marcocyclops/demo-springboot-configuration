package com.marco.demoyaml.config;

import com.marco.demoyaml.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyAppConfig {
    @Bean
    public HelloService helloService() {
        System.out.println("@Bean added component into ioc container");
        return new HelloService();
    }
}
