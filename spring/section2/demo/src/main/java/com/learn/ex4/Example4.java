package com.learn.ex4;


import com.learn.ex4.beans.Car;
import com.learn.ex4.beans.Engine;
import com.learn.ex4.beans.Person;
import com.learn.ex4.beans.Vehicle;
import com.learn.ex4.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example4 {
    static void main() {

        var context= new AnnotationConfigApplicationContext(ProjectConfig.class);
        var veh = context.getBean(Vehicle.class);
        var person = context.getBean(Person.class);
        System.out.println("Vehicle name from Spring Context is :" +veh.getName());
        System.out.println("Person name from Spring Context is :" +person.getName());
        System.out.println("Person name from Spring Context is :" +person.getVehicle());

        var car = context.getBean(Car.class);
        var engine = context.getBean(Engine.class);
        System.out.println("Car name from Spring Context is :" +car.getName());
        System.out.println("Engine name from Spring Context is :" +engine.getName());
        System.out.println("Engine that car own is :" +car.getEngine());

        context.close();


    }
}
