package Externalization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

class Employee implements Externalizable {

    private int id;
    private String name;
    private double salary;

    // Since Externalizable requires public no-arg constructor we should add no-arg constructor.
    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;

    }


    // Since we implemented the Externalizable Interface, we must override
    // the methods readExternal() and writeExternal().

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {

        out.writeInt(this.id);
        out.writeObject(this.name);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException,ClassNotFoundException {
        this.id = in.readInt();
        this.name = (String) in.readObject();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
