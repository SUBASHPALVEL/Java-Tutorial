package NestedClasses;

public class ShadowingExample {
    private int value = 10; // outer variable

    class OuterClass {
        private int value = 20; // the inner variable,

        class InnerClass {
            private int value = 30; //inner variable in the inner class

            public void printValues() {
                System.out.println("Inner variable (InnerClass): " + value); // 30
                System.out.println("Inner variable (OuterClass): " + OuterClass.this.value); // 20
                System.out.println("Outer variable (ShadowingExample): " + ShadowingExample.this.value); // 10
            }
        }
    }

    public static void main(String[] args) {
        ShadowingExample outer = new ShadowingExample();
        ShadowingExample.OuterClass inner = outer.new OuterClass();
        ShadowingExample.OuterClass.InnerClass innerInner = inner.new InnerClass();

        innerInner.printValues();
    }
}

