package com.learn.enumeration;

public enum AdvancedPriorityEnum {

    LOW(7),MEDIUM(5),HIGH(2),URGENT(1);

    private int estimateCompletionDays;

     AdvancedPriorityEnum(int estimateCompletionDays){
        this.estimateCompletionDays=estimateCompletionDays;
    }

    public int getEstimateCompletionDays(){
        return estimateCompletionDays;
    }
    }

