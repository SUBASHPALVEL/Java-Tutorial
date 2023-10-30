package Abstraction;

interface Greeting {
    void greet();

    default void defaultGreet() {
        System.out.println("Hello, from the defaultGreet method!");
    }
}


