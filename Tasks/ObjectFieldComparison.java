import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ObjectFieldComparison {
    public static void addMissingFields(Object firstObject, Object secondObject) {
        Class<?> firstClass = firstObject.getClass();
        Class<?> secondClass = secondObject.getClass();

        Field[] secondFields = secondClass.getDeclaredFields();

        for (Field secondField : secondFields) {
            secondField.setAccessible(true);

            try {
                Field firstField = firstClass.getDeclaredField(secondField.getName());
                firstField.setAccessible(true);

                if (!Modifier.isFinal(firstField.getModifiers()) && !Modifier.isStatic(firstField.getModifiers())) {
   
                    if (firstField.get(firstObject) == null) {
                        firstField.set(firstObject, secondField.get(secondObject));
                    }
                }
            } catch (NoSuchFieldException e) {
                
                try {
                    Field newField = new Field(secondField.getName(), secondField.getType());
                    newField.setAccessible(true);
                    newField.set(firstObject, secondField.get(secondObject));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MyClass object1 = new MyClass(10);
        MyClass object2 = new MyClass(20);
        object2.setName("John");

        addMissingFields(object1, object2);

        System.out.println("Object 1: " + object1.getValue() + ", " + object1.getName());
    }
}

class MyClass {
    private int value;
    private String name;

    public MyClass(int value) {
        this.value = value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
