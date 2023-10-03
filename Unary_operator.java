public class Unary_operator {
    public static void main(String[] args) {

        int numA=5;
        int numB=-numA;
        System.out.println("numB = "+numB);

        int numC=5;
        int numD=numC++;
        System.out.println("numC = "+numC);
        System.out.println("numD = "+numD);

        int numE=5;
        int numF=++numE;
        System.out.println("numE = "+numE);
        System.out.println("numF = "+numF);

        int numG=5;
        int numH=numG--;
        System.out.println("numG = "+numG);
        System.out.println("numH = "+numH);

        int numI=5;
        int numJ=--numI;
        System.out.println("numI = "+numI);
        System.out.println("numJ = "+numJ);

        // Bitwise not
        int numK=5;
        int numL=~numK;
        System.out.println("numL = "+numL);

        int numM=0b00000000_00000000_00000000_0000_0101; //5
        int numN=0b11111111_11111111_11111111_1111_1010;//-6
        System.out.println("numM = "+numM);
        System.out.println("numN = "+numN);

        boolean isOpen=true;
        boolean isClose=!isOpen;
        System.out.println("isOpen = "+isOpen);
        System.out.println("isClose = "+isClose);
    }
}
