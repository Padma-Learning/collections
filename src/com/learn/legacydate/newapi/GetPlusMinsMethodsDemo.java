package com.learn.legacydate.newapi;

import javax.naming.LinkLoopException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.LinkedList;

public class GetPlusMinsMethodsDemo {
    static void main() {
        LocalDate localDate= LocalDate.of(2015,3,18);
        int year=localDate.getYear();//2015
        Month month=localDate.getMonth();//March
        int day=localDate.getDayOfMonth();
        DayOfWeek dayOfWeek=localDate.getDayOfWeek();
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        System.out.println(dayOfWeek);

        LocalDateTime localDateTime= LocalDateTime.now();
        int hour=localDateTime.getHour();

        LocalDate ld1=localDate.plusDays(6);
        LocalDate ld2=localDate.plusMonths(6);
        LocalDate ld3=localDate.plusWeeks(2);

        LocalDate ld4= localDate.minusMonths(9);
        LocalDate ld5 =localDate.minusYears(7);

        System.out.println(ld1);
        System.out.println(ld2);
        System.out.println(ld3);
        System.out.println(ld4);
        System.out.println(ld5);



    }

}
