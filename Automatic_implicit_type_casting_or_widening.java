public class Automatic_implicit_type_casting_or_widening{
    public static void main (String[] args){
        byte myByteVal=15;
        short myShortVal=myByteVal;
        System.out.println("myShortVal="+myShortVal);

        int myIntVal = myShortVal;
        System.out.println("myIntVal="+myIntVal);

        long myLongVal = myIntVal;
        System.out.println("myLongVal="+myLongVal);

        float myFloatVal = myIntVal;
        System.out.println("myFloatVal=" + myFloatVal);
        double myDoubleVal = myIntVal;
        System.out.println("myDoubleVal=" + myDoubleVal);

        // If we try to assign any char variable which is also numeric to any
        // short variables, Java never does automatic casting and causes to
        // compiler error.
        char myChar = 65;
        short myShortChar = myChar; // ! Compiler error
        int myIntChar = myChar; // OK.
    }
}