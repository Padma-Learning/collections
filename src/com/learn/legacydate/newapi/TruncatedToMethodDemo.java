package com.learn.legacydate.newapi;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class TruncatedToMethodDemo {
    static void main() {
        Duration duration= Duration.ofDays(28).plusHours(6).plusMinutes(56).plusSeconds(19);
       Duration daysTruncated= duration.truncatedTo(ChronoUnit.DAYS);
       Duration hoursTruncated= duration.truncatedTo(ChronoUnit.HOURS);
        Duration minutesTruncated=





                duration.truncatedTo(ChronoUnit.MINUTES);

    }
}
