package com.learn.legacydate.newapi;

import java.time.LocalDate;
import java.time.chrono.JapaneseDate;

public class JapaneseCalendarDemo {
    static void main() {
        JapaneseDate japaneseDate = JapaneseDate.now();
        LocalDate localDate = LocalDate.now();

        JapaneseDate japaneseDate1 =JapaneseDate.from(localDate);
        LocalDate localDate1=LocalDate.from(japaneseDate1);
    }
}
