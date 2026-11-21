package com.learn.lambdaexpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    static void main() {
        Consumer<String> convertAndDisplay=input-> System.out.println(input.toUpperCase());
        convertAndDisplay.accept("Padma");

        Consumer<Integer> squareInt =input->System.out.println(input*input);
        List<Integer> numbersList= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        numbersList.forEach(squareInt);
        //squareInt.accept(4);

        Consumer<String> appendInput=input-> System.out.println("New value after appending is: Hello " +input);
        appendInput.accept("Padma");
        appendInput.andThen(convertAndDisplay).accept("Lambda Expression");
    }
}
