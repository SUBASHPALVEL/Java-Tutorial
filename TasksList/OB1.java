package TasksList;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class OB1 {
    public static void main(String[] args) {
        Internclass intern = new Internclass(1, "Subash", 123);
        Employeeclass employee = new Employeeclass("27", "Subash", 80000, 124);

        copy(intern, employee);

        System.out.println("Updated Employee: " + employee.ID + ", " + employee.Name + ", " + employee.Salary + ", " + employee.PermanentID);
    }

    public static <S, T> void copy(S source, T target) {
        Field[] sourceFields = source.getClass().getDeclaredFields();
        Field[] targetFields = target.getClass().getDeclaredFields();

        for (Field targetField : targetFields) {
            for (Field sourceField : sourceFields) {
                AlternativeName altNameAnnotation = targetField.getAnnotation(AlternativeName.class);
                String altFieldName = altNameAnnotation != null ? altNameAnnotation.alternative() : null;

                if (targetField.getName().equals(sourceField.getName()) || (altFieldName != null && altFieldName.equals(sourceField.getName()))) {
                    if (targetField.getType().equals(sourceField.getType())) {
                        try {
                            String targetFieldName = targetField.getName();
                            String sourceFieldName = sourceField.getName();
                            String getterName = "get" + Character.toUpperCase(sourceFieldName.charAt(0)) + sourceFieldName.substring(1);
                            String setterName = "set" + Character.toUpperCase(targetFieldName.charAt(0)) + targetFieldName.substring(1);

                            Method sourceGetter = source.getClass().getMethod(getterName);
                            Method targetSetter = target.getClass().getMethod(setterName, sourceField.getType());

                            Object value = sourceGetter.invoke(source);
                            targetSetter.invoke(target, value);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    else{
                        Object sourceValue = getFieldValue(source, sourceField);
                        Object convertedValue = convertValue(targetField.getType(), sourceValue);
                        setFieldValue(target, targetField, convertedValue);
                    }
                }
            }
        }
    }


    private static Object getFieldValue(Object object, Field field) {
        try {
            field.setAccessible(true);
            return field.get(object);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static void setFieldValue(Object object, Field field, Object value) {
        try {
            field.setAccessible(true);
            field.set(object, value);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    private static Object convertValue(Class<?> targetType, Object value) {
        if (targetType.equals(Integer.class) && value instanceof String) {
            try {
                return Integer.parseInt((String) value);
            } catch (NumberFormatException e) {
                e.printStackTrace();
                return null;
            }
        }
        else if (targetType.equals(String.class) && value instanceof Integer) {
            try {
                return String.valueOf(value);
            } catch (NumberFormatException e) {
                e.printStackTrace();
                return null;
            }
        }
        else if (targetType.equals(Double.class) && value instanceof String) {
            try {
                return Double.parseDouble((String) value);
            } catch (NumberFormatException e) {
                e.printStackTrace();
                return null;
            }
        }
        return null; 
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
    Address address;

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
    Address address;

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
