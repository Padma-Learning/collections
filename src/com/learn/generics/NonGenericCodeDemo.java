package com.learn.generics;

public class NonGenericCodeDemo {

    static void main() {
        Pair stringInrPair=new Pair("Hello",42);
        String myString=(String)stringInrPair.getFirst();//requires casting
        int myInt=(Integer)stringInrPair.getSecond();
        stringInrPair.setFirst(16);//no compilation error but get run time error
        //System.out.println(stringInrPair.getFirst());
       // System.out.println(stringInrPair.getSecond());
    }
}
