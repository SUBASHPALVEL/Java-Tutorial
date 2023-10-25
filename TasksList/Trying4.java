package TasksList;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.Arrays;

public class Trying4 {
    public static void main(String[] args) {
        Internclass source = new Internclass(1, "Subash", 123);
        Class <Employeeclass> target = Employeeclass.class;

        Field[] sourceFields = source.getClass().getDeclaredFields();
        Field[] targetFields = target.getDeclaredFields(); // Use target.getClass() to get the class's declared fields.
        System.out.println(Arrays.toString(sourceFields));
        System.out.println(Arrays.toString(targetFields));

        for (Field targetField : targetFields) {
            for (Field sourceField : sourceFields) {
                AlternativeName altNameAnnotation = targetField.getAnnotation(AlternativeName.class);
                if (altNameAnnotation != null) {
                    String altFieldName = altNameAnnotation.name();
                    String altFieldNameAlternative = altNameAnnotation.alternative();

                    if (targetField.getName().equals(altFieldName) || targetField.getName().equals(altFieldNameAlternative)) {
                        System.out.println("Entering 1st IF");
                        if (targetField.getType().equals(sourceField.getType())) {
                            System.out.println("Entering 2nd IF");
                            try {
                                targetField.setAccessible(true);
                                sourceField.setAccessible(true);
                                targetField.set(target, sourceField.get(source));
                                System.out.println(targetField.getName() + ": " + targetField.get(target));
                            } catch (IllegalAccessException | IllegalArgumentException e) {
                                e.printStackTrace();
                            }
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
}

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface AlternativeName {
    String name();

    String alternative();
}

