package com.learn.map;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetDemo {

    static void main() {
        Set<String> stringSet=new HashSet<>(Arrays.asList("a","b","c"));
        processSet(stringSet);
        //stringSet=Collections.unmodifiableList(stringSet);

        Set<String> stringSet1=Set.of("a","b","c");
        processSet(stringSet1);

    }
    public static void processSet(Set<String> stringSet){
       // stringSet.add("d");
        for(String element:stringSet){
            System.out.println(element.toUpperCase());
        }
    }
}
