package com.learn.ex2;


import com.learn.ex2.beans.Vehicle;
import com.learn.ex2.config.AnotherProjectConfig;
import com.learn.ex2.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example2 {
    static void main() {

        var context= new AnnotationConfigApplicationContext(ProjectConfig.class);

        var veh= context.getBean("TeslaVehicle", Vehicle.class);
        System.out.println("Vehicle name from Spring Context is:  "+veh.getName());

        var veh1= context.getBean("AudiVehicle", Vehicle.class);
        System.out.println("Vehicle name from Spring Context is:  "+veh1.getName());

        var helloWorld= context.getBean(String.class);
        System.out.println("String name from Spring Context is:  "+helloWorld);

        var intNum= context.getBean(Integer.class);
        System.out.println("Integer value from Spring Context is:  "+intNum);


    }
}
