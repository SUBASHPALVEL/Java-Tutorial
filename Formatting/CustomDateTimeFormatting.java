package Formatting;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CustomDateTimeFormatting {

    public static void main(String[] args) {

        String customPattern = "dd/MM/yy";
        DateTimeFormatter customDateTimeFormatter = DateTimeFormatter.ofPattern(customPattern);
        System.out.println(customDateTimeFormatter.format(LocalDate.now()));

        customPattern = "dd.MMMM.yyyy, EEEE";
        customDateTimeFormatter = DateTimeFormatter.ofPattern(customPattern);
        System.out.println(customDateTimeFormatter.format(LocalDate.now()));

        customPattern = "hh:mm:ss a";
        customDateTimeFormatter = DateTimeFormatter.ofPattern(customPattern);
        System.out.println(customDateTimeFormatter.format(LocalTime.of(15,15)));

    }
}
