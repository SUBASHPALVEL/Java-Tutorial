import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Tree_task {
    public static boolean isBinaryTree(String[] input) {
        Map<Integer, Integer> childToParent = new HashMap<>();
        Set<Integer> rootNodes = new HashSet<>();
        
        for (String pair : input) {
            String[] parts = pair.split(",");
            if (parts.length != 2) {
                return false; // Invalid input format
            }
            
            int child = Integer.parseInt(parts[0].substring(1));
            int parent = Integer.parseInt(parts[1].substring(0, parts[1].length() - 1));
            
            if (childToParent.containsKey(child) || rootNodes.contains(child)) {
                return false; // Child node already has a parent or is a root node
            }
            
            childToParent.put(child, parent);
            rootNodes.add(parent);
        }
        
        int rootCount = 0;
        for (int node : childToParent.keySet()) {
            if (!rootNodes.contains(node)) {
                rootCount++;
                if (rootCount > 1) {
                    return false; // More than one root node found
                }
            }
        }
        
        return rootCount == 1;
    }

    public static void main(String[] args) {
        String[] input1 = {"(2,4)", "(3,4)", "(5,2)", "(6,3)", "(8,4)"};
        String[] input2 = {"(2,4)", "(3,4)", "(5,2)", "(6,3)"};
        
        boolean result1 = isBinaryTree(input1);
        boolean result2 = isBinaryTree(input2);
        
        System.out.println("Input 1 is a binary tree: " + result1);
        System.out.println("Input 2 is a binary tree: " + result2);
    }
}
