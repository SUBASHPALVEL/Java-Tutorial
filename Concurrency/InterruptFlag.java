package Concurrency;

class Counter implements Runnable {

    @Override
    public void run() {

        long counter = 0;

        while (true) {
            System.out.println(Thread.currentThread().getName() + ": " + counter);

            if (Thread.interrupted()) {
                // This method returns true if the interruption flag is
                // up and also clears the interruption status. So that it
                // returns true and reset the flag to false.

                System.out.println(Thread.currentThread().getName() + " is INTERRUPTED by another thread");
                System.out.println(Thread.currentThread().getName() + " is TERMINATED. No more messages.");
                return;
            }
            counter++;
        }
    }
}

public class InterruptFlag {

    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread counterThread = new Thread(counter, "My Counter Thread");
        counterThread.start();

        try {
            System.out.println("Main thread will be sleeping for 100 milliseconds");
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (!counterThread.isInterrupted())
            counterThread.interrupt();
    }
}
