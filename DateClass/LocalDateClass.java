package DateClass;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LocalDateClass {

    public static void main(String[] args) {
        LocalDate myBirthDate = LocalDate.of(1979, 5, 20);
        myBirthDate = LocalDate.parse("1979-05-20");
        System.out.println(myBirthDate);

        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate tomorrow = today.plusDays(1);
        System.out.println(tomorrow);

        LocalDate tenWeeksAgo = today.minusWeeks(10);
        System.out.println(tenWeeksAgo);

        LocalDate fiveYearsLater = today.plus(5, ChronoUnit.YEARS);
        System.out.println(fiveYearsLater);

        DayOfWeek dayOfWeek = today.getDayOfWeek();
        System.out.println(dayOfWeek);

        boolean isThisYearLeap = today.isLeapYear();
        System.out.println(isThisYearLeap);

        boolean isBefore = today.isBefore(tomorrow);
        System.out.println(isBefore);
    }
}
