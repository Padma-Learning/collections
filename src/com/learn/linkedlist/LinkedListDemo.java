package com.learn.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    static void main() {
        LinkedList<Integer> nums= new LinkedList<>();
        List<Double> doubleNums=new LinkedList<>();
        var countryNames=new LinkedList<String>();
        countryNames.add("India");
        countryNames.add("Canada");
        countryNames.add("Germany");
        countryNames.add("USA");
        countryNames.add("Spain");
        System.out.println(countryNames);
        countryNames.set(4,"India");
        countryNames.remove("India");
        String firstElement= countryNames.getFirst();
        String lastElement=countryNames.getLast();
        System.out.println(countryNames);
        LinkedList<String> reversedCountryNames=countryNames.reversed();
        System.out.println(reversedCountryNames);



    }
}
