package com.learn.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetIterationDemo {

    static void main() {
        Set<String> superpowers=new HashSet<>();
        superpowers.add("Invisibility");
        superpowers.add("Mind reading");
        superpowers.add("Super Strength");
        superpowers.add("Time Travel");

        //Villains and their mischievous powers
        superpowers.add("Laser Vision");
        superpowers.add("Weather Manipulation");
        superpowers.add("Telekinesis");
        superpowers.add("Shape-Shifting");
        superpowers.add("Chaos Induction");

        for(String superPower:superpowers){
            System.out.println(superPower.toUpperCase());
        }
        Iterator<String> iterator= superpowers.iterator();
        while (iterator.hasNext()){
            String superPower=iterator.next();
            System.out.println(superPower.toLowerCase());
        }

    }
}
