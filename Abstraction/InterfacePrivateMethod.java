package Abstraction;

class BasicCalculator implements Calculator {}

public class InterfacePrivateMethod {
    public static void main(String[] args) {
        Calculator calculator = new BasicCalculator();

        int sum = calculator.add(10, 5);
        int difference = calculator.subtract(10, 5);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
    }
}