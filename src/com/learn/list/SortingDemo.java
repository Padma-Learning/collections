package com.learn.list;

import java.util.*;

public class SortingDemo {

    static void main() {
        List<Integer> numbers=new ArrayList<>();
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

        var countries= new ArrayList<String>();
        countries.add("India");
        countries.add("USA");
        countries.add("Japan");
        countries.add("France");
        countries.add("Canada");
        System.out.println(countries);
       // Collections.sort(countries);
        countries.sort(Comparator.naturalOrder());
        System.out.println(countries);
       // Collections.sort(countries,Comparator.reverseOrder());
        countries.sort(Comparator.reverseOrder());
        System.out.println(countries);
    }
}
