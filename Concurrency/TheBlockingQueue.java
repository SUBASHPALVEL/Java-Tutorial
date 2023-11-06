package Concurrency;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class MessageProducer implements Runnable {
    private BlockingQueue<String> blockingMessageQueue;

    public MessageProducer(BlockingQueue<String> queue) {
        this.blockingMessageQueue = queue;
    }

    @Override
    public void run() {
        String msg;
        for (int i = 1; i <= 10; i++) {
            if (i != 10) {
                msg = "Message " + i;
            } else {
                msg = "exit";
            }

            try {
                Thread.sleep(1000);
                blockingMessageQueue.put(msg);
                System.out.println("Produced " + msg);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}

class MessageConsumer implements Runnable{
    private BlockingQueue<String> blockingMessageQueue;

    public MessageConsumer(BlockingQueue<String> queue){
        this.blockingMessageQueue =queue;
    }

    @Override
    public void run() {
        try{
            String msg;
            while(!(msg = blockingMessageQueue.take()).equals("exit")){
                Thread.sleep(1000);
                System.out.println("Consumed "+msg);
            }
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class TheBlockingQueue {

    public static void main(String[] args) {
        BlockingQueue<String> blockingMessageQueue = new ArrayBlockingQueue<>(5);

        MessageProducer messageProducer = new MessageProducer(blockingMessageQueue);
        MessageConsumer messageConsumer = new MessageConsumer(blockingMessageQueue);
        new Thread(messageProducer).start();
        new Thread(messageConsumer).start();
        System.out.println("Message Producer and Message Consumer were started");
    }
}

