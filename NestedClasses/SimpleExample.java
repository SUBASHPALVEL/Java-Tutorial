package NestedClasses;

public class SimpleExample {
    public static void main(String[] args) {
       OuterClass outer = new OuterClass();
        
       OuterClass.InnerClass inner = outer.new InnerClass();

        inner.displayOuterValue();
}
}

class OuterClass {
    private int outerValue = 10;

    // Inner class
    public class InnerClass {
        public void displayOuterValue() {
            System.out.println("The outer value is: " + outerValue);
        }
    }

    }
