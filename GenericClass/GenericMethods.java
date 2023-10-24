package GenericClass;

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

class Computer {
    private String serialNo;
    private int memory;

    public Computer(String serialNo, int memory) {
        this.serialNo = serialNo;
        this.memory = memory;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public int getMemory() {
        return memory;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "serialNo='" + serialNo + '\'' +
                ", memory=" + memory +
                '}';
    }
}

public class GenericMethods {
    public static <K> void print(K[] kArray) {
        for (K k : kArray) {
            System.out.println(k);
        }
    }

    public static void main(String[] args) {
        Student[] students = {new Student(1, "John"), new Student(2, "Caroline")};
        print(students);

        Computer[] computers = {new Computer("qa123", 32), new Computer("qb789", 64)};
        print(computers);

        GenericMethods.<Student>print(students);

        // This line causes a compilation error since the type doesn't match.
        // Main.<Student>print(computers);
    }
}
