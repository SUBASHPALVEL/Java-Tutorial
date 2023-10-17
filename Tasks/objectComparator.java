import java.lang.reflect.Field;

class Employee {
    int ID;
    String Name;
    int Salary;
    int PfID;
   
   
    public Employee(int ID, String Name, int Salary,int PfID) {
        this.ID = ID ;
        this.Name = Name;
        this.Salary = Salary;
        this.PfID = PfID;
    }
}

class Intern {
    int ID;
    String Name;
    int PermanentID;

   
    public Intern(int InternID, String Name, int PermanentID) {
        this.InternID =InternID ;
        this.Name = Name;
        this.PermanentID = PermanentID;
    }
}



public class objectComparator {
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

        System.out.println("Updated Employee: " + employee.EmpID + ", " + employee.Name + ", " + employee.Salary + ", " + employee.PfID);
    }
}






