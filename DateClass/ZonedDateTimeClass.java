package DateClass;

import java.time.*;

public class ZonedDateTimeClass {

    public static void main(String[] args) {
        LocalDateTime meetingDateTime = LocalDateTime.parse("2020-04-20T10:30");

        ZoneId zoneId = ZoneId.of("US/Pacific");
        ZonedDateTime usMeetingDateTime = ZonedDateTime.of(meetingDateTime,
                zoneId);

        System.out.println("Local: " + meetingDateTime);
        System.out.println("US Pacific: " + usMeetingDateTime);

        for (String availableZoneId : ZoneId.getAvailableZoneIds()) {
            System.out.println(availableZoneId);
        }

        ZoneOffset zoneOffset = ZoneOffset.of("+01:00");
        OffsetDateTime offsetMeetingDateTime = OffsetDateTime.of(meetingDateTime,
                zoneOffset);
        System.out.println(offsetMeetingDateTime);
    }
}
