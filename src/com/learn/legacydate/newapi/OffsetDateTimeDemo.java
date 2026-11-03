package com.learn.legacydate.newapi;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class OffsetDateTimeDemo {
    static void main() {

        ZoneOffset offset=ZoneOffset.ofHours(2);
        ZoneOffset destOffset=ZoneOffset.ofHours(-8);

        OffsetDateTime offsetDateTime=OffsetDateTime.now(offset);
        OffsetDateTime destOffsetDateTime=offsetDateTime.withOffsetSameInstant(destOffset);
        System.out.println(offsetDateTime);
        System.out.println(destOffsetDateTime);


    }
}
