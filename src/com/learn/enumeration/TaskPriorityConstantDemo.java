package com.learn.enumeration;

public class TaskPriorityConstantDemo {

    static void main() {
        System.out.println(TaskUtil.getEstimatedCompletionTime(PriorityEnum.LOW));
        System.out.println(TaskUtil.getEstimatedCompletionTime(PriorityEnum.MEDIUM));
        System.out.println(TaskUtil.getEstimatedCompletionTime(PriorityEnum.HIGH));
        System.out.println(TaskUtil.getEstimatedCompletionTime(PriorityEnum.URGENT));
        System.out.println(PriorityEnum.URGENT);
    }
}
