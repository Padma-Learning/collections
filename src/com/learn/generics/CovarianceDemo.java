package com.learn.generics;

import com.learn.generics.model.Developer;
import com.learn.generics.model.Employee;
import com.learn.generics.model.Manager;

import java.util.ArrayList;
import java.util.List;

public class CovarianceDemo {

    static void main() {
        Employee[] employees={new Employee(), new Employee()};
            printArray(employees);
        Developer[] developers={new Developer(),new Developer()};
        printArray(developers);
        Manager[] managers={new Manager(), new Manager()};
        printArray(managers);

        String s="Generics";
        Object o=s;

        String[] sArray={"Genercs","Collections"};
        Object[] objArray=sArray;

        List<String> sList=new ArrayList<>();
        List<Object> oList=new ArrayList<>();

       // oList=sList;
        Number[] numArray={1,2,3};
        Object[] objectArray=numArray;//covariance accepted
        objectArray[0]="String";
    }
    public static void printArray(Employee[] employees){
        for(Employee employee:employees){
            System.out.println(employee);
        }

    }
}
