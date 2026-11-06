package com.learn.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

public class StreamReduceDemo {

    static void main() {
        List<String> departmentList = new ArrayList<>();
        departmentList.add("Supplly");
        departmentList.add("HR");
        departmentList.add("Sales");
        departmentList.add("IT");
        departmentList.add("Marketing");

        System.out.println(departmentList.stream().count());
        List<Integer> numbers=List.of(1,2,3,4,5);
        OptionalInt sum=numbers.stream()
                .filter(num->num%2==0)
                .mapToInt(num->num).max();
                //.reduce(0,Integer::sum);
        System.out.println(sum.getAsInt());



    }
}
