package WrapperClass;

public class Autoboxing_Unboxing {
    public static void printValue(Integer myInteger) {
        System.out.println(myInteger.intValue());
    }

    public static void printAbsoluteValue(double myDouble) {
        System.out.println(Math.abs(myDouble));
    }

    public static void main(String[] args) {
        int myInt = 100;
        printValue(myInt);
        Character myChar = 'A';
        Double myDouble = -100.0;
        printAbsoluteValue(myDouble);
        Character myCharObject = 'X';
        char myLetter = myCharObject;
        System.out.println(myLetter);
    }
}
