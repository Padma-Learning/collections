package com.learn.legacydate;

import java.util.TimeZone;

public class TimeZoneIDList {
    static void main() {
        String[] timeZoneIds=TimeZone.getAvailableIDs();
        for(String timezoneId:timeZoneIds)
        {
            System.out.println(timezoneId);
        }
    }

}
