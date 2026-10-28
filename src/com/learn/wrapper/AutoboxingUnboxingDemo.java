package com.learn.wrapper;

public class AutoboxingUnboxingDemo {

    public static void main(String[] args) {
        //Autoboxing
        Integer integer=20;
        Character c='M';
        Boolean boolObj=false;

        //Unboxing
        int num=integer;
        char m=c;
        boolean b=boolObj;

        System.out.println(num);
        System.out.println(m);
        System.out.println(b);

       // Integer nullObj=null;
        //int num1=nullObj;
    }
}
