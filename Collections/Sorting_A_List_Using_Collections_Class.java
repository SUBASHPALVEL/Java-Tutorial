package Collections;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Sorting_A_List_Using_Collections_Class {
    public static void main(String[] args) {

        List<String> names = new LinkedList<>();
        names.add("Charles");
        names.add("Anthony");
        names.add("Steven");
        names.add("George");
        System.out.println(names);
        Collections.sort(names);
        System.out.println(names);

        Collections.sort(names, Collections.reverseOrder());
        System.out.println(names);

        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Character.compare(o1.charAt(o1.length() - 1),
                        o2.charAt(o2.length() - 1));
            }
        });

        System.out.println(names);

    }
}

