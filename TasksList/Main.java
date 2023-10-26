package TasksList;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Internclass intern = new Internclass(1, "Subash", 1245);
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
                            // Get the names of getter and setter methods
                            String targetFieldName = targetField.getName();
                            String sourceFieldName = sourceField.getName();
                            String getterName = "get" + Character.toUpperCase(sourceFieldName.charAt(0)) + sourceFieldName.substring(1);
                            String setterName = "set" + Character.toUpperCase(targetFieldName.charAt(0)) + targetFieldName.substring(1);

                            // Get the getter and setter methods
                            Method sourceGetter = source.getClass().getMethod(getterName);
                            Method targetSetter = target.getClass().getMethod(setterName, sourceField.getType());

                            // Get the value from the source object using the getter method and set it in the target object using the setter method
                            Object value = sourceGetter.invoke(source);
                            targetSetter.invoke(target, value);
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
    public int getEmpID() {
        return EmpID;
    }

    public void setEmpID(int empID) {
        EmpID = empID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPermanentID() {
        return PermanentID;
    }

    public void setPermanentID(int permanentID) {
        PermanentID = permanentID;
    }

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
    public String getID() {
        return ID;
    }

    public void setID(String iD) {
        ID = iD;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public int getPermanentID() {
        return PermanentID;
    }

    public void setPermanentID(int permanentID) {
        PermanentID = permanentID;
    }

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
