package Mathematics;

public class ArithmeticOverflow {

    public static void main(String[] args) {
        int number = Integer.MAX_VALUE;
        int sum = number + 1;
        System.out.println(sum);

        sum = Math.addExact(number, 1);
        System.out.println(sum);

        long longMin = Long.MIN_VALUE;
        long diff = Math.subtractExact(longMin, 1);
        System.out.println(diff);
    }
}
