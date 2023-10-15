package Collections;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class IterationOverMaps {

    public static void main(String[] args) {
        TreeMap<Integer, String> namesMap = new TreeMap<>();
        namesMap.put(10, "William");
        namesMap.put(5, "Sophia");
        namesMap.put(20, "Micheal");
        namesMap.put(8, "Robert");

        for (Map.Entry<Integer, String> entry : namesMap.entrySet()) {
            System.out.println("Key:" + entry.getKey() + " Value:" + entry.getValue());
        }

        Iterator<Map.Entry<Integer, String>> namesMapIterator =
                namesMap.entrySet().iterator();

        while (namesMapIterator.hasNext()) {
            Map.Entry<Integer, String> entry = namesMapIterator.next();
            System.out.println(entry);
            System.out.println("Key:" + entry.getKey() + " Value:" + entry.getValue());
            if (entry.getKey() == 5)
                namesMapIterator.remove();
            if (entry.getKey() == 8) {
                entry.setValue(entry.getValue().toUpperCase());
            }
        }

        System.out.println(namesMap);

        Iterator<Integer> keyIterator = namesMap.keySet().iterator();
        while (keyIterator.hasNext()) {
            System.out.println(keyIterator.next());
        }

        Iterator<String> valueIterator = namesMap.values().iterator();
        while (valueIterator.hasNext()) {
            System.out.println(valueIterator.next());
        }
    }
}
