package com.learn.legacydate.newapi;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class CallShedulingDemo {
    public static void main(String[] args) {
        ZonedDateTime londonStartTime, londonEndTime, newYorkStartTime,newYorkEndTime;

        // Write your logic below
        londonStartTime= ZonedDateTime.of(2024,10,15,14,0,0,0, ZoneId.of("Europe/London"));
        londonEndTime=londonStartTime.plusHours(2);
        newYorkStartTime = londonStartTime.withZoneSameInstant(
                ZoneId.of("America/New_York"));
        newYorkEndTime = londonEndTime.withZoneSameInstant(
                ZoneId.of("America/New_York"));

        System.out.println("Conference Call Start Time (London): " + londonStartTime);
        System.out.println("Conference Call End Time (London): " + londonEndTime);
        System.out.println("Conference Call Start Time (New York): " + newYorkStartTime);
        System.out.println("Conference Call End Time (New York): " + newYorkEndTime);
    }
}
