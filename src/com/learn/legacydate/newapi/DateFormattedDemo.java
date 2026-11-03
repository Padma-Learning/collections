package com.learn.legacydate.newapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateFormattedDemo {

    static void main() {

        LocalDate localDate = LocalDate.of(2015, 3, 18);

        LocalTime localTime = LocalTime.of(15, 30, 0);

        LocalDateTime localDateTime =
                LocalDateTime.of(2015, 3, 18, 15, 30, 0);

        DateTimeFormatter dateFormatter =
                DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String formatedDate=dateFormatter.format(localDate);

        System.out.println(localDate.format(dateFormatter));
        System.out.println(localTime);
        System.out.println(localDateTime);
        System.out.println(formatedDate);

        DateTimeFormatter timeFormatterr=
                DateTimeFormatter.ofPattern("h:mm a");
        String formatedTime=timeFormatterr.format(localTime);
        System.out.println(formatedTime);

        DateTimeFormatter dateTimeFormatterr=
                DateTimeFormatter.ofPattern("dd/MM/yyyy h:mm a");
        String formattedDateTime=dateTimeFormatterr.format(localDateTime);
        System.out.println(formattedDateTime);

        String formattedDate1=localDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(formattedDate1);

        DateTimeFormatter germanFormatter=DateTimeFormatter.ofPattern("d.MMMM yyyy", Locale.GERMAN);
        String germanFormate=germanFormatter.format(localDate);
        System.out.println(germanFormate);


    }
}