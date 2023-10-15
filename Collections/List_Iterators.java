package Collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class List_Iterators {

    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<>();
        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        ListIterator<Integer> numbersIterator = numbers.listIterator();

        System.out.println("Next Index: " + numbersIterator.nextIndex());
        System.out.println("Previous Index: " + numbersIterator.previousIndex());
        System.out.println("Next Element: " + numbers.get(numbersIterator.nextIndex()));
        System.out.println(numbers);

        while (numbersIterator.hasNext()) {
            System.out.println("Next Index: " + numbersIterator.nextIndex());
            System.out.println("Previous Index: " + numbersIterator.previousIndex());
            System.out.println("Element: " + numbersIterator.next());
            System.out.println("-----------------------------------");
        }

        System.out.println("Next Index: " + numbersIterator.nextIndex());
        System.out.println("Previous Index: " + numbersIterator.previousIndex());

        while (numbersIterator.hasPrevious()) {
            System.out.println("Next Index: " + numbersIterator.nextIndex());
            System.out.println("Previous Index: " + numbersIterator.previousIndex());
            System.out.println("Element: " + numbersIterator.previous());
            System.out.println("-----------------------------------");
        }

        while (numbersIterator.hasNext()) {
            Integer number = numbersIterator.next();
            numbersIterator.set(number * number);
        }

        System.out.println(numbers);

        while (numbersIterator.hasPrevious()) {
            Integer number = numbersIterator.previous();
            if (number == 9)
                numbersIterator.add(5);
        }

        System.out.println(numbers);

        while (numbersIterator.hasNext()) {
            Integer number = numbersIterator.next();
            if (number == 5)
                numbersIterator.remove();
        }

        System.out.println(numbers);
    }
}
