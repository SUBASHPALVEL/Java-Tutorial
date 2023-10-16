package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Reflection {

    public static void main(String[] args) throws ClassNotFoundException {
        Class classEmployee = Employee.class;

        classEmployee = Class.forName("Reflection.Employee");

        Employee employee = new Employee(1, "James Smith", "R&D");
        classEmployee = employee.getClass();

        System.out.println("Class Name: " + classEmployee.getName());

        Field[] declaredFields = classEmployee.getDeclaredFields();
        System.out.println(Arrays.toString(declaredFields));

        Constructor[] constructors = classEmployee.getConstructors();
        System.out.println(Arrays.toString(constructors));

        Method[] declaredMethods = classEmployee.getDeclaredMethods();
        System.out.println(Arrays.toString(declaredMethods));
    }
}
