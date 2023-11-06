package Concurrency;
import java.util.Random;

public class InterThreadCommunication {

    public static void main(String[] args) {
        NumberBuffer b = new NumberBuffer();
        NumberProducer p = new NumberProducer(b);
        NumberCalculator c = new NumberCalculator(b);
        p.start();
        c.start();
    }
}

class NumberBuffer {
    int producedNumber;
    boolean produced = false;
    Random random = new Random();

    public synchronized void put() {
        if (produced) {
            System.out.println("Number producer is waiting...");
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        producedNumber = random.nextInt(10);
        System.out.println("Product " + producedNumber + " is produced.");
        produced = true;
        notify();
    }

    public synchronized void calculateCube() {
        if (!produced) {
            System.out.println("Cube Calculator is waiting...");
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("Number " + producedNumber + " is consumed.");
        System.out.println("Cube of " + producedNumber + " is " + Math.pow(producedNumber, 3));
        produced = false;
        notify();
    }
}

class NumberProducer extends Thread {
    NumberBuffer numberBuffer;

    public NumberProducer(NumberBuffer numberBuffer) {
        this.numberBuffer = numberBuffer;
    }

    public void run() {
        System.out.println("NumberProducer start producing...");
        for (int i = 1; i <= 3; i++) {
            numberBuffer.put();
        }
    }
}

class NumberCalculator extends Thread {
    NumberBuffer numberBuffer;

    public NumberCalculator(NumberBuffer numberBuffer) {
        this.numberBuffer = numberBuffer;
    }

    public void run() {
        System.out.println("NumberCalculator start consuming...");
        for (int i = 1; i <= 3; i++) {
            numberBuffer.calculateCube();
        }
    }
}
