package Collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterface {

    public static void main(String[] args) {
        Queue<String> stringQueue = new PriorityQueue<>();
        Queue<Integer> integerQueue = new LinkedList<>();
        integerQueue.add(1);
        integerQueue.offer(2);
        integerQueue.offer(3);
        integerQueue.offer(4);
        integerQueue.offer(5);
        System.out.println(integerQueue);
        System.out.println(integerQueue.remove());
        System.out.println(integerQueue.poll());
        System.out.println(integerQueue);
        System.out.println(integerQueue.element());
        System.out.println(integerQueue.peek());
        System.out.println(integerQueue);
        integerQueue.clear();
        System.out.println(integerQueue);
        System.out.println(integerQueue.poll());
        System.out.println(integerQueue.remove());
    }
}
