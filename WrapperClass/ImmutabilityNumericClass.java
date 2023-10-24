package WrapperClass;

public class ImmutabilityNumericClass {
    public static void increment(Integer number) {
        number++;
        System.out.println("inside the method body: " + number);
    }

    public static void main(String[] args) {
        Integer number = 10;
        System.out.println("before the method call: " + number);
        increment(number);
        System.out.println("after the method call: " + number);
    }
}
