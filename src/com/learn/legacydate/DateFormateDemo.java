package com.learn.legacydate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormateDemo {

    static void main() throws ParseException {
        Date currentDate=new Date();
        System.out.println(currentDate);//Fri Oct 30 05:10:29 PDT 2026
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String formattedDate =dateFormat.format(currentDate);//2026-10-30 05:26:49
            System.out.println(formattedDate);

        SimpleDateFormat dateFormat1=new SimpleDateFormat("MM/dd/yyyy");
        String formattedDate1 =dateFormat1.format(currentDate);//10/30/2026
        System.out.println(formattedDate1);

        String dateString="2100-09-26 14:30:00";
        SimpleDateFormat dateFormat2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parsedDate=dateFormat2.parse(dateString);//Sun Sep 26 14:30:00 PDT 2100
        System.out.println(parsedDate);

        Date date = new Date(126, 11, 25);

        SimpleDateFormat simpleDateFormat =
                new SimpleDateFormat("yy-MMMM-dd HH:mm:ss");

        String formattedDate3 = simpleDateFormat.format(date);
        System.out.println(formattedDate3);

    }
}
