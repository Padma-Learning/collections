package com.learn.generics;

import java.util.List;
import java.util.ArrayList;

public class CollectionsWithOutGenericsExample {

    public static List createMixedList() {

        // Create a list to store mixed types of objects
        ArrayList list=new ArrayList();
        list.add("Hello");
        list.add(123);
        list.add(3.14);
        list.add(true);

        String greeting=(String)list.get(0);
        int num=(Integer)list.get(1);
        double dnum=(Double)list.get(2);
        boolean flag=(Boolean)list.get(3);

        return list;

    }

}
