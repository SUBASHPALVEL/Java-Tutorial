package Concurrency;

class Counter extends Thread {

    @Override
    public void run() {

        for (int i = 0; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ClassExtendingThread {

    public static void main(String[] args) {

        Counter counter = new Counter();
        Thread counterThreadA = new Thread(counter, "Counter Thread A");
        counterThreadA.start();

        Thread counterThreadB = new Thread(counter, "Counter Thread B");
        counterThreadB.start();

    }
}
