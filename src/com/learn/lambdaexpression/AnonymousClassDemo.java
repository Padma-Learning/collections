package com.learn.lambdaexpression;

public class AnonymousClassDemo {

    static void main() {
        Hello hello=new Hello() {
            @Override
            public void sayHello() {
                System.out.println("Anonymous");
            }
        };
        process(hello);
        process(new Hello() {
            @Override
            public void sayHello() {
                System.out.println("Anonymous 1");
            }
        });
    }
    public static void process(Hello h){

        h.sayHello();
    }
}
