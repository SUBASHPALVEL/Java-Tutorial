package TasksList;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Trying3 {
    public static void main(String[] args) {
        Internclass source = new Internclass(1, "Subash", 123);
        Employeeclass target = new Employeeclass();
        
        Field[] sourceFields = source.getClass().getDeclaredFields();
        Field[] targetFields = target.getClass().getDeclaredFields();
        System.out.println(Arrays.toString(sourceFields));
        System.out.println(Arrays.toString(targetFields));
        
        for (Field targetField : targetFields) {
            for (Field sourceField : sourceFields) {
                AlternativeName altNameAnnotation = targetField.getAnnotation(AlternativeName.class);
                String altFieldName = altNameAnnotation != null ? altNameAnnotation.alternative() : null;

                if (targetField.getName().equals(sourceField.getName()) || (altFieldName != null && altFieldName.equals(sourceField.getName()))) {
                    if (targetField.getType().equals(sourceField.getType())) {
                        try {
                            targetField.setAccessible(true);
                            sourceField.setAccessible(true);
                            targetField.set(target, sourceField.get(source));
                            System.out.println(targetField.getName() + ": " + targetField.get(target));
                        } catch (IllegalAccessException e) {
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

