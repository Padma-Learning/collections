package com.learn.wrapper;

public class BoxingDemo {

    public static void main(String[] args) {
        int num=20;
        //Approach 1 -with the help of Constructor
        //deprecated this approach  from java 9
        Integer integer=new Integer(num);
        Double douObj=new Double(3.14);
        Long longObj=new Long("454353");

        //Approach 2 -with the help of valueOf()
        Integer integer1=Integer.valueOf(num);
        Double douObj1=Double.valueOf("3.14");
        Long longObj1= Long.valueOf("454353");

        //Parsing string value convert into int
        int num1=Integer.parseInt("18");
        System.out.println(num1);

    }
}
