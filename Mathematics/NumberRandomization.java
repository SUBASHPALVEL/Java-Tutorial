package Mathematics;

import java.util.Random;

public class NumberRandomization {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++)
            System.out.println(Math.random());

        long lowerLimit = 1;
        long upperLimit = 100;
        long myRandom =
                lowerLimit + (long) (Math.random() * (upperLimit - lowerLimit));

        System.out.println(myRandom);

        Random random = new Random();
        for (int i = 0; i < 5; i++)
            System.out.println(random.nextLong());

        for (int i = 0; i < 5; i++)
            System.out.println(random.nextFloat());
    }
}
