package com.learn.set;

import java.util.TreeSet;

public class TreeSetDemo {

    static void main() {
        TreeSet<String> treeset=new TreeSet<>();
        treeset.add("India");
        treeset.add("USA");
        treeset.add("Germany");
        System.out.println(treeset);
        treeset.remove("Germany");
        System.out.println("TreeSet after removal:"+treeset);
        System.out.println("Size of TreeSet:"+treeset.size());
        System.out.println("Is India present in TreeSet:"+treeset.contains("India"));
        System.out.println("First element of TreeSet:"+treeset.first());
        System.out.println("Last element of TreeSet:"+treeset.last());
    }
}
