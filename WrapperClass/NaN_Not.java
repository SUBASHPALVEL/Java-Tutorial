package WrapperClass;

public class NaN_Not {

    public static void main(String[] args) {
        double zero = 0;
        double positiveInfinity = Double.POSITIVE_INFINITY;
        double negativeInfinity = Double.NEGATIVE_INFINITY;
        System.out.println("positiveInfinity:" + positiveInfinity);
        System.out.println("negativeInfinity:" + negativeInfinity);

        System.out.println("zero / zero = " + (zero / zero));
        System.out.println("positiveInfinity - positiveInfinity = " + (positiveInfinity - positiveInfinity));
        System.out.println("negativeInfinity - negativeInfinity = " + (negativeInfinity - negativeInfinity));
        System.out.println("positiveInfinity * zero = " + (positiveInfinity * zero));

        System.out.println("Square Root Of Minus One = " + Math.sqrt(-1));
        System.out.println("Log Value Of -1 = " + Math.log(-1));

        double nan = Double.NaN;
        System.out.println("nan!=nan: " + (nan != nan));
        System.out.println(Double.NaN > 1);
        System.out.println(Double.NaN == Double.NaN);

        int y = 5, z = 5;
        System.out.println((Double.isNaN(0.0 / (y - z))));

        System.out.println(10 + Float.NaN);

        System.out.println(10.0 / 0);
    }
}
