package com.learn.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

    static void main() {
        Set<String> countries=new HashSet<>();
        countries.add("India");
        countries.add("USA");
        countries.add("UK");
        countries.add("France");
        countries.add("Dubai");
        countries.add("Singapore");
        countries.add("India");
        System.out.println(countries.size());
        System.out.println(countries);
        boolean isDubai=countries.contains("Dubai");
        System.out.println(isDubai);


    }
}
