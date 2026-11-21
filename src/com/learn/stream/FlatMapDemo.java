package com.learn.stream;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapDemo {
    static void main() {
        String[] arrayOfWords={"Hello","Java"};
        Stream<String> streamOfWords=Arrays.stream(arrayOfWords);
        Stream<String[]> streamOfLetters=streamOfWords.map(word->word.split(""));
        streamOfLetters.flatMap(Arrays::stream).forEach(System.out::println);

        List<Person> persons= Arrays.asList(new Person("Alice",Arrays.asList("123","456")),
                new Person("Bob", Arrays.asList("789","101","112")));
        List<List<String>> mapResult=persons.stream().map(Person::getPhoneNumbers).collect(Collectors.toList());
        System.out.println("Using map: " +mapResult);
        //Using flatMap to flatten the stream of phone numbers
        List<String> flatMapResult =persons.stream().flatMap(person -> person.getPhoneNumbers().stream())
                .collect(Collectors.toList());
        System.out.println("Using FlatMap: " +flatMapResult);
    }
}
