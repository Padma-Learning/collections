package com.learn.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollectOperationDemo {
    static void main() {
        List<String> departmentList = new ArrayList<>();
        departmentList.add("Supplly");
        departmentList.add("HR");
        departmentList.add("Sales");
        departmentList.add("IT");
        departmentList.add("Marketing");

        List<String> newDepartmentList=departmentList.stream()
                .filter(word->word.startsWith("S"))
                .collect(Collectors.toList());
        newDepartmentList.forEach(System.out::println);


     long totalCount=departmentList.stream()
                .filter(word->word.startsWith("S"))
                .collect(Collectors.counting());
        System.out.println(totalCount);
    }
}
