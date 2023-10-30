package Formatting;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class LocalisedDecimalFormatting {

    public static void main(String[] args) {

        BigDecimal bigDecimal = new BigDecimal("1000000000.123456789");
        DecimalFormat decimalFormat = new DecimalFormat("#,###.##\u00A4");
        String formattedNumber = decimalFormat.format(bigDecimal);
        System.out.println("Default locale:" + Locale.getDefault());

        System.out.println("Group Separator:" + decimalFormat.getDecimalFormatSymbols().getGroupingSeparator());
        System.out.println("Currency Symbol:" + decimalFormat.getCurrency().getSymbol());
        System.out.println("formattedNumber:" + formattedNumber);

        DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance(Locale.FRANCE);
        decimalFormat = new DecimalFormat("#,###.##\u00A4", decimalFormatSymbols);
        formattedNumber = decimalFormat.format(bigDecimal);
        System.out.println("Applied locale:" +Locale.FRANCE );
        System.out.println("Group Separator:" + decimalFormat.getDecimalFormatSymbols().getGroupingSeparator());
        System.out.println("Currency Symbol:" + decimalFormat.getCurrency().getSymbol());
        System.out.println("formattedNumber:" + formattedNumber);
    }
}
