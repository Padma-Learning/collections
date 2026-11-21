package com.learn.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class StreamLimitOperationDemo {

    static void main() {
        Stream.generate(new Random()::nextInt)
                .limit(10)
                .forEach(System.out::println);

    }
}
