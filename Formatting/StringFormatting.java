package Formatting;

import java.time.LocalDate;
import java.util.Formatter;
import java.util.Locale;

public class StringFormatting {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        Formatter formatter = new Formatter(sb, Locale.US);
        formatter.format("%3$s and %2$1s and %1$s", "X", "Y", "Z");
        // where % indicates that that there will be Formatter arguments
        // the following number with dollar sign  indicates the argument index
        // s means  it will be replaced with by the corresponding argument
        System.out.println(sb);

        //if there is only one argument in the argument list we do not have to use argument index.

        String piExplanation = String.format("The PI number is denoted with the symbol %c", 0x1D70B);
        System.out.println(piExplanation);

        // we can also format decimal values
        String formattedE = String.format(Locale.FRANCE, "e =%-10.4f is Euler constant",Math.E);
        // .4 means  round using 4 digit precision for fractional part
        // f means format as a decimal number
        // -10 means 10 chars left justified
        // France locale that puts  comma as decimal point separator.
        System.out.println(formattedE);

        // we can format date and time in Strings
        LocalDate birthDate= LocalDate.of(1980,4,12);
        String formattedBirthDate= String.format("My birthdate is %1$tB " +
                "%1$te, %1$tY",birthDate);
        //t means date time format
        //B means full month name
        //e means day of month
        //Y means year
        System.out.println(formattedBirthDate);
    }
}
