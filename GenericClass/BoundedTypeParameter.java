package GenericClass;

import java.math.BigDecimal;

public class BoundedTypeParameter {

    public static void main(String[] args) {

        Byte byteVal = 100;
        printSquareRoot(byteVal);

        Long longVal = 147L;
        printSquareRoot(longVal);

        BigDecimal bigDecimal = new BigDecimal(123456L);
        printSquareRoot(bigDecimal);

        // This will still cause a compilation error.
        //printSquareRoot("100");
    }

    public static <K extends Number> void printSquareRoot(K k) {
        System.out.println(Math.sqrt(k.doubleValue()));
    }
}
