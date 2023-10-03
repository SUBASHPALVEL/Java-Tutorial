public class Type_promotions_in_expression {
    public static void main(String[] args) {

        byte  b =15;
        char  c ='W';
        short s=1500;
        int i=10000;
        float f=120.133f;
        double d=.112233;
        double result=(b/f) + (i *c) - (d /s);
        System.out.println(" result is = " + result);

        byte  myByteVal=25;
        byte  resultB =(byte)(myByteVal*2);
        System.out.println(" result is = " + resultB);

    }
}
