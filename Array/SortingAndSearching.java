package Array;

import java.util.Arrays;

public class SortingAndSearching {

    public static void main(String[] args) {
 
        int[] numbers = {80, 50, 10, 90, 20, 70, 60, 40, 30};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

 
        int index=Arrays.binarySearch(numbers,90);
        System.out.println(index);

    }
}
