package com.learn.legacydate.newapi;

import java.time.Duration;
import java.time.Period;

public class MultiDivNegateDemo {
    static void main() {
        Duration originalDuration=Duration.ofMinutes(30);
        Duration multipliedDuration=originalDuration.multipliedBy(2);
        Duration dividedDuration=originalDuration.dividedBy(2);
        Duration negateedDuration=originalDuration.negated();

        Period originalPeriod=Period.ofDays(3);
        Period multipliedPeriod=originalPeriod.multipliedBy(2);
        Period negateedPeriod=originalPeriod.negated();

    }
}
