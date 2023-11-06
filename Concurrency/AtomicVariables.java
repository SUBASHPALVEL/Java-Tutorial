package Concurrency;

import java.util.concurrent.atomic.AtomicLong;

class TicketDispenser {

    private AtomicLong ticketNumber = new AtomicLong(0);

    public void increment() {
        ticketNumber.getAndIncrement();
    }

    public long last() {
        return ticketNumber.get();
    }
}

public class AtomicVariables {

    public static void main(String[] args) {
        final TicketDispenser ticketDispenser = new TicketDispenser();

        for (int i = 1; i <= 1000; i++) {
            new Thread(new Runnable() {
                public void run() {
                    ticketDispenser.increment();
                }
            }).start();
        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("The last ticket number is " + ticketDispenser.last());
    }
}
