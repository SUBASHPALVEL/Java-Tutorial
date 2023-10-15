package Collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//
public class Sorting_A_List_Using_Comparotor_Interface {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();

        integerList.add(10);
        integerList.add(5);
        integerList.add(30);
        System.out.println(integerList);

        Comparator<Integer> integerComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
  
        integerList.sort(integerComparator);
        System.out.println(integerList);

        integerList.sort(integerComparator.reversed());

        System.out.println(integerList);
  
        integerList.sort(Comparator.naturalOrder());

        System.out.println(integerList);
  
        integerList.sort(Comparator.reverseOrder());

        System.out.println(integerList);
    }
}