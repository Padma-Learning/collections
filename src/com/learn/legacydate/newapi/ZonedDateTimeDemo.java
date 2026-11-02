package com.learn.legacydate.newapi;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo {
    static void main() {
        ZoneId zone=ZoneId.of("Asia/Kolkata");
        ZoneId destZone=ZoneId.of("America/Chicago");

        ZonedDateTime indiaDateTime=ZonedDateTime.now(zone);
        ZonedDateTime chicagoDateTime=indiaDateTime.withZoneSameInstant(destZone);
        System.out.println(indiaDateTime);
        System.out.println(chicagoDateTime);

        ZoneOffset offset=ZoneOffset.ofHours(2);
       ZoneOffset destOffset=ZoneOffset.ofHours(-8);

       ZonedDateTime utcDateTime=ZonedDateTime.now(offset);
       ZonedDateTime utcDestDateTime=indiaDateTime.withZoneSameInstant(destOffset);
        System.out.println(utcDateTime);
        System.out.println(utcDestDateTime);


    }

}
