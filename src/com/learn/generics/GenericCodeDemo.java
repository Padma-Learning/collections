package com.learn.generics;

public class GenericCodeDemo {
    static void main() {
        GenericPair<String,Integer> stringIntPair=new GenericPair<>("Hello",42);
        stringIntPair.setFirst("Welcome to Java");
        stringIntPair.setSecond(2025);
        String myString= stringIntPair.getFirst();
        int myInt = stringIntPair.getSecond();
        System.out.println(myString+" "+myInt);
        System.out.println(myInt);
    }
}
