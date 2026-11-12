package com.learn.ex1.beans;

import jakarta.annotation.PostConstruct;

public class Vehicle {
    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void sayHello(){
        System.out.println("Printing Hello from Component Vehicle Bean");
    }

    @PostConstruct
    public void intialize(){
        this.name="Audi";
    }
}
