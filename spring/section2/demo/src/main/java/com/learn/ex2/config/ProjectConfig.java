package com.learn.ex2.config;

import com.learn.ex2.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.context.annotation.Import;

@Configuration
@Import({AnotherProjectConfig.class})
public class ProjectConfig {

    @Bean(name="TeslaVehicle")
    Vehicle vehicle() {
        var veh = new Vehicle();
        veh.setName("Tesla");
        return veh;
    }
    @Bean(value = "AudiVehicle")
    Vehicle vehicle1(){
        var veh=new Vehicle();
        veh.setName("Audi");
        return veh;
    }
    @Bean ({"HondaVehicle", "myFavouriteVehicle"})
    @Description("This is a Vehicle class bean")
    Vehicle vehicle2(){
        var veh=new Vehicle();
        veh.setName("Honda");
        return veh;
    }
}

