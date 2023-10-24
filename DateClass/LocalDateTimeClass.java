package DateClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeClass {

    public static void main(String[] args) {
        LocalDateTime meetingDateTime = LocalDateTime.of(2021, Month.OCTOBER,
                3, 10, 30);
        meetingDateTime = LocalDateTime.parse("2021-10-03T10:30");
        System.out.println(meetingDateTime);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDate meetingDate = meetingDateTime.toLocalDate();
        System.out.println(meetingDate);

        LocalTime meetingTime = meetingDateTime.toLocalTime();
        System.out.println(meetingTime);

        int dayOfYear = meetingDateTime.getDayOfYear();
        System.out.println(dayOfYear);

        LocalDateTime nextMeeting = meetingDateTime.plus(6,
                ChronoUnit.MONTHS);
        System.out.println(nextMeeting);

        System.out.println(meetingDateTime.isBefore(nextMeeting));

        System.out.println(LocalDateTime.MIN);
        System.out.println(LocalDateTime.MAX);
    }
}
