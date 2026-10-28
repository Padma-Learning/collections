package com.learn.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListForEach {

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

        for(String countryName:countryNames){
            System.out.println(countryName.toUpperCase());
        }
            Iterator<String> iterator=countryNames.iterator();
                while(iterator.hasNext()){
                    String country=iterator.next();
                    System.out.println(country);
                }
       ListIterator<String> listIterator=countryNames.listIterator();
        while(listIterator.hasNext()){
            String country=listIterator.next();
            System.out.println(country.toLowerCase());
        }
        while(listIterator.hasPrevious()){
            String country=listIterator.previous();
            System.out.println(country);
        }

    }
}
