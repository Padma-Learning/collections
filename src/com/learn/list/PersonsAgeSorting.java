package com.learn.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class PersonsAgeSorting {

        public static List<Person> sortPersonsUsingAge() {
            var persons = new ArrayList<Person>();
            persons.add(new Person("James", 65));
            persons.add(new Person("Sneha", 34));
            persons.add(new Person("Jenna", 30));
            persons.add(new Person("Harry", 29));

            // Sort the Persons based on age and return
            Collections.sort(persons);
            return persons;
        }

    static void main() {
        System.out.println(sortPersonsUsingAge());
    }

    }




