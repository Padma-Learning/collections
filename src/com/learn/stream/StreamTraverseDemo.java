package com.learn.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTraverseDemo {

    static void main() {
        List<String> departmentList=new ArrayList<>();
        departmentList.add("Supply");
        departmentList.add("HR");
        departmentList.add("IT");
        departmentList.add("Marketing");
        departmentList.add("Sales");

        Stream<String> depStream=departmentList.stream();
        depStream.forEach(System.out::println);

    }
}
