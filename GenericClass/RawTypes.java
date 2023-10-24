package GenericClass;

class Data<T> {
    private T element;

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }
}

public class RawTypes {

    public static void main(String[] args) {
        Data<Double> parameterized = new Data<>();
        parameterized.setElement(100.0);

        Data raw = new Data(); // This results in "unchecked call" warning
        raw.setElement("100");

        raw = parameterized; // No compiler issue
        parameterized = raw; // This results in "unchecked conversion" warning
        System.out.println(parameterized.getElement());
    }
}
