package GenericClass;

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

}