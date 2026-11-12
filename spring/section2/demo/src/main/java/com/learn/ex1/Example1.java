package com.learn.ex1;


import com.learn.ex1.beans.Vehicle;
import com.learn.ex1.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {
    static void main() {

        var context= new AnnotationConfigApplicationContext(ProjectConfig.class);
        var veh= context.getBean("vehicle1", Vehicle.class);
        System.out.println("Vehicle name from Spring Context is:  "+veh.getName());

    }
}
