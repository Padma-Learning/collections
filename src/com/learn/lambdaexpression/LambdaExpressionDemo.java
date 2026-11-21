package com.learn.lambdaexpression;

public class LambdaExpressionDemo {

    static void main() {
        Hello hello=()-> System.out.println("Hello");
        Hello hello1=()-> System.out.println("Hello World");//Approach 1
        process(hello);
        process(hello1);
        process(()-> System.out.println("Hi"));//Approach 2

        ArithmeticOperation addition=(a,b)->a+b;
        System.out.println(addition.operation(5,5));

        ArithmeticOperation subtraction=(a,b)->a-b;
        System.out.println(subtraction.operation(5,5));

        ArithmeticOperation division=(a,b)->a/b;
        System.out.println(division.operation(5,5));

        ArithmeticOperation multiplication=(a,b)->a*b;
        System.out.println(multiplication.operation(5,5));
    }
    public static void process(Hello h){
        h.sayHello();
    }
}
