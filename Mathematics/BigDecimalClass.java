package Mathematics;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigDecimalClass {

    public static void main(String[] args) {
        BigDecimal bigDecimalA = new BigDecimal("123456789123456789123456789" +
                ".123456789123456789123456789123456789");
        System.out.println(bigDecimalA);

        BigDecimal bigDecimalB = new BigDecimal(new char[]{'4', '.', '2', '3'});
        BigDecimal bigDecimalC = new BigDecimal(125);
        BigDecimal bigDecimalD = new BigDecimal(123456789L);
        BigDecimal bigDecimalE = new BigDecimal(123456789.123456789d);
        System.out.println(bigDecimalE);
        BigDecimal bigDecimalF = new BigDecimal(BigInteger.TEN);
        System.out.println(bigDecimalF);

        BigDecimal bigDecimalG = BigDecimal.valueOf(125, 3);
        System.out.println(bigDecimalG);

        System.out.println(bigDecimalG.unscaledValue());
        System.out.println(bigDecimalG.scale());

        System.out.println(bigDecimalA.add(bigDecimalB));

        BigDecimal divident = new BigDecimal(2.50f);
        BigDecimal divisor = new BigDecimal(0.8f);
        BigDecimal[] bigDecimals = divident.divideAndRemainder(divisor);
        System.out.println("division: " + bigDecimals[0]);
        System.out.println("remainder: " + bigDecimals[1]);

        System.out.println(bigDecimalA.compareTo(bigDecimalB));
    }
}
