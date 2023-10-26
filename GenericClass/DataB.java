package GenericClass;

//Example for erasure types

class DataB<T extends Number> {
    private T key;
    private T value;

    public DataB(T key, T value) {
        this.key = key;
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
public static void main(String[] args) {
    DataB<Double> mydata= new DataB<Double>(23d, 24d);
    
    System.out.println(mydata.getValue());
}
}