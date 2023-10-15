package Collections;

import java.util.Stack;

public class StackClass {

    public static void main(String[] args) {

        Stack<Integer> integerStack = new Stack<>();
      
        integerStack.push(10);
        integerStack.push(20);
        integerStack.push(30);
        integerStack.push(40);
        
        System.out.println(integerStack);

        System.out.println(integerStack.pop());
       
        System.out.println(integerStack);

        System.out.println(integerStack.pop());

        System.out.println(integerStack);

        System.out.println(integerStack.peek());

        System.out.println(integerStack);

        System.out.println(integerStack.search(20));
        System.out.println(integerStack.search(10));
        System.out.println(integerStack.search(50));

    }
}
