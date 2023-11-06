package Concurrency;

import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

class SumTask implements Runnable {

    private int[] numbers;

    public SumTask(int[] numbers) {
        this.numbers = numbers;
    }

    public void run() {
        int sum = 0;

        for (int number : numbers)
            sum += number;

        System.out.println(Arrays.toString(numbers) + " sum = " + sum);
    }
}

public class ExecutorFramework {

    public static void main(String[] args) {

        Executor executor = Executors.newCachedThreadPool();

        executor.execute(new SumTask(new int[]{1, 2, 3, 4, 5}));
        executor.execute(new SumTask(new int[]{6, 7, 8, 9, 10}));
        // We did not define any thread object.
        // We burdened the thread creation and starting to the executor.

        // Executors have to be stopped explicitly - otherwise they keep
        // listening for new tasks.
        // We need to cast executor object to ThreadPoolExecutor.
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executor;

        // shutdown() method waits for currently running tasks to finish while
        // shutdownNow() method interrupts all running tasks and shut the
        // executor down immediately.
        threadPoolExecutor.shutdown();
    }
}
