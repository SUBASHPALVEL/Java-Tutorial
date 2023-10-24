package GenericClass;

import java.util.List;

public class UNboundedWildcard {

    public static void printA(List<Object> list) {
        for (Object element : list)
            System.out.println(element);
    }

    public static void printB(List<?> list) {
        for (Object element : list)
            System.out.println(element);
    }

    public static void main(String[] args) {
        List<Object> objectList = List.of(10, 20, 30);
        printA(objectList);
        printB(objectList);
    }
}
