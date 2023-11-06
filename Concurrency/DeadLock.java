package Concurrency;

public class DeadLock {
    public static void main(String[] args) {
        Object objectA = new Object();
        Object objectB = new Object();
        Thread threadA = new Thread(new ThreadA(objectA, objectB));
        Thread threadB = new Thread(new ThreadB(objectA, objectB));
        threadA.start();
        threadB.start();
    }
}

class ThreadA implements Runnable {
    private Object objectA;
    private Object objectB;

    ThreadA(Object objectA, Object objectB) {
        this.objectA = objectA;
        this.objectB = objectB;
    }

    @Override
    public void run() {
        synchronized (objectA) {
            System.out.println(Thread.currentThread().getName() + " acquired objectA lock");
            synchronized (objectB) {
                System.out.println(Thread.currentThread().getName() + " acquired objectB lock");
            }
        }
    }
}

class ThreadB implements Runnable {
    private Object objectA;
    private Object objectB;

    ThreadB(Object objectA, Object objectB) {
        this.objectA = objectA;
        this.objectB = objectB;
    }

    @Override
    public void run() {
        synchronized (objectB) {
            System.out.println(Thread.currentThread().getName() + " acquired objectB lock");
            synchronized (objectA) {
                System.out.println(Thread.currentThread().getName() + " acquired objectA lock");
            }
        }
    }
}
