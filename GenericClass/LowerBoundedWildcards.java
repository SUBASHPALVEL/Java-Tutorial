package GenericClass;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundedWildcards {

    public static void fill(List<? super Integer> list, int numberOfElements) {
        for (int i = 0; i < numberOfElements; i++)
            list.add(i);
    }

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        fill(integerList, 5);
        for (Integer integer : integerList) {
            System.out.println(integer);
        }

        List<Number> numberList = new ArrayList<>();
        fill(numberList, 5);
        for (Number number : numberList) {
            System.out.println(number);
        }

        List<Object> objectList = new ArrayList<>();
        fill(objectList, 5);
        for (Object object : objectList) {
            System.out.println(object);
        }

        List<Double> doubleList = new ArrayList<>();
       // fill(doubleList, 5);
    }
}
