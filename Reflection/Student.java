package Reflection;

public class Student {
    private int value;
    private String name;

    public Student(int value, String name) {
        this.value = value;
        this.name = name;
    }
    private Student(){}

    public void showValue(){
        System.out.println("Name: " + name+"\t"+ "Value: " + value);
    }

}
