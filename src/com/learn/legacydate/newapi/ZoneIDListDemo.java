package com.learn.legacydate.newapi;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIDListDemo {
    static void main() {
        Set<String> allZones= ZoneId.getAvailableZoneIds();
        System.out.println(allZones.size());

        for(String zoneId:allZones){
            System.out.println(zoneId);

        }
    }
}
