package Enums;

public class TestEnumMethods {
    public static void main(String[] args) {
        
        System.out.println(Paper.A1.name());

        System.out.println("A1 ordinal: "+Paper.A1.ordinal());
        System.out.println("A2 ordinal: "+Paper.A2.ordinal());

        Paper A1Paper=Paper.valueOf("A1");
        System.out.println(A1Paper);


        Paper[] papers= Paper.values();
        for (Paper paper:papers ) {
            System.out.println("Name: "+paper.name());
            System.out.println("Ordinal: "+paper.ordinal());
            System.out.println("Width: "+paper.getWidth());
            System.out.println("Length: "+paper.getLength());
            System.out.println("------------------------------------");
        }
    }
}
