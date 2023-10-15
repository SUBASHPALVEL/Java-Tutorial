package Array;

import java.util.Arrays;

public class FillingArray {

    public static void main(String[] args) {

        char[] chars=new char[10];
        Arrays.fill(chars,'A');
        System.out.println(Arrays.toString(chars));
        
        Arrays.fill(chars,5,10,'B');
        System.out.println(Arrays.toString(chars));
    }
}
