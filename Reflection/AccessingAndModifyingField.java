package Reflection;

import java.lang.reflect.Field;

public class AccessingAndModifyingField {

    public static void main(String[] args) throws NoSuchFieldException,
            IllegalAccessException {
        Employee employee = new Employee(1, "James Smith", "R&D");
        Class employeeClass = employee.getClass();
        Field field = employeeClass.getDeclaredField("name");
        field.setAccessible(true);
        field.set(employee, "Michael Rock");
        System.out.println(employee);
    }
}
