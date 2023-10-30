package Abstraction;

interface Calculator {
    default int add(int a, int b) {
        return addNumbers(a, b);
    }

    default int subtract(int a, int b) {
        return subtractNumbers(a, b);
    }

    private int addNumbers(int a, int b) {
        return a + b;
    }

    private int subtractNumbers(int a, int b) {
        return a - b;
    }
}
