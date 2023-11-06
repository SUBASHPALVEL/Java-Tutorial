package Concurrency;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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

public class ExecutorServiceFramework {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        // The executor service in a fixed thread-pool ensures that the pool
        // always has the given number of threads executing. If a thread dies
        // for any reason, it is immediately replaced by a new thread.

        executorService.execute(new SumTask(new int[]{1, 2, 3, 4, 5}));
        executorService.execute(new SumTask(new int[]{6, 7, 8, 9, 10}));
        // As you see we did not define any thread object.
        // We burdened the thread creation and starting to the executor service.

        // Executor services have to be stopped explicitly - otherwise they keep
        // listening for new tasks.
        // shutdown() method waits for currently running tasks to finish while
        // shutdownNow() method interrupts all running tasks and shut the
        // executor down immediately.
        executorService.shutdown();
    }
}
