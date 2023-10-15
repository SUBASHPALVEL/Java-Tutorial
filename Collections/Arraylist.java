package Collections;


import java.util.ArrayList;
import java.util.List;

public class Arraylist {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Micheal");
        names.add("Adam");
      
        System.out.println(names);

        names.add(1, "Chris");
      
        System.out.println(names);

        System.out.println("element at index 3:" + names.get(3));


        names.remove("Chris");

        System.out.println(names);

        names.remove(0);
        System.out.println(names);

        System.out.println("Index of Adam: " + names.indexOf("Adam"));

        System.out.println(names.contains("Adam"));
        System.out.println(names.contains("Mary"));

        for (String name : names) {
            System.out.println(name);
        }


    }
}
