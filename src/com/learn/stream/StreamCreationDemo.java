package com.learn.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class StreamCreationDemo {

    static void main() {

        List<String> departmentList=new ArrayList<>();
        departmentList.add("Supply");
        departmentList.add("HR");
        departmentList.add("IT");
        departmentList.add("Marketing");
        departmentList.add("Sales");

        Stream<String> depStream=departmentList.stream();
        //convert normal stream into parallel
       // depStream.parallel();
        //using lambda expression
        //depStream.forEach(department-> System.out.println(department));
        //method reference
        depStream.forEach(System.out::println);

        //Approach 2
        Stream<String> inStream=Stream.of("Krishna","Padma","Satvik");
        inStream.forEach(System.out::println);

        Stream<String> parallelStream=departmentList.parallelStream();
        parallelStream.forEach(System.out::println);

        String[] arrayOfWords= {"Welcome","Java"};
        Stream<String> streamOfWords=Arrays.stream(arrayOfWords);
        streamOfWords.forEach(System.out::println);

        Stream<String> emptyString=Stream.empty();
        /*Stream.generate(new Random()::nextInt).forEach(System.out::println);

        Stream.iterate(1,n->n+1).forEach(System.out::println);*/
    }
}
