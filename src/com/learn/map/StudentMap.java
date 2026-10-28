package com.learn.map;

import java.util.HashMap;
import java.util.Map;

public class StudentMap {

    static void main() {
        Map<Integer, String> students=new HashMap<>();
        students.put(101,"Ravi");
        students.put(102,"Sneha");
        students.put(103,"James");

        System.out.println(students);
        System.out.println(students.get(101));
        System.out.println(students.size());
        System.out.println(students.containsKey(101));
        students.remove(103);
        System.out.println(students);
    }
}
