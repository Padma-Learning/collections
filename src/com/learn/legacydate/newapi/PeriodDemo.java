package com.learn.legacydate.newapi;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {
    static void main() {

        LocalDate localDate1 = LocalDate.of(2013, 1, 1);
        LocalDate localDate2 = LocalDate.of(2015, 3, 18);
        Period period = Period.between(localDate1, localDate2);
        System.out.println(period);
        Period oneYearTwoMonths=Period.of(1,2,0);
        System.out.println(oneYearTwoMonths);
        Period threeDays  =Period.ofDays(3);
        LocalDate localDate3=localDate1.plus(oneYearTwoMonths);
        System.out.println(threeDays);
        System.out.println(localDate3);

    }
}
