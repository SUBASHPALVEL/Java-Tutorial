public class Method_overloading {
    public static void main(String[] args) {

        int intA=3;
        int intB=5;

        float floatA=1.25f;
        float floatB=1.50f;

        System.out.println(add(intA,intB));
        System.out.println(add(floatA,floatB));

    }
    public static int add(int x, int y){
        System.out.println("Add method for adding INETEGERS is called");
        return x+y;
    }
    public static float add(float x, float y){
        System.out.println("Add method for adding FLOATS is called");
        return x+y;
    }
}
