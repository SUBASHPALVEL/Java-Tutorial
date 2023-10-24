package Mathematics;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BigDecimalRounding {

    public static void main(String[] args) {
        BigDecimal bigDecimalPI = new BigDecimal("3.14159265358979323846");
        System.out.println(bigDecimalPI);

        MathContext mathContext = new MathContext(5, RoundingMode.HALF_UP);
        BigDecimal roundedPI = bigDecimalPI.round(mathContext);
        System.out.println(roundedPI);

        mathContext = new MathContext(5, RoundingMode.DOWN);
        roundedPI = bigDecimalPI.round(mathContext);
        System.out.println(roundedPI);

        roundedPI = bigDecimalPI.round(MathContext.DECIMAL32);
        System.out.println(roundedPI);

        BigDecimal a = new BigDecimal(5.5f);
        BigDecimal roundedA = a.round(new MathContext(1, RoundingMode.HALF_EVEN));
        System.out.println(roundedA);

        BigDecimal b = new BigDecimal(2.5f);
        BigDecimal roundedB = b.round(new MathContext(1, RoundingMode.HALF_EVEN));
        System.out.println(roundedB);
    }
}
