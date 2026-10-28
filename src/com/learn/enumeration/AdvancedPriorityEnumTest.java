package com.learn.enumeration;

public class AdvancedPriorityEnumTest {

    static void main() {
        for(AdvancedPriorityEnum priorityEnum:AdvancedPriorityEnum.values()){

            String name=priorityEnum.name();
            int ordinal=priorityEnum.ordinal();
            int days=priorityEnum.getEstimateCompletionDays();
            System.out.println("name=" + name +", ordinal= "+ ordinal +",days = "+ days);

        }
    }
}
