package ru.javawebinar.topjava;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimeUtil {

    public static boolean isBetween(LocalDateTime localTime, LocalDateTime after, LocalDateTime before) {
        return localTime.compareTo(after) >= 0 && localTime.compareTo(before) < 0;
    }
}
