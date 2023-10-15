package Collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Deque_Interface {

    public static void main(String[] args) {
        Deque<String> stringDeque = new ArrayDeque<>();
        Deque<Integer> integerDeque = new LinkedList<>();
        integerDeque.add(1);
        integerDeque.addLast(5);
         System.out.println(integerDeque);
        integerDeque.offer(2);
        integerDeque.offerLast(3);
        System.out.println(integerDeque);
        integerDeque.addFirst(0);
        integerDeque.offerFirst(-1);
        System.out.println(integerDeque);
        System.out.println(integerDeque.remove());
        System.out.println(integerDeque.removeFirst());
        System.out.println(integerDeque.removeLast());
        System.out.println(integerDeque);
        System.out.println(integerDeque.element());
        System.out.println(integerDeque.getFirst());
        System.out.println(integerDeque.peek());
        System.out.println(integerDeque.peekFirst());
        System.out.println(integerDeque.getLast());
        System.out.println(integerDeque.peekLast());
        integerDeque.clear();
        System.out.println(integerDeque.peekLast());
        System.out.println(integerDeque.getLast());
    }
}
