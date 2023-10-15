package Collections;

import java.util.LinkedHashSet;

public class LinkedHashsetClass {

    public static void main(String[] args) {

    
        LinkedHashSet<String> nameSetA = new LinkedHashSet<>();

        nameSetA.add("Micheal");
        nameSetA.add("William");
        nameSetA.add("Isabella");

        System.out.println(nameSetA);

        System.out.println(nameSetA.add("Isabella"));

        System.out.println(nameSetA.remove("Isabella"));

        System.out.println(nameSetA.contains("Isabella"));

        LinkedHashSet<String> nameSetB = new LinkedHashSet<>(32, 0.50f);

        nameSetB.add("William");
        nameSetB.add("Sophia");

        System.out.println("nameSetA: " + nameSetA);
        System.out.println("nameSetB: " + nameSetB);

        LinkedHashSet<String> intersection = new LinkedHashSet<>();
   
        intersection.addAll(nameSetA);
    
        intersection.retainAll(nameSetB);
        System.out.println("Intersection: " + intersection);
    
        LinkedHashSet<String> union = new LinkedHashSet<>();
       
        union.addAll(nameSetA);
        union.addAll(nameSetB);
     
        System.out.println("Union: " + union);

        LinkedHashSet<String> aDiffB = new LinkedHashSet<>();

        aDiffB.addAll(nameSetA);
        aDiffB.removeAll(nameSetB);
        System.out.println("A Difference B: " + aDiffB);
    }
}
