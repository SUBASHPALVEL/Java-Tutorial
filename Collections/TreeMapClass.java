package Collections;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapClass {

    public static void main(String[] args) {
        Student studentA = new Student(30, "Isabella", "Smith");
        Student studentB = new Student(2, "William", "Miller");
        Student studentC = new Student(250, "Micheal", "Jones");
        Student studentD = new Student(180, "Sophia", "Jones");

        TreeMap<Integer, Student> studentsMap = new TreeMap<>();
        studentsMap.put(studentA.getId(), studentA);
        studentsMap.put(studentB.getId(), studentB);
        studentsMap.put(studentC.getId(), studentC);
        studentsMap.put(studentD.getId(), studentD);

        System.out.println(studentsMap);
        System.out.println(studentsMap.get(30));
        System.out.println(studentsMap.containsKey(5));
        System.out.println(studentsMap.get(5));

        studentsMap.remove(30);
        System.out.println(studentsMap);

        System.out.println("firstEntry: " + studentsMap.firstEntry());
        System.out.println("lastEntry: " + studentsMap.lastEntry());
        System.out.println("celingEntry(15) : " + studentsMap.ceilingEntry(35));
        System.out.println("floorEntry(15) : " + studentsMap.floorEntry(35));
        System.out.println("headMap(15) : " + studentsMap.headMap(35));
        System.out.println("tailMap(15) : " + studentsMap.tailMap(35));
        System.out.println("pollLastEntry() : " + studentsMap.pollLastEntry());
        System.out.println(studentsMap);

        TreeMap<Integer, Student> reverseMap = new TreeMap<>(Comparator.reverseOrder());
        reverseMap.put(studentA.getId(), studentA);
        reverseMap.put(studentB.getId(), studentB);
        reverseMap.put(studentC.getId(), studentC);
        reverseMap.put(studentD.getId(), studentD);

        System.out.println(reverseMap);
    }
}
