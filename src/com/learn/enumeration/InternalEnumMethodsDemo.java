package com.learn.enumeration;

public class InternalEnumMethodsDemo {

    static void main() {
        for(PriorityEnum priorityEnum:PriorityEnum.values()){
            String name=priorityEnum.name();
            int ordinal=priorityEnum.ordinal();
            System.out.println(name+" ("+ ordinal +")");
        }
        PriorityEnum low=PriorityEnum.valueOf("LOW");
        System.out.println(low);
        PriorityEnum high =PriorityEnum.values()[2];
        System.out.println(high);
    }
}
