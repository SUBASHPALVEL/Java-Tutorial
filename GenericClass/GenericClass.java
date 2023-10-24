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

public class GenericClass {

    public static void main(String[] args) {
        Data<Integer> dataA = new Data<>();
        // dataA.setElement("dashkjh"); // This would not compile due to type safety

        dataA.setElement(100);
        Integer myInt = dataA.getElement();
        System.out.println(myInt);
    }
}
