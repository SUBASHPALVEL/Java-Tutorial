package Collections;

import java.util.HashSet;

public class HashsetClass {

    public static void main(String[] args) {

        HashSet<String> nameSetA = new HashSet<>();
       
        nameSetA.add("Micheal");
        nameSetA.add("William");
        nameSetA.add("Isabella");

        System.out.println(nameSetA);
 
        System.out.println(nameSetA.add("Isabella"));

        System.out.println(nameSetA.remove("Isabella"));

        System.out.println(nameSetA.contains("Isabella"));

        HashSet<String> nameSetB = new HashSet<>(32, 0.50f);

        nameSetB.add("William");
        nameSetB.add("Sophia");

        System.out.println("nameSetA: " + nameSetA);
        System.out.println("nameSetB: " + nameSetB);

        HashSet<String> intersection = new HashSet<>();

        intersection.addAll(nameSetA);

        intersection.retainAll(nameSetB);

        System.out.println("Intersection: " + intersection);

        HashSet<String> union = new HashSet<>();

        union.addAll(nameSetA);
        
        union.addAll(nameSetB);
        
        System.out.println("Union: " + union);

        HashSet<String> aDiffB = new HashSet<>();
  
        aDiffB.addAll(nameSetA);

        aDiffB.removeAll(nameSetB);

        System.out.println("A Difference B: " + aDiffB);
       
    }
}
