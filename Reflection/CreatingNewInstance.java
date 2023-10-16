package Reflection;

import java.lang.reflect.Constructor;

public class CreatingNewInstance {

    public static void main(String[] args) throws NoSuchMethodException {

        Class employeeClass = Employee.class;

        Constructor constructor = employeeClass.getConstructor(Integer.TYPE, String.class, String.class);

        try {
            Employee employee = (Employee) constructor.newInstance(1, "John Doe", "Engineering");
            System.out.println(employee);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
