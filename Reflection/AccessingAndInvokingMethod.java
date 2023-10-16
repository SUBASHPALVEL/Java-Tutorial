package Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AccessingAndInvokingMethod {

    public static void main(String[] args) throws NoSuchMethodException,
            InvocationTargetException, IllegalAccessException {
        Employee employee = new Employee(1, "James Smith", "R&D");
        Class employeeClass = employee.getClass();
        Method method = employeeClass.getDeclaredMethod("companyName");
        method.setAccessible(true);
        String returnValue = (String) method.invoke(employee);
        System.out.println(returnValue);
    }
}
