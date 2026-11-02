package com.learn.legacydate;

import java.util.Date;

public class JavaSQLDate {

    static void main() {
        Date currentDate=new Date(System.currentTimeMillis());
        java.util.Date currentDate1=new java.util.Date(System.currentTimeMillis());
        System.out.println(currentDate);
        System.out.println(currentDate1);
    }
}
