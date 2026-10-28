package com.learn.map;

import java.util.*;
import java.util.Collections;

public class HashMapIterationDemo {

    static void main() {
        var countryMap = new HashMap<String, String>();
        countryMap.put("India","New Delhi");
        countryMap.put("USA","Washington, DC");
        countryMap.put("France","Paris");
        approach2(countryMap);

    }
    public static void approach1(HashMap<String, String> countryMap){
        Set<String> keys=countryMap.keySet();
         /*for(String key:keys){
            String capital=countryMap.get(key);
            System.out.println(key + ":" +capital);
*/
        Iterator<String> iterator= keys.iterator();
        while(iterator.hasNext()) {
            String key = iterator.next();
            String capital = countryMap.get(key);
            System.out.println(key + " : " + capital);
        }

        }
    public static void approach2(HashMap<String, String> countryMap){
            Set<Map .Entry<String,String>> entries=countryMap.entrySet();
            Iterator<Map.Entry<String,String>> iterator=entries.iterator();
            while(iterator.hasNext()) {
                Map.Entry<String, String> entry = iterator.next();
                String key = entry.getKey();
                String capital = entry.getValue();
                System.out.println(key + " : " + capital);

                /*for(Map.Entry<String,String> entry:entries){
            String capital=countryMap.get(key);
            System.out.println(key + ":" +capital);*/
            }

    }

    public static void approach3(HashMap<String, String> countryMap) {
        Collection<String> values = countryMap.values();
        for(String value:values){
            System.out.println(values);
        }

    }
    }

