package GenericClass;

import java.math.BigDecimal;
import java.util.List;

public class UpperBoundedWildCards {

    public static Number sumUp(List<? extends Number> numberList) {
        Number sum = 0;
        for (Number number : numberList) {
            sum = sum.doubleValue() + number.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Number> numberList = List.of(1, 2, 3);
        System.out.println(sumUp(numberList));

        List<Double> doubleList = List.of(1.5, 2.5, 3.5);
        System.out.println(sumUp(doubleList));

        List<BigDecimal> bigDecimalList = List.of(new BigDecimal(100), new BigDecimal(200), new BigDecimal(300));
        System.out.println(sumUp(bigDecimalList));

        // List<String> stringList = List.of("a", "b");
        // sumUp(stringList); // Compilation error
    }
}
