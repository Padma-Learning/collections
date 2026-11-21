package com.learn.lambdaexpression;

import java.util.function.Function;

public class FunctionDemo {

    static void main() {
        Function<String,String> convertStr=(input)->input.toUpperCase();
        System.out.println(convertStr.apply("Padma"));

        Function<String,Integer> getStrLength=input->input.length();
        System.out.println(getStrLength.apply("Padma"));

        Function<String,String> sameValue =Function.identity();
        System.out.println(sameValue.apply("Hi Padma"));

        Function<Integer,Integer> doubleValue=num1->num1*2;
        Function<Integer,Integer> addThree=num->num+3;

        Function<Integer,Integer> output1=doubleValue.andThen(addThree);
        Function<Integer,Integer> output2=doubleValue.compose(addThree);
        System.out.println(output1.apply(5));//13
        System.out.println(output2.apply(3));

    }
}
