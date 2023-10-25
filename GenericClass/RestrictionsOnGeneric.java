package GenericClass;

class Data<T> {
    private T value;

    public Data(T value) {
        this.value = value;
    }

    
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    // we can not declare static fields of type parameters
    private static T myT; // this causes compile-time error
    
    // What is the actual type of myT since the static field myT is shared
    // by all instances of Data. It can not be Integer, Student, String, Car
    // at the same time, so that we are not be able to declare static type
    // parameter fields.
}

public class RestrictionsOnGeneric {

    public static void main(String[] args) {

        // we can not instantiate a generic type with primitive types
        Data<double> data = new Data<double>();
        // as wee see it causes compile time error
    }

    // A class can not have overload methods whose signature become same
    // after type erasure
    public void foo(Data<Double> data) { }
    public void foo(Data<Integer> data) { }

    // we can not create an instance of a type parameter
    // imagine that we have generic method that takes parameterized type
    public static <T> void test(Data<T> data) {
        // we can not create an instance of T
        T t = new T();  // This causes compile-time error
       

        // we can not use instanceof with parameterized types
        System.out.println(data instanceof Data<String>);  // This causes compile-time error
       
        // since the Java compiler erases all type parameters in generic
        // code, we can not examine the actual type at run time

        // but however we can use instanceof operator with unbounded or raw
        // types. so that we can examine at most whether data is instanceof
        // Data
        System.out.println(data instanceof Data);
        System.out.println(data instanceof Data<?>);

        // also we are not able to cast to parametrized type if it is bounded
       Data<Integer> integerData = new Data<>(5);
       Data<Number>  numberData= (Data<Number>)integerData;
       // we got compiler error

       // however if the compiler is sure that a type parameter is always
        // valid it permits the casting
        Data<Double> doubleDataA = new Data<>(5.0);
        Data<Double>  numberDataB= (Data<Double>)doubleDataA;

        //we can not create arrays of parametrized types
        Data<String>[] dataArray= new Data<String>[2];
        Object[] objectArray = new Data<String>[2];
        // as wee see we got compiler error

    }

    // a method can not catch an instance of type parameter
    public static <T extends Exception > void work(){
        try{
        }catch(T exception){
        }
    }
}
// it is allowed to use type parameter in throws clause
class MyData<T extends Exception> {
    public void test() throws T {

}

// It is not allowed  a generic class  to extend Throwable class
class DataException<T> extends Exception{}
// this causes a compiler error


