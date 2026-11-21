package com.learn.lambdaexpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


public class Exercise {

    static void main() {
        Exercise exercise=new Exercise();
        System.out.println("FilterBy age: "+ exercise.filterByAge(29));
        System.out.println("FilterByCity:" +exercise.filterByCity("New York"));
    }
    public static List<Person> filterByAge(int age) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("John", 28, "New York"));
        persons.add(new Person("Jane", 22, "Los Angeles"));
        persons.add(new Person("Jack", 30, "New York"));
        persons.add(new Person("Jill", 24, "Chicago"));
        // Write your code below
        Predicate<Person> ageCondition=person->person.getAge()>age;
        return filter(persons,ageCondition);

    }

    public static List<Person> filterByCity(String city) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("John", 28, "New York"));
        persons.add(new Person("Jane", 22, "Los Angeles"));
        persons.add(new Person("Jack", 30, "New York"));
        persons.add(new Person("Jill", 24, "Chicago"));
        // Write your code below
        Predicate<Person> filterCity=person->person.getCity().equals(city);
        return filter(persons,filterCity);
    }

    public static List<Person> filter(List<Person> persons, Predicate<Person> predicate) {
        List<Person> filteredPersons = new ArrayList<>();
        for (Person person : persons) {
            if (predicate.test(person)) {
                filteredPersons.add(person);
            }
        }
        return filteredPersons;
    }

}
