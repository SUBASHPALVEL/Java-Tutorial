package WrapperClass;

public class InternalCaching {

    public static void main(String[] args) {
        Integer intA = 127;
        Integer intB = 127;
        System.out.println(intA == intB);

        Integer intC = 128;
        Integer intD = 128;
        System.out.println(intC == intD);

        Character charA = 127;
        Character charB = 127;
        System.out.println(charA == charB);

        Character charC = 128;
        Character charD = 128;
        System.out.println(charC == charD);

        Boolean boolA=true;
        Boolean boolB=true;
        System.out.println(boolA==boolB);

        Integer x=1000;
        Integer y= 1000;
        System.out.println(x==y);

        System.out.println();
    }
}
