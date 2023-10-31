package Concurrency;


class Counter implements Runnable {

    @Override
    public void run() {

        long counter = 0;

        while (true) {
            System.out.println(Thread.currentThread().getName() + ": " + counter);

            try {
                System.out.println("Thread will be sleeping for 5 seconds");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
 
                System.out.println(Thread.currentThread().getName() + " is " +
                        "INTERRUPTED by another thread");

                System.out.println(Thread.currentThread().getName() +
                        " is TERMINATED. No more messages.");
                return;
            }
            finally{
                System.out.println("Subash");
            }

            counter++;
        }
    }
}

public class InterruptsAndHandling {

    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread counterThread = new Thread(counter, "My Counter Thread");
        counterThread.start();

        try {
            System.out.println("Main thread will be sleeping for 15 seconds");
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        counterThread.interrupt();
    }
}
