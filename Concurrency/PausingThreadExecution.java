package Concurrency;

import java.time.LocalDateTime;

public class PausingThreadExecution {

    public static void main(String args[]) {
        String countryNames[] = {"USA", "Germany", "France", "Spain"};

        for (int i = 0; i < countryNames.length; i++) {

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(countryNames[i] + ": " + LocalDateTime.now());

        }

    }
}
