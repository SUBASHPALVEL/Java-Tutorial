package Formatting;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class SimpleDecimalFormatting {

    public static void main(String[] args) {
        double number = 123.15;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String formattedNumber = decimalFormat.format(number);
        System.out.println(formattedNumber);

        decimalFormat = new DecimalFormat("0000.0000");
        formattedNumber = decimalFormat.format(number);
        System.out.println(formattedNumber);

        BigDecimal bigDecimal = new BigDecimal("1123456789.123456789");
        decimalFormat = new DecimalFormat("###,###.##");
        formattedNumber = decimalFormat.format(bigDecimal);
        System.out.println(formattedNumber);

        double ratio = 0.25;
        decimalFormat = new DecimalFormat("##.##%");
        formattedNumber = decimalFormat.format(ratio);
        System.out.println(formattedNumber);

        decimalFormat = new DecimalFormat("0000.####E0");
        formattedNumber = decimalFormat.format(Math.PI);
        System.out.println(formattedNumber);

    }
}
