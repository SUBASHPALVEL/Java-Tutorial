package GenericClass;

class Data {
    private Object element;

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }
}

public class nonGenericClass {

    public static void main(String[] args) {
        Data dataA = new Data();
        Integer myInt = 100;
        dataA.setElement(myInt);

        Data dataB = new Data();
        String myString = "John";
        dataB.setElement(myString);

        Integer returnValue = (Integer) dataB.getElement();
    }
}
