package Abstraction;

class EnglishGreeting implements Greeting {
    @Override
    public void greet() {
        System.out.println("Hello, from the greet method!");
    }
}

public class InterfaceDefaultMethods {
    public static void main(String[] args) {
        EnglishGreeting englishGreeting = new EnglishGreeting();

        englishGreeting.greet();         
        englishGreeting.defaultGreet();  
    }
}