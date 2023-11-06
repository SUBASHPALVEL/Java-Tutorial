package Concurrency;

public class ThreadStarvation {
    public static void main(String[] args) {
        Worker worker = new Worker();
        Thread threadA = new Thread(new ThreadA(worker), "threadA");
        Thread threadB = new Thread(new ThreadB(worker), "threadB");
        threadA.setPriority(Thread.MAX_PRIORITY);
        threadB.setPriority(Thread.MIN_PRIORITY);
        threadA.start();
        threadB.start();
    }
}

class Worker {
    public synchronized void work() {
        try {
            System.out.println(Thread.currentThread().getName() + " is working intensively");
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ThreadA implements Runnable {
    Worker worker;

    ThreadA(Worker worker) {
        this.worker = worker;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++)
            worker.work();
    }
}

class ThreadB implements Runnable {
    Worker worker;

    ThreadB(Worker worker) {
        this.worker = worker;
    }

    @Override
    public void run() {
        worker.work();
    }
}


