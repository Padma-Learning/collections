package com.learn.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListForEachExample {

    static void main() {
        List<String> countryNames=new ArrayList<>();
        System.out.println(countryNames.size());
        countryNames.add("India");
        countryNames.add("Canada");
        countryNames.add("USA");
        countryNames.add("Germany");
        countryNames.add("Spain");

        for(String country:countryNames){
            System.out.println(country);
        }

    }
}
