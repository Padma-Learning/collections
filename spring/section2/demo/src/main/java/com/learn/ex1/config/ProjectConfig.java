package com.learn.ex1.config;

import com.learn.ex3.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.learn.ex3.beans"})
public class ProjectConfig {

}


