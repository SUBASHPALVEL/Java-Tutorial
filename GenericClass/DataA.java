package GenericClass;

public class DataA<T> {
    private T key;
    private T value;

    public DataA(T key, T value) {
        this.key = key;
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

}
