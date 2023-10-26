package NestedClasses;


/*  Local inner class will always be inside the method of the
    outer class and a new instance for the local inner class
    should be created inside the method of the outer class.

    Local inner class can access only final variable and effective final variable

*/



// Here LocalInnerClass is the Outer class
public class LocalInnerClass {
    private int outerValue = 10;

    public void doSomething() {
        int localVar = 5;

        class LocalInner {
            void printValues() {
                System.out.println("Outer Value: " + outerValue);
                System.out.println("Local Variable: " + localVar);
            }
        }

        LocalInner localInner = new LocalInner();

        localInner.printValues();
    }

    public static void main(String[] args) {
        LocalInnerClass outer = new LocalInnerClass();
        outer.doSomething();
    }
}

