package GenericClass;

//  unbounded type parameter
class Data<T> {

    private T value;

    // add a constructor
    public Data(T value) {
        this.value = value;
    }

    // add a getter and a setter
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

// generic Data class by restricting to Integer type
class MyData extends Data<Integer> {

    public MyData(Integer value) {
        super(value);
    }

    // override the parameter type becomes Integer
    @Override
    public void setValue(Integer value) {
        super.setValue(value);
    }
    
}

// The Data.setValue(T) method becomes Data.setValue(Object) .
// As a consequence, the method MyData.setValue(Integer) does not override the
// method Data.setValue(Object).

// The Java compiler generates a bridge method to ensure that subtyping works
// as intended and that the polymorphism of generic types is preserved after
// type erasure.

// The compiler generates the synthetic bridge setValue method for the MyData
// class
public class TypeErasureAndSyntheticBridgeMethod {

    public static void main(String[] args) {
        
    }
}
