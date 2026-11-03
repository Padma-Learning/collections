package com.learn.legacydate.newapi;

import java.time.OffsetTime;
import java.time.ZoneOffset;

public class OffsetDemo {

    static void main() {
        OffsetTime offsetTime=OffsetTime.of(15,30,0,0,ZoneOffset.ofHours(2));
        System.out.println(offsetTime);
        int hour=offsetTime.getHour();
        int minutes=offsetTime.getMinute();
        int seconds=offsetTime.getSecond();
        System.out.println(hour);
        System.out.println(minutes);
        System.out.println(seconds);
        ZoneOffset offset=offsetTime.getOffset();
        ZoneOffset india=ZoneOffset.of("+05:30");
        ZoneOffset california=ZoneOffset.of("-08:00");
        ZoneOffset utc=ZoneOffset.UTC;

        System.out.println(india);
        System.out.println(california);
        System.out.println(utc);
    }
}
