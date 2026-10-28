package com.learn.linkedlist;

import com.learn.list.LastCharComparator;

import java.util.*;

public class LinkedListSorting {

    static void main() {
        List<Integer> numbers=new LinkedList<>();
        //adding elements to the LinkedList
        numbers.add(47);
        numbers.add(43);
        numbers.add(67);
        numbers.add(92);
        numbers.add(3);
        numbers.add(-67);
        numbers.add(-2);
        numbers.add(0);
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
        Collections.sort(numbers, Comparator.reverseOrder());
        System.out.println(numbers);

        var countries= new LinkedList<String>();
        countries.add("India");
        countries.add("USA");
        countries.add("Japan");
        countries.add("France");
        countries.add("Canada");
        System.out.println(countries);
       // Collections.sort(countries);
        countries.sort(Comparator.naturalOrder());
        System.out.println(countries);
        countries.sort(Comparator.reverseOrder());
        System.out.println(countries);

        var countries1= new LinkedList<String>();
        countries.add("India");
        countries.add("USA");
        countries.add("Japan");
        countries.add("France");
        countries.add("Canada");
        System.out.println(countries);
        Collections.sort(countries1,new LastCharComparator());
       // Collections.sort(countries,Comparator.reverseOrder());
        System.out.println(countries1);
    }
}
