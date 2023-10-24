package WrapperClass;

public class Unboxing {

    /*Unboxing: 
    Unboxing is the automatic conversion of a wrapper class object to its corresponding primitive data type. 
    This happens when you extract the value from the wrapper object using methods like intValue(), doubleValue(), or 
    when you use the wrapper object in a context where a primitive type is expected.
 */
    public static void main(String[] args) {
        Integer integerObj = 42;
        int intValue = integerObj; // Unboxing, Integer to int
        Double doubleObj = 3.14;
        double doubleValue = doubleObj; // Unboxing, Double to double

    }
}
