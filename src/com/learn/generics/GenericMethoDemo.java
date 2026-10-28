package com.learn.generics;

public class GenericMethoDemo {

    static void main() {
        String[] stringArray={"Hello","World"};
        printArray(stringArray);
        Integer[] intArray={1,2,3,4,5};
        printArray(intArray);
    }

    public static<T> void printArray(T [] array){
        for(T element:array){
            System.out.println(element);
        }
    }
}
