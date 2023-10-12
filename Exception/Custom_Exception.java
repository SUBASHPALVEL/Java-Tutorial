public class Custom_Exception {
    public static void printAge(int age) {
        if (age < 0 || age >= 100)
            throw new IllegalAgeEntryException("You entried wrong age:" + age);
        System.out.println("Age is " + age);
    }

    public static void main(String[] args) {
        printAge(-100);

    }
}

class IllegalAgeEntryException extends RuntimeException {

    private final static String mainMessage = "Illegal Age Entry: ";

    public IllegalAgeEntryException(String message) {
        super(mainMessage + message);
    }
}

