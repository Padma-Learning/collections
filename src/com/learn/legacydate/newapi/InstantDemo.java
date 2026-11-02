package com.learn.legacydate.newapi;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;

public class InstantDemo {

    static void main() {
        Instant i1=Instant.ofEpochSecond(1000);
        System.out.println(i1);
        Instant i2=Instant.now();
        System.out.println(i2);

        long nanoSeconds = i2.getEpochSecond();
        System.out.println(nanoSeconds);

        Duration d1=Duration.ofDays(5);
        Duration d2=Duration.ofMinutes(10);
        Duration d3=Duration.ofSeconds(30);
        Duration d4=Duration.ofSeconds(-20);
        Duration d5=d3.plus(d4);

        Instant i3=i1.plus(d1);
        Instant i4=i2.minus(d2);
        System.out.println(i3);
        System.out.println(i4);

        boolean isAfter=i3.isAfter(i4);
        boolean isBefore=i3.isBefore(i4);
        System.out.println(isBefore);
        System.out.println(isAfter);

       Duration duration= Duration.between(i1,i3);
        System.out.println(duration);






        LocalDateTime localDateTime=LocalDateTime.now();
    }
}
