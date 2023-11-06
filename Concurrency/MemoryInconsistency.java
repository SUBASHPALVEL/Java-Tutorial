package Concurrency;

public class MemoryInconsistency {

    public static void main(String[] args)  {

        Counter counter = new Counter();
        Thread counterThreadA = new Thread() {
            @Override
            public void run() {
                counter.increment();
            }
        };

        Thread counterThreadB = new Thread() {
            @Override
            public void run() {
                counter.decrement();
            }
        };

        counterThreadA.start();
        counterThreadB.start();

        System.out.println("Counter = " + counter.getCounter());
    }
}

class Counter {
    private int counter = 0;

    public int getCounter() {
        return counter;
    }

    public void increment() {
        counter++;
        System.out.println("counter value after increment=" + counter);
    }

    public void decrement() {
        counter--;
        System.out.println("counter value after decrement=" + counter);
    }
}
