package TasksList;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class ObjectFieldComparator {
    public static <T> T combineObjects(T obj1, T obj2) throws IllegalAccessException, InstantiationException {
        Class<?> objClass = obj1.getClass();
        Field[] fields = objClass.getDeclaredFields();
        
        Map<String, Object> fieldMap = new HashMap<>();
        
        for (Field field : fields) {
            field.setAccessible(true);
            Object value = field.get(obj1);
            fieldMap.put(field.getName(), value);
        }
        
       
        T combinedObj = (T) objClass.newInstance();
        for (Field field : fields) {
            field.setAccessible(true);
            Object value = field.get(obj2);
            if (value != null) {
                field.set(combinedObj, value);
            }
        }
        
        for (Field field : fields) {
            field.setAccessible(true);
            if (field.get(combinedObj) == null) {
                field.set(combinedObj, fieldMap.get(field.getName()));
            }
        }
        
        return combinedObj;
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
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
