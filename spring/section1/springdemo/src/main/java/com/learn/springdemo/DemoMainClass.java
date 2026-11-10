package com.learn.springdemo;

import com.learn.springdemo.beans.Vehicle;
import com.learn.springdemo.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoMainClass {
    static void main() {

        Vehicle vehicle=new Vehicle();
        vehicle.setName("Audi");

        System.out.println("Vehicle name from non-spring context is:" +vehicle.getName());

        var context= new AnnotationConfigApplicationContext(ProjectConfig.class);
        var veh= context.getBean(Vehicle.class);
        System.out.println("Vehicle name from Spring Context is:  "+veh.getName());

        String hello=context.getBean(String.class);
        System.out.println("String value from Spring Context is: "+hello);

        Integer num=context.getBean(Integer.class);
        System.out.println("Integer value from Spring Context is: "+num);
    }
}
