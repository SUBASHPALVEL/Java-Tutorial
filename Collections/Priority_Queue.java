package Collections;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Priority_Queue {

    public static void main(String[] args) {
        Queue<Integer> integerQueue = new PriorityQueue<>();
        integerQueue.add(3);
        integerQueue.offer(1);
        integerQueue.offer(2);
        integerQueue.offer(5);
        integerQueue.offer(4);
        System.out.println(integerQueue);
        System.out.println(integerQueue.remove());
        System.out.println(integerQueue.poll());
        System.out.println(integerQueue);
        System.out.println(integerQueue.element());
        System.out.println(integerQueue.peek());
        System.out.println(integerQueue);
        integerQueue.clear();
        System.out.println(integerQueue.poll());

        Queue<Integer> reverseQueue = new PriorityQueue<>(Comparator.reverseOrder());
        reverseQueue.add(1);
        reverseQueue.add(5);
        reverseQueue.add(2);
        System.out.println(reverseQueue);
    }
}
