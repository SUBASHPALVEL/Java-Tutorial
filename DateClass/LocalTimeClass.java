package DateClass;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeClass {

    public static void main(String[] args) {
        LocalTime meetingTime = LocalTime.of(10, 30);
        meetingTime = LocalTime.parse("10:30");

        LocalTime now = LocalTime.now();

        int hour = meetingTime.getHour();
        System.out.println(hour);
        
        int nano = meetingTime.getNano();
        System.out.println(nano);

        int seconds = now.toSecondOfDay();
        System.out.println(seconds);

        LocalTime endOfMeeting = meetingTime.plus(90, ChronoUnit.MINUTES);
        System.out.println(endOfMeeting);

        System.out.println(meetingTime.isBefore(endOfMeeting));

        System.out.println(LocalTime.NOON);
    }
}
