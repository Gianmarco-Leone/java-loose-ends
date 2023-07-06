// Exercise5.
// Write code to determine the current age of your own country.
//    1. Write code to determine your own age exactly
//    2. Write code to determine how many days until the next New Year (or any holiday you
//       choose). Note/hint: ChronoUnit has enums for various time intervals which also have
//       useful methods.
//    3. If you began an activity at 9:37:20 and stopped at 19:13:41, how best can you write
//       code to determine how much time elapsed?
//       1. What if you want to know the elapsed time in minutes?
//
// Exercise6.
// How much will have elapsed if you depart from Seoul, South Korea at 13:15:00 February 3,
// 2022 and arrive in London, UK at 20:02:13, February 3, 2022?
//    1. When you arrive in London, what time will it be in Los Angeles, California?

package com.gianmarco.ends;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Exercise5 {

    public static void main(String[] args) {
        // 5.0
        LocalDate stateBirth = LocalDate.of(1861, 3, 17);
        LocalDate today = LocalDate.now();
        Period stateAge = Period.between(stateBirth, today);
//        System.out.println(stateAge);

        // 5.1
        LocalDate myBirthDate = LocalDate.of(1996, 4, 24);
        Period myAge = Period.between(myBirthDate, today);
//        System.out.printf("%d anni, %d mesi e %d giorni%n", myAge.getYears(), myAge.getMonths(), myAge.getDays());

        // 5.2
        LocalDate newYear = LocalDate.ofYearDay(2024, 1);
        long daysToNewYear = ChronoUnit.DAYS.between(today, newYear);
//        System.out.println(daysToNewYear);

        // 5.3
        LocalTime startActivity = LocalTime.of(9, 37, 20);
        LocalTime endActivity = LocalTime.of(19, 13, 41);
        Duration dur = Duration.between(startActivity, endActivity);
        System.out.println(dur);
        System.out.println(dur.toMinutes()); // 5.3.1

        // 6.0
        ZonedDateTime departures = ZonedDateTime.of(2022, 2, 3, 13, 15, 0, 0, ZoneId.of("Asia/Seoul"));
        ZonedDateTime arrival = ZonedDateTime.of(2022, 2, 3, 20, 02, 13, 0, ZoneId.of("Asia/Seoul"));
        Duration flightTime = Duration.between(departures, arrival);
        System.out.println(flightTime);

        // 6.1
        ZonedDateTime timeInLA = arrival.withZoneSameInstant(ZoneId.of("America/Los_Angeles"));
        System.out.println(timeInLA);
    }
}
