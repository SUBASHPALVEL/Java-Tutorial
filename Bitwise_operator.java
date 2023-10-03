public class Bitwise_operator {
    public static void main(String[] args) {


        int number=50;
        System.out.println("number in binary = "+Integer.toBinaryString(number));

        int numA=0b0011_0010;
        int numB=0b0000_0111;
        int andOp= numA & numB;
        System.out.println("numA = "+Integer.toBinaryString(numA));
        System.out.println("numB = "+Integer.toBinaryString(numB));
        System.out.println("andOp = "+Integer.toBinaryString(andOp));


        int orOP= numA | numB;
        System.out.println("numA = "+Integer.toBinaryString(numA));
        System.out.println("numB = "+Integer.toBinaryString(numB));
        System.out.println("orOp = "+Integer.toBinaryString(orOP));


        int xorOP= numA ^ numB;
        System.out.println("numA = "+Integer.toBinaryString(numA));
        System.out.println("numB = "+Integer.toBinaryString(numB));
        System.out.println("xorOp = "+Integer.toBinaryString(xorOP));

        int numG=50;
        int compOp=~numG;
        System.out.println("numG = "+Integer.toBinaryString(numG));
        System.out.println("complement of numG in binary= "+Integer.toBinaryString(compOp));



    }
}
