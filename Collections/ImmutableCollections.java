package Collections;

import java.util.*;

public class ImmutableCollections {

    public static void main(String[] args) {
        List<String> nameList = List.of("William", "Sophia", "Micheal");
        System.out.println("List of Names: " + nameList);

        Set<String> nameSet = Set.of("William", "Sophia", "Micheal");
        System.out.println("Set of Names: " + nameSet);

        Map<Integer, String> nameMap = Map.of(100, "William", 200, "Sophia", 300, "Micheal");
        System.out.println("Map of Names: " + nameMap);

        // nameSet.add("Robert"); produce error

        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(1);
        integerSet.add(2);
        integerSet.add(3);

        Set<Integer> unmodifiableSet = Collections.unmodifiableSet(integerSet);
        // unmodifiableSet.add(10); produce error
    }
}
