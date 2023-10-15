package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeClass {

    public static void main(String[] args) {
        Deque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(1);
        arrayDeque.addLast(5);
        arrayDeque.offer(2);
        arrayDeque.offerLast(3);
        System.out.println(arrayDeque);
        arrayDeque.addFirst(0);
        arrayDeque.offerFirst(-1);
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.remove());
        System.out.println(arrayDeque.removeFirst());
        System.out.println(arrayDeque.removeLast());
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.element());
        System.out.println(arrayDeque.getFirst());
        System.out.println(arrayDeque.peek());
        System.out.println(arrayDeque.peekFirst());
        System.out.println(arrayDeque.getLast());
        System.out.println(arrayDeque.peekLast());
        arrayDeque.clear();
        System.out.println(arrayDeque.peekLast());
        System.out.println(arrayDeque.getLast());
    }
}
