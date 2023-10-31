package FunctionalInterfaceDemo;

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        // Using a lambda expression to implement the Calculator functional interface
        Calculator addition = (a, b) -> a + b;
        Calculator subtraction = (a, b) -> a - b;

        int result1 = addition.calculate(5, 3);
        int result2 = subtraction.calculate(5, 3);

        System.out.println("Addition result: " + result1);
        System.out.println("Subtraction result: " + result2);
    }
}