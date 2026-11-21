package com.learn.method.reference;

import java.util.List;

public class ClassMethodReference {
    static void main() {
        var list = List.of("Supply","HR","Sales","Marketing");
        list.forEach(department-> System.out.println(department));
        list.forEach(System.out::println);
    }
}
