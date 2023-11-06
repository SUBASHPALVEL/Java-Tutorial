package Concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableCalculatorService implements Callable<Double> {
    double number;

    public CallableCalculatorService(double number) {
        this.number = number;
    }

    @Override
    public Double call() throws Exception {
        Thread.sleep(5000);
        return Math.pow(number, 3);
    }
}

public class CallableAndFuture {

    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        CallableCalculatorService callableCalculatorService = new CallableCalculatorService(5);

        System.out.println("Submitting Callable Calculator Service");
        Future<Double> future = executorService.submit(callableCalculatorService);

        System.out.println("This line is executed immediately.");
        System.out.println("Waiting for the result.....");

        // Future.get() method blocks until the result is available.
        // Call the future.get() method to retrieve the result of call() method.
        Double result = future.get();
        System.out.println("Result is " + result);

        executorService.shutdown();
    }
}
