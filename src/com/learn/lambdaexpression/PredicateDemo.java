package com.learn.lambdaexpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PredicateDemo {

    static void main() {
        Predicate<Integer> isEven=num->num%2==0;
        System.out.println(isEven.test(16));
        System.out.println(isEven.test(17));

        Predicate<Integer> isGreaterThan50 = num->num>50;
        System.out.println(isGreaterThan50.test(16));
        System.out.println(isEven.test(60));
//To check if the number is even and greater than 50
        System.out.println(isEven.and(isGreaterThan50).test(62));

        //To check if the number is even or greater than 50
        System.out.println(isEven.or(isGreaterThan50).test(63));

        System.out.println(isEven.negate().test(63));//true
        Predicate<Integer> isOdd=Predicate.not(isEven);//true
        System.out.println(isOdd.test(3));

        Predicate<String> checkEquality=Predicate.isEqual("Padma");
        System.out.println(checkEquality.test("Krishna"));

        List<Integer> integers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> evenList=integers.stream().filter(isEven).collect(Collectors.toList());
        System.out.println(evenList);
    }
}
