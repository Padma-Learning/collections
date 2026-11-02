package com.learn.legacydate.newapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class NewDateTimeAPIDemo {

    static void main() {
        LocalDate dateOnly=LocalDate.now();
        LocalTime timeOnly=LocalTime.now();
        LocalDateTime dateTime=LocalDateTime.now();
        ZonedDateTime dateTimeWithZone=ZonedDateTime.now();
        System.out.println(dateOnly);
        System.out.println(dateTime);
        System.out.println(timeOnly);
        System.out.println(dateTimeWithZone);

    }
}
