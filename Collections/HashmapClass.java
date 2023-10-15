package Collections;

import java.util.HashMap;

public class HashmapClass {

    public static void main(String[] args) {
        Student studentA = new Student(30, "Isabella", "Smith");
        Student studentB = new Student(2, "William", "Miller");
        Student studentC = new Student(250, "Micheal", "Jones");
        
        HashMap<Integer, Student> studentsMap = new HashMap<>();
        studentsMap.put(studentA.getId(), studentA);
        studentsMap.put(studentB.getId(), studentB);
        studentsMap.put(studentC.getId(), studentC);

        System.out.println(studentsMap);
        System.out.println(studentsMap.get(30));
        System.out.println(studentsMap.containsKey(5));
        System.out.println(studentsMap.get(5));

        studentsMap.remove(30);

        System.out.println(studentsMap);

        HashMap<Integer, Student> studentHashMap = new HashMap<>(32, 0.50f);
    }
}
