package com.learn.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIteratorExample {

    static void main() {
        List<String> countryNames=new ArrayList<>();
        countryNames.add("India");
        countryNames.add("Canada");
        countryNames.add("USA");
        countryNames.add("Germany");
        countryNames.add("Spain");
        Iterator<String> iterator=countryNames.iterator();

        while(iterator.hasNext()){
            String country=iterator.next();
            System.out.println(country);
            if(country.equals("India")){
                iterator.remove();
            }
        }
        System.out.println(countryNames);

    }
}
