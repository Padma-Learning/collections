package com.learn.ex4.config;

import com.learn.ex4.beans.Person;
import com.learn.ex4.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.learn.ex4.beans"})
public class ProjectConfig {
@Bean
    Vehicle vehicle(){
        Vehicle veh=new Vehicle();
        veh.setName("Honda");
        return veh;
    }

    @Bean
    Person person(Vehicle vehicle){
        Person person=new Person();
        person.setName("Lucy");
        person.setVehicle(vehicle);
        return person;
    }

}