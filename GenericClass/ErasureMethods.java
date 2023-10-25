package GenericClass;


public class ErasureMethods {

    // unbounded type parameter
    public static <T> void printA(T[] array) {
        for (T t : array) {
            System.out.println(t);
        }
    }
    // all the occurrences of type T is Replaced with the Object

    // a bounded type parameter
    public static <T extends Number> void printB(T[] array) {
        for (T t : array) {
            System.out.println(t);
        }
    }

    // all the occurrences of type T is Replaced with the Number
    public static void main(String[] args) {
   
    }
}
