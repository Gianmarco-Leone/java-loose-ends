// Write code to parse each of these dates and print their
// corresponding date/time object.
// 1-> 2022-02-09T05:02:01Z
// 2-> 2022-02-09T05:02:01+0000
// 3-> Wed, 09 Feb 2022 05:02:01 +0000
// 4-> Wednesday, 09-Feb-22 05:02:01 UTC
// 5-> Wed, 09 Feb 22 05:02:01 +0000
// 6-> Wed, 09 Feb 2022 05:02:01 +0000
// 7-> Wed, 09 Feb 22 05:02:01 +0000
// 8-> 2022-02-09T05:02:01+00:00
// 9-> 2022-02-09T05:02:01+00:00
// 10-> Wednesday, 09-Feb-2022 05:02:01 UTC
// 11-> Wed, 09 Feb 2022 05:02:01 +0000
// 12-> 2022-02-09T05:02:01+00:00
// 13-> 1644382921
// 14-> 2022-09-02 05:02:01
// 15-> 2022-09-02 05:02:01 AM
// 16-> 09-02-2022 05:02:01
// 17-> 02-09-2022 05:02:01

package com.gianmarco.ends;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import static java.time.format.DateTimeFormatter.ISO_INSTANT;
import static java.time.format.DateTimeFormatter.ofPattern;

public class Exercise7 {

    public static void main(String[] args) {
        // 1
//        System.out.println(Instant.from(ISO_INSTANT.parse("2022-02-09T05:02:01Z")));

        // 2
//        System.out.println(ZonedDateTime.from(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'kk:mm:ssxx").parse("2022-02-09T05:02:01+0000")));

        // 3
//        System.out.println(ZonedDateTime.from(DateTimeFormatter.ofPattern("E, dd MMM yyyy kk:mm:ss xx").parse("Wed, 09 Feb 2022 05:02:01 +0000")));

        // 4
//        System.out.println(ZonedDateTime.parse("Wednesday, 09-Feb-22 05:02:01 UTC", DateTimeFormatter.ofPattern("EEEE, dd-MMM-yy kk:mm:ss z")));

        // 5
//        System.out.println(ZonedDateTime.parse("Wed, 09 Feb 22 05:02:01 +0000", ofPattern("E, dd MMM yy kk:mm:ss xx")));

        // 13
        System.out.println(Instant.ofEpochSecond(1644382921).atZone(ZoneId.of("+0")));
    }
}
