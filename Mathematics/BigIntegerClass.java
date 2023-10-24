package Mathematics;

import java.math.BigInteger;
import java.util.Random;

public class BigIntegerClass {

    public static void main(String[] args) {
        BigInteger bigIntegerA = new BigInteger("123456789123456789123456789");
        System.out.println(bigIntegerA);

        byte[] bytes = new byte[]{127, 127};
        BigInteger bigIntegerB = new BigInteger(bytes);
        System.out.println(bigIntegerB);
        bigIntegerB = new BigInteger(-1, bytes);
        System.out.println(bigIntegerB);

        BigInteger bigIntegerC = BigInteger.valueOf(Long.MAX_VALUE);
        System.out.println(bigIntegerC);

        System.out.println(bigIntegerA.compareTo(bigIntegerB));

        BigInteger sum = bigIntegerA.add(bigIntegerB);
        System.out.println(sum);

        bigIntegerC = bigIntegerC.add(BigInteger.ONE);
        System.out.println(bigIntegerC);

        BigInteger bitwiseAnd = bigIntegerA.and(bigIntegerB);
        System.out.println(bitwiseAnd);

        BigInteger bitWiseRightShift = bigIntegerA.shiftRight(1);
        System.out.println(bitWiseRightShift);

        BigInteger bigIntegerE = BigInteger.TWO;
        System.out.println(bigIntegerE.bitCount());
        System.out.println(bigIntegerE.flipBit(0));

        BigInteger bigIntegerF = new BigInteger("12000000");
        BigInteger bigIntegerG = new BigInteger("1200000000000000005");
        BigInteger gcd = bigIntegerF.gcd(bigIntegerG);
        System.out.println(gcd);

        System.out.println(bigIntegerA.mod(BigInteger.TWO));

        BigInteger primeNumber = BigInteger.probablePrime(512, new Random());
        System.out.println(primeNumber);
    }
}
