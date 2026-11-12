package com.learn.ex2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnotherProjectConfig {

    @Bean
    String helloWord(){
        return "Hello World";
    }
    @Bean
    Integer luckyNumber(){
        return 16;
    }
}
