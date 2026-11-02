package com.learn.legacydate.newapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.*;

public class ToAndAtMethodsDemo {

    static void main() {

        LocalDateTime dateTime=LocalDateTime.of(2015, Month.MARCH,18,22,30);
        System.out.println(dateTime);

        LocalDate date =dateTime.toLocalDate();
        LocalTime time=dateTime.toLocalTime();
        System.out.println(date);
        System.out.println(time);

        LocalDate localDate=LocalDate.of(2015,3,18);
        LocalDateTime startOfDay=localDate.atStartOfDay();
        System.out.println(startOfDay);
        LocalDateTime localDateTime=localDate.atTime(18,20);
        System.out.println(localDateTime);


    }

}
