package Collections;

import java.util.*;

public class Iterators {

    public static void main(String[] args) {
        List<String> nameList = new LinkedList<>();
        nameList.add("William");
        nameList.add("Sophia");
        nameList.add("Micheal");

        for (String name : nameList) {
            System.out.println(name);
        }

        Iterator<String> nameListIterator = nameList.iterator();

        while (nameListIterator.hasNext()) {
            String name = nameListIterator.next();
            System.out.println(name);
            if (name.equals("Sophia"))
                nameListIterator.remove();
        }

        System.out.println(nameList);

        Set<Integer> integerSet = new TreeSet<>();
        integerSet.add(5);
        integerSet.add(20);
        integerSet.add(15);

        Iterator<Integer> integerSetIterator = integerSet.iterator();

        while (integerSetIterator.hasNext()) {
            Integer number = integerSetIterator.next();
            System.out.println(number);
            if (number == 15)
                integerSetIterator.remove();
        }

        System.out.println(integerSet);

        Queue<Integer> integerQueue = new PriorityQueue<>();
        integerQueue.offer(1);
        integerQueue.offer(5);
        integerQueue.offer(3);

        Iterator<Integer> integerQueueIterator = integerQueue.iterator();

        while (integerQueueIterator.hasNext()) {
            Integer number = integerQueueIterator.next();
            System.out.println(number);
            if (number == 1)
                integerQueueIterator.remove();
        }

        System.out.println(integerQueue);
    }
}
