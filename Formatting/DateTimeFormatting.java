package Formatting;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DateTimeFormatting {

    public static void main(String[] args) {

        //  ISO and RFC patterns for predefined formats
        LocalDate localDate = LocalDate.of(2021, 4, 10);
        String now = DateTimeFormatter.ISO_LOCAL_DATE.format(localDate);
        System.out.println(now);

        String zonedDate = DateTimeFormatter.ISO_ZONED_DATE_TIME.format(localDate.atStartOfDay(ZoneId.of("US/Pacific")));
        System.out.println(zonedDate);

        // To format a date following the rules that are defined in RFC_1123
        // It  defines the requirements  for Internet host
        // software
        String rfc1123DateTime = DateTimeFormatter.RFC_1123_DATE_TIME.format(localDate.atStartOfDay(ZoneId.of("US/Pacific")));
        System.out.println(rfc1123DateTime);

        System.out.println(LocalDate.from(DateTimeFormatter.ISO_ZONED_DATE_TIME.parse("2021" +
                "-04-10T00:00:00-07:00[US/Pacific]")).plusMonths(1));

        ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.now(),ZoneId.of("America/Los_Angeles"));
        String fullDateTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).format(zonedDateTime);
        System.out.println(fullDateTime);

        ZonedDateTime zdt = ZonedDateTime.from(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).parse(fullDateTime));
        System.out.println(zdt);

        DateTimeFormatter dtf= DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).withLocale(Locale.FRANCE);
        String franceLocalDateTime =dtf.format(ZonedDateTime.now());
        System.out.println(franceLocalDateTime);
    }
}
