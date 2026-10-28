package com.learn.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    static void main() {
        Map<Integer,String> linkedHashMap=new LinkedHashMap<>();
        linkedHashMap.put(4,"Four");
        linkedHashMap.put(7,"Seven");
        linkedHashMap.put(3,"Three");
        linkedHashMap.put(8,"Eight");
        linkedHashMap.put(10,"Ten");

        for(Map.Entry<Integer,String> entry:linkedHashMap.entrySet()){
            System.out.println(entry.getKey()+ ":"+entry.getValue());
        }
    }
}
