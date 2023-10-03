public class Methods {
    public static void main(String[] args) {
     
        int addition = add(5, 8);
        System.out.println(addition);

        
        float myNumber = 12.0f;
        float cubeOfTheNumber = cube(myNumber);
        System.out.println(cubeOfTheNumber);
    }

    public static int add(int numberA, int numberB) {
        int result = numberA + numberB;
        return result;
    }
    public static float cube(float number) {

        float result = number * number * number;
        return result;
    }
}
