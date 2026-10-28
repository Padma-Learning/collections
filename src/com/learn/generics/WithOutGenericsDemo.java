package com.learn.generics;

import java.util.ArrayList;

public class WithOutGenericsDemo {

    static void main() {
        ArrayList list=new ArrayList();
        list.add("Hello");
        list.add(123);
        list.add(true);

        String greeting=(String)list.get(0);
        int number = (Integer)list.get(1);
        boolean flag=(Boolean) list.get(2);


        ArrayList<String> list1=new ArrayList<>();
        list1.add("Hello");
       // list1.add(123);
        //list1.add(true);

        String greeting1=(String)list.get(0);
       // int number = (Integer)list.get(1);
       // double flag=(Double)list.get(0);

    }
}
