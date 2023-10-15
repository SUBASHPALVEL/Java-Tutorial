package Array;

import java.util.Arrays;
import java.util.Comparator;

class Student implements Comparable {
    private int id;
    private String name;

    //lets add constructor, getters and setters
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
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

  
    @Override
    public int compareTo(Object o) {

        return Integer.compare(this.id, ((Student) o).getId());

    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class ComparableArray {

    public static void main(String[] args) {
        Student studentA = new Student(100, "John");
        Student studentB = new Student(75, "Adam");
        Student studentC = new Student(200, "Alice");
      
        Student[] students = new Student[3];
        students[0] = studentA;
        students[1] = studentB;
        students[2] = studentC;

        Arrays.sort(students);

        System.out.println(Arrays.toString(students));


        int index = Arrays.binarySearch(students, studentB);
        System.out.println(index);


        Comparator myStudentComparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
               
                Student s1 = (Student) o1;
                Student s2 = (Student) o2;
                return Integer.compare(s2.getId(), s1.getId());
            }
        };
        
        Arrays.sort(students, myStudentComparator);
        System.out.println(Arrays.toString(students));
    }
}
