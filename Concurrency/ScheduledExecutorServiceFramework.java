package Concurrency;

import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class LogTask implements Runnable {
    public void run() {
        System.out.println("Execution Time: " + LocalDateTime.now());
    }
}

public class ScheduledExecutorServiceFramework {

    public static void main(String[] args) {
        // Now define an ScheduledExecutorService service by using the static
        // factory method of the Executors class.
        // In this example we will use Single Scheduled Thread.
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();

        LogTask logTask = new LogTask();

        System.out.println("Submitting Time: " + LocalDateTime.now());

        scheduledExecutorService.schedule(logTask, 5, TimeUnit.SECONDS);
        scheduledExecutorService.shutdown();
    }
}
