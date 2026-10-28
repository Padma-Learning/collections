package com.learn.generics;

import java.util.Arrays;

public class SwapArray {

    public static <T> T[] sawp(T[] array, int index1, int index2){
        T temp=array[index1];
        array[index1]=array[index2];
        array[index2]=temp;
        return array;
    }

    static void main() {
        Integer[] intArray={1,2,3,4,5};
        sawp(intArray,1,2);
        System.out.println(Arrays.toString(intArray));
    }
}
