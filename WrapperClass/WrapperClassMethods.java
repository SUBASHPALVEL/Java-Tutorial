package WrapperClass;

public class WrapperClassMethods {

    public static void main(String[] args) {
        Integer myInteger = 10;
        float myFloat = myInteger.floatValue();
        System.out.println(myFloat);

        Character myChar = 'A';
        Character yourChar = 'B';
        System.out.println(myChar.compareTo(yourChar));

        System.out.println(myChar.equals(yourChar));

        Boolean myBoolean = true;
        Boolean yourBoolean = false;
        System.out.println(myBoolean.equals(yourBoolean));

        Integer number = Integer.decode("0x0F");
        System.out.println(number);

        int decimalNumber = Integer.parseInt("010101", 2);
        System.out.println(decimalNumber);

        Integer decimalObject = Integer.valueOf("11", 8);
        System.out.println(decimalObject);
    }
}
