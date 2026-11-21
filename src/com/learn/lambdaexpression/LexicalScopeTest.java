package com.learn.lambdaexpression;

public class LexicalScopeTest {

    static void main() {
        String input="Hello World";
        Printer printer=input1-> {

            System.out.println(input);

        };
        printer.print(input);
    }
}
