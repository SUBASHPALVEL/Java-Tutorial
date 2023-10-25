package TasksList;

import java.lang.reflect.Field;

public class SimpleObjectFieldComparator {
    public static <T> T combineObjects(T obj1, T obj2) throws IllegalAccessException {
        Class<?> objClass = obj1.getClass();
        Field[] fields = objClass.getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);
            Object value1 = field.get(obj1);
            Object value2 = field.get(obj2);

            if (value1 == null && value2 != null) {
                field.set(obj1, value2);
            }
        }

        return obj1;
    }

    public static void main(String[] args) throws IllegalAccessException {
        ExampleObject obj1 = new ExampleObject();
        obj1.name = "John";
        obj1.age = 30;

        ExampleObject obj2 = new ExampleObject();
        obj2.name = "Jane";
        obj2.city = "New York";

        ExampleObject combinedObj = combineObjects(obj1, obj2);

        System.out.println("Name: " + combinedObj.name);
        System.out.println("Age: " + combinedObj.age);
        System.out.println("City: " + combinedObj.city);
    }
}

class ExampleObject {
    String name;
    int age;
    String city;
}
