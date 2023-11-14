package Externalization;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        try {
            Employee employee = new Employee();
            employee.setId(100);
            employee.setName("John");
            employee.setSalary(250);

            FileOutputStream fileOutputStream = new FileOutputStream("serialized_employee");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(employee);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("Serialized data is saved in serialized_employee file");
        } catch (IOException e) {
            System.out.println(e);
        }

        Employee deserializedEmployee = null;
        try {

            FileInputStream fileInputStream = new FileInputStream("serialized_employee");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            deserializedEmployee = (Employee) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();

        } catch (IOException | ClassNotFoundException exc) {
            System.out.println(exc);
            exc.printStackTrace();
        }

        System.out.println(deserializedEmployee);
    }
}
