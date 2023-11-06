package Concurrency;

class Counter implements Runnable {
    // Define a new counter field that is shared by all threads. It will be
    // like a  common counter.
    int commonCounter;

    // Define another counter field that  is not shared by all threads.
    // This will be like a local counter per thread.
    // We will use ThreadLocal class to define a thread local field.
    ThreadLocal<Integer> threadLocalCounter = new ThreadLocal<Integer>();

    public void run() {
        commonCounter++;
        if(threadLocalCounter.get() != null) {
            // If  there is an Integer object increment by one.         
            threadLocalCounter.set(threadLocalCounter.get().intValue() + 1);
        } else {
            // If threadLocalCounter has no Integer object then create and
            // initialize with 0;
            threadLocalCounter.set(1);
        }

        // Print the current values of commonCounter and threadLocalCounter
        System.out.println("commonCounter: " + commonCounter);
        System.out.println("threadLocalCounter: " + threadLocalCounter.get());
    }
}

public class ThreadLocalVariables {

    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread counterThreadA = new Thread(counter);
        Thread counterThreadB = new Thread(counter);
        Thread counterThreadC = new Thread(counter);

        counterThreadA.start();
        counterThreadB.start();
        counterThreadC.start();

        try {
            counterThreadA.join();
            counterThreadB.join();
            counterThreadC.join();

        } catch (Exception e) {

        }
    }
}
