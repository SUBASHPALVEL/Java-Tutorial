package Collections;

import java.util.TreeSet;

public class TreesetClass {

    public static void main(String[] args) {
        TreeSet<Integer> integers = new TreeSet<>();
        integers.add(30);
        integers.add(10);
        integers.add(40);
        integers.add(50);
        integers.add(20);
        integers.add(60);
        System.out.println(integers);
        System.out.println(integers.add(60));
        System.out.println(integers.remove(60));
        System.out.println(integers.contains(60));
        System.out.println("first: " + integers.first());
        System.out.println("last: " + integers.last());
        System.out.println("celing(15) : " + integers.ceiling(15));
        System.out.println("floor(15) : " + integers.floor(15));
        System.out.println("headSet(30) : " + integers.headSet(30));
        System.out.println("tailSet(30) : " + integers.tailSet(30));
        System.out.println("pollLast() : " + integers.pollLast());
        System.out.println(integers);
    }
}
