package com.learn.stream;

import java.util.stream.Stream;

public class StreamSkipOperationDemo {

    static void main() {
        Stream.iterate(1,n->n+1)
                .skip(5)
                .limit(10)
                .forEach(System.out::println);
    }
}
