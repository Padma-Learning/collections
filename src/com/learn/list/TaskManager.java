package com.learn.list;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    public static List<Task> makeToDoList() {
        /* Write your code below */
        List<Task> tasks=new ArrayList<>();
        tasks.add(new Task("Complete assignment"));
        tasks.add(new Task("Go for a run"));
        tasks.add(new Task("Buy groceries"));
        tasks.get(1).setCompleted(true);
        //dispaly all tasks using for-each
        int count=1;
        for( Task task:tasks){
            System.out.println(count+"."+task.getDescription());
            count ++;
        }
        return tasks;
    }

    public static void main(String[] args){
        List<Task> result=makeToDoList();
        System.out.println(result);
    }
}
