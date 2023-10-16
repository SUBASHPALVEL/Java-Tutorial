package Enums;

public class TestInheritance {
    public static void main(String[] args) {

        System.out.println(Paper.A1.compare(Paper.A4));
        for (Paper paper : Paper.values()) {
            System.out.println(paper);
            System.out.println(paper.getArea());
        }
    }

}
