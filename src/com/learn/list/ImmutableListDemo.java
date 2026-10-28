package com.learn.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ImmutableListDemo {

    static void main() {
        List<Integer>  accountNums=new ArrayList<>();
        accountNums.add(325431);
        accountNums.add(325456);
        accountNums.add(325489);
        //immutable declaration
        accountNums=Collections.unmodifiableList(accountNums);
        List<Integer> immutableAccountNums=List.of(325431,325456,325489);
        addTenDollars(accountNums);

    }
    private static List<Integer> addTenDollars(List<Integer> accountNums)
    {
        for(Integer account:accountNums){
            System.out.println("Ten Dollars credited into the account:"+account);
        }
        return accountNums;
    }
}
