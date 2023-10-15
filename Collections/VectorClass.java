package Collections;
import java.util.Vector;
public class VectorClass {
    public static void main(String[] args) {

        Vector<String> names = new Vector<>();
  
        names.add("John");
        names.add("Micheal");
        names.add("Adam");

        System.out.println(names);

        names.add(1, "Chris");

        System.out.println(names);

        System.out.println("element at index 2:" + names.get(2));

     
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

