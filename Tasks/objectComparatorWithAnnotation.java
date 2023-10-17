
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.Arrays;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface AlternativeName{
    public String name();
    public String alternative();
}




public class objectComparatorWithAnnotation {

    public static void main(String[] args) {

        Internclass intern = new Internclass(1,"Subash",123);
        Employeeclass employee = new Employeeclass(24,"Subash",80000,2911);

        copy(src, Employeeclass.class);

        Field[] internFields = intern.getClass().getDeclaredFields();
        Field[] employeeFields = employee.getClass().getDeclaredFields();
        System.out.println(Arrays.toString(internFields));
        System.out.println(Arrays.toString(employeeFields));


        AlternativeName alternativeName = employee.getClass().getAnnotation(AlternativeName.class);

        for (Field employeeField : employeeFields) {
            for (Field internField : internFields) {
                System.out.println("###################");
                System.out.println(employeeField.getName());
                System.out.println(alternativeName.alternative());
                if (employeeField.getName().equals(internField.getName()) ) {
                    System.out.println("--------------------1st---------------------------------");
                    System.out.println(employeeField.getName());
                    
                    try {
                        employeeField.setAccessible(true);
                        internField.setAccessible(true);
                        employeeField.set(employee, internField.get(intern));
                        System.out.println("Updated Employee: " + employee.ID + ", " + employee.Name + ", " + employee.Salary + ", " + employee.PermanentID);
                    } catch (IllegalAccessException | IllegalArgumentException e) {
                        e.printStackTrace();
                    }
                    
                }
                else if(internField.getName().equals(alternativeName.alternative())){
                    try {

                        System.out.println("--------------------2nd---------------------------------");
                        System.out.println(internField.getName());
                        
                        employeeField.setAccessible(true);
                        internField.setAccessible(true);
                        employeeField.set(employee, internField.get(intern));
                        System.out.println("Updated Employee: " + employee.ID + ", " + employee.Name + ", " + employee.Salary + ", " + employee.PermanentID);
                    } catch (IllegalAccessException | IllegalArgumentException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        System.out.println("Updated Employee: " + employee.ID + ", " + employee.Name + ", " + employee.Salary + ", " + employee.PermanentID);
    }
    
}


class Internclass {
        int EmpID;
        String Name;
        int PermanentID;
    
       
        public Internclass(int EmpID, String Name, int PermanentID) {
            this.EmpID =EmpID ;
            this.Name = Name;
            this.PermanentID = PermanentID;
        }
}


class Employeeclass {

        @AlternativeName(name= "ID", alternative="EmpID")
        int ID;
        String Name;
        int Salary;
        int PermanentID;
       
       
        public Employeeclass(int ID, String Name, int Salary,int PermanentID) {
            this.ID = ID ;
            this.Name = Name;
            this.Salary = Salary;
            this.PermanentID = PermanentID;
        }
}

