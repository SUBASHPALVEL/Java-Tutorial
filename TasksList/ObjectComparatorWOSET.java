package TasksList;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ObjectComparatorWOSET{
    public static void main(String[] args) {
        Internclass intern = new Internclass(1, "Subash", 123);
        Employeeclass employee = new Employeeclass("27", "Subash", 80000, 124);

        copy(intern, employee);

        System.out.println("Updated Employee: " + employee.ID + ", " + employee.Name + ", " + employee.Salary + ", " + employee.PermanentID);
    }

    public static void copy(Object source, Object target) {
        Field[] sourceFields = source.getClass().getDeclaredFields();
        Field[] targetFields = target.getClass().getDeclaredFields();

        for (Field targetField : targetFields) {
            for (Field sourceField : sourceFields) {
                AlternativeName altNameAnnotation = targetField.getAnnotation(AlternativeName.class);
                String altFieldName = altNameAnnotation != null ? altNameAnnotation.alternative() : null;

                if (targetField.getName().equals(sourceField.getName()) || (altFieldName != null && altFieldName.equals(sourceField.getName()))) {
                    if (targetField.getType().equals(sourceField.getType())) {
                        try {
                            // Get the getter method for the source field
                            String sourceFieldName = sourceField.getName();
                            String sourceGetterName = "get" + sourceFieldName.substring(0, 1).toUpperCase() + sourceFieldName.substring(1);
                            Method sourceGetter = source.getClass().getMethod(sourceGetterName);

                            // Get the setter method for the target field
                            String targetFieldName = targetField.getName();
                            String targetSetterName = "set" + targetFieldName.substring(0, 1).toUpperCase() + targetFieldName.substring(1);
                            Method targetSetter = target.getClass().getMethod(targetSetterName, sourceField.getType());

                            // Get the value from the source object using the getter method
                            Object sourceValue = sourceGetter.invoke(source);

                            // Set the value in the target object using the setter method
                            targetSetter.invoke(target, sourceValue);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}

class Internclass {
    int EmpID;
    String Name;
    int PermanentID;

    public Internclass(int EmpID, String Name, int PermanentID) {
        this.EmpID = EmpID;
        this.Name = Name;
        this.PermanentID = PermanentID;
    }
}

class Employeeclass {
    @AlternativeName(name = "ID", alternative = "EmpID")
    String ID;
    String Name;
    int Salary;
    int PermanentID;

    public Employeeclass() {
        System.out.println("Default constructor");
    }

    public Employeeclass(String ID, String Name, int Salary, int PermanentID) {
        this.ID = ID;
        this.Name = Name;
        this.Salary = Salary;
        this.PermanentID = PermanentID;
    }
}

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface AlternativeName {
    String name();

    String alternative();
}
