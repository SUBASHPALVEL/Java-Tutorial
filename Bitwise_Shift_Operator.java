public class Bitwise_Shift_Operator {
    public static void main(String[] args) {

        // signed operator
        int numA=2;
        int numB=numA<<2;
        System.out.println(numA+" = "+Integer.toBinaryString(numA));
        System.out.println(numB+" = "+Integer.toBinaryString(numB));

        numB=numA>>1;      // positive so 0 is added
        System.out.println(numA+" = "+Integer.toBinaryString(numA));
        System.out.println(numB+" = "+Integer.toBinaryString(numB));

        numA=-2;
        numB=numA>>1; // negative so 1 is added
        System.out.println(numA+" = "+Integer.toBinaryString(numA));
        System.out.println(numB+" = "+Integer.toBinaryString(numB));

        //unsigned operator
        numA=2; 
        numB=numA>>>1;
        System.out.println(numA+" = "+Integer.toBinaryString(numA));
        System.out.println(numB+" = "+Integer.toBinaryString(numB));

        numA=-2;
        numB=numA>>>1;
        System.out.println(numA+" = "+Integer.toBinaryString(numA));
        System.out.println(numB+" = "+Integer.toBinaryString(numB));
    }
}
