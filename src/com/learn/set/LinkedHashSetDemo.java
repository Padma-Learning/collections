package com.learn.set;

import java.util.LinkedHashSet;
import java.util.SequencedSet;

public class LinkedHashSetDemo {

    static void main() {
        var visitedCountries=new LinkedHashSet<String>();
        visitedCountries.add("India");
        visitedCountries.add("USA");
        visitedCountries.add("France");
        visitedCountries.add("Germany");
        visitedCountries.add("Singapore");
        visitedCountries.add("Dubai");

        for(String country:visitedCountries){
            System.out.println(country);
        }
        SequencedSet<String> reversedVisitedCountries =visitedCountries.reversed();
        System.out.println(reversedVisitedCountries);

    }
}
