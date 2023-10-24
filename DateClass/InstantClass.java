package DateClass;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class InstantClass {

    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);

        long epochSecond = instant.getEpochSecond();
        System.out.println(epochSecond);

        int nanoPart = instant.getNano();
        System.out.println(nanoPart);

        long milliSeconds = instant.toEpochMilli();
        System.out.println(milliSeconds);

        System.out.println(System.currentTimeMillis());

        Instant anInstantInTheTimeLine = Instant.ofEpochSecond(1_000_000);
        LocalDateTime aDateInTheTimeLine =
                LocalDateTime.ofInstant(anInstantInTheTimeLine, ZoneId.of("US/Pacific"));
        System.out.println(aDateInTheTimeLine);
    }
}
