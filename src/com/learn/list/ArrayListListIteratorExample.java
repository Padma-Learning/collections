package com.learn.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListListIteratorExample {

    static void main() {
        List<String> countryNames = new ArrayList<>();
        countryNames.add("India");
        countryNames.add("Canada");
        countryNames.add("USA");
        countryNames.add("Germany");
        countryNames.add("Spain");
        ListIterator<String> listIterator = countryNames.listIterator();

        while (listIterator.hasNext()) {
            String country = listIterator.next();
            System.out.println(country);

        }
        while (listIterator.hasPrevious()) {
            String country = listIterator.previous();
            System.out.println(country);

        }
    }
}
