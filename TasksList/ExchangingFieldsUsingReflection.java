package TasksList;
import java.lang.reflect.Field;

public class ExchangingFieldsUsingReflection {
    public static void exchangeFields(Object source, Object destination, String fieldName) throws NoSuchFieldException, IllegalAccessException {
        Field sourceField = source.getClass().getDeclaredField(fieldName);
        Field destinationField = destination.getClass().getDeclaredField(fieldName);

        sourceField.setAccessible(true);
        destinationField.setAccessible(true);

        Object sourceValue = sourceField.get(source);
        Object destinationValue = destinationField.get(destination);

        sourceField.set(source, destinationValue);
        destinationField.set(destination, sourceValue);
    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        // Create two objects
        MyClass sourceObject = new MyClass(10);
        MyClass destinationObject = new MyClass(20);

        // Display the initial values
        System.out.println("Source Object: " + sourceObject.getValue());
        System.out.println("Destination Object: " + destinationObject.getValue());

        // Exchange the "value" field between the objects
        exchangeFields(sourceObject, destinationObject, "value");

        // Display the exchanged values
        System.out.println("After Exchange - Source Object: " + sourceObject.getValue());
        System.out.println("After Exchange - Destination Object: " + destinationObject.getValue());
    }
}

class MyClass {
    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
