package com.learn.wrapper;

public class UnBoxingDemo {

    public static void main(String[] args) {
        int num=20;
        //Approach 2 -with the help of valueOf()
        //Boxing
        Integer integer1=Integer.valueOf(num);
        Double douObj1=Double.valueOf("3.14");
        Long longObj1= Long.valueOf("454353");
        //Unboxing
        int num1=integer1.intValue();
        double num2=douObj1.doubleValue();
        long num3=longObj1.longValue();

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

    }
}
