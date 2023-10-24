package DateClass;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodAndDuration {

    public static void main(String[] args) {
        LocalDate paymentDay = LocalDate.parse("2021-04-12");
        LocalDate nextPaymentDate = paymentDay.plus(Period.ofDays(15));
        System.out.println(nextPaymentDate);

        LocalDate myBirthday = LocalDate.of(2001, 11, 29);
        Period period = Period.between(myBirthday, LocalDate.now());
        System.out.println(period);

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime thousandMinutesLater = now.plus(Duration.ofMinutes(1000));
        System.out.println("now: " + now);
        System.out.println("thousandMinutesLater: " + thousandMinutesLater);

        LocalDateTime myBirthDateTime = LocalDateTime.parse("1979-06-18T00:00");
        Duration duration = Duration.between(myBirthDateTime, LocalDateTime.now());
        System.out.println(duration);

        long daysPassed = duration.getSeconds() / (24 * 60 * 60);
        System.out.println("daysPassed: " + daysPassed);
        System.out.println(ChronoUnit.DAYS.between(myBirthDateTime, LocalDateTime.now()));
    }
}
