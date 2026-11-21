package com.learn.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamMapOperationDemo {

    static void main() {
        List<String> departmentList=new ArrayList<>();
        departmentList.add("Supply");
        departmentList.add("HR");
        departmentList.add("IT");
        departmentList.add("Marketing");
        departmentList.add("Sales");

        departmentList.stream()
                .map(department->department.toUpperCase())
                .map(department->"Hi "+department)
                .forEach(System.out::println);

    }
}
