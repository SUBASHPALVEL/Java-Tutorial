package WrapperClass;

public class Intro {

    public static void main(String[] args) {
        Integer myIntA = new Integer(100);
        Integer myIntB = 100;

        Double myDoubleA = new Double(12.5);
        Double myDoubleB = 12.5;

        Character myCharA = new Character('A');
        Character myCharB = 'B';

        System.out.println("Integer.MAX_VALUE: " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE: " + Integer.MIN_VALUE);

        System.out.println("Byte.MAX_VALUE: " + Byte.MAX_VALUE);
        System.out.println("Byte.MIN_VALUE: " + Byte.MIN_VALUE);

        Number myNumber = 123;
        System.out.println(((Integer)myNumber).compareTo(123));
    }
}
