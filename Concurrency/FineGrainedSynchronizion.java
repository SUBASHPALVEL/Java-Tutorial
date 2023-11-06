package Concurrency;

class MultipleCounter {
    private int counterA = 0;
    private int counterB = 0;
    private Object lockA = new Object();
    private Object lockB = new Object();

    public void incCounterA() {
        synchronized (lockA) {
            counterA++;
            System.out.println("counterA = " + counterA);
        }
    }

    public void incCounterB() {
        synchronized (lockB) {
            counterB++;
            System.out.println("counterB = " + counterB);
        }
    }
}

public class FineGrainedSynchronizion {

    public static void main(String[] args) {
        MultipleCounter multipleCounter = new MultipleCounter();

        Thread threadA = new Thread() {
            @Override
            public void run() {
                multipleCounter.incCounterA();
            }
        };

        Thread threadB = new Thread() {
            @Override
            public void run() {
                multipleCounter.incCounterB();
            }
        };

        threadA.start();
        threadB.start();
    }
}
