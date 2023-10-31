package Concurrency;

class Counter implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }

        }
    }
}

public class ThreadJoins {

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();
        Thread counterThread = new Thread(counter, "My Counter Thread");
        counterThread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread: " + i);
            if (i == 5) {
                System.out.println("MAIN THREAD IS WILL BE WAITING UNTIL THE counterThreadA WILL TERMINATE");
                counterThread.join();

            }

            Thread.sleep(1000);

        }

    }
}
