package GenericClass;

import java.util.List;

public class CaptureHelper {

    public static void main(String[] args) {
        
    }

    // Private helper method to capture the wildcard and insert elements into the list.
    private <T> void insertHelper(List<T> list) {
        list.set(0, list.get(0));
    }

    // Public method to insert elements into a list using an unbounded wildcard.
    void insert(List<?> list) {
        insertHelper(list);
    }
}
