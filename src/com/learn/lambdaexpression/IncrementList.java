package com.learn.lambdaexpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class IncrementList {

    public static List<Integer> incrementList(
            List<Integer> numbers, int incrementValue) {

        // Define lambda expression
        UnaryOperator<Integer> increment = num -> num + incrementValue;

        // Create an empty result list
        List<Integer> result = new ArrayList<>();

        // Loop through the input list
        for (Integer number : numbers) {

            // Apply lambda expression to each number
            Integer updatedValue = increment.apply(number);

            // Add updated value to result list
            result.add(updatedValue);
        }

        return result;
    }

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        List<Integer> result = incrementList(numbers, 3);

        System.out.println(result);
    }
}
