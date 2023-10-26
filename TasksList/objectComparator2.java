package TasksList;

import java.lang.reflect.Field;

public class objectComparator2 {
    public static void main(String[] args) {

        Intern intern = new Intern(1,"Subash",123);
        Employee employee = new Employee(24,"Subash",80000,2911);


        Field[] internFields = intern.getClass().getDeclaredFields();
        Field[] employeeFields = employee.getClass().getDeclaredFields();

       
        for (Field employeeField : employeeFields) {
            for (Field internField : internFields) {
                if (employeeField.getName().equals(internField.getName())) {
                    try {
                        employeeField.setAccessible(true);
                        internField.setAccessible(true);
                        employeeField.set(employee, internField.get(intern));
                    } catch (IllegalAccessException | IllegalArgumentException e) {
                        e.printStackTrace();
                    }
                    
                }
            }
        }

        System.out.println("Updated Employee: " + employee.ID + ", " + employee.Name + ", " + employee.Salary + ", " + employee.PermanentID);
    }
}






