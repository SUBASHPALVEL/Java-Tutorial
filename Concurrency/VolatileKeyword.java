package Concurrency;

public class VolatileKeyword {

    private static int number = 0;
    private static volatile boolean canPrint = false;

    private static class Printer extends Thread {
        @Override
        public void run() {
            while (!canPrint) {
                Thread.yield();
            }
            System.out.println(number);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new Printer().start();
        number = 100;
        canPrint = true;
    }
}
