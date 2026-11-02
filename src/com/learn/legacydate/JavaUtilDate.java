package com.learn.legacydate;

import java.util.Date;

public class JavaUtilDate {
    static void main() {

        Date currentDate = new Date();
        currentDate.setYear(200);
        System.out.println(currentDate);
        long timeInms=currentDate.getTime();
        System.out.println(timeInms);

        Date futureDate=new Date(200,8,26,8,15,39);
        System.out.println(futureDate);//Sun Sep 26 00:00:00 PDT 2100
        long futureTimeInms=futureDate.getTime();
        System.out.println(futureTimeInms);

        Date date=new Date(timeInms+86400000);
        System.out.println(date);

      boolean isAfter  =futureDate.after(date);
        System.out.println(isAfter);

    }
}
