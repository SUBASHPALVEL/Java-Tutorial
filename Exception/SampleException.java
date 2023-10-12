public class SampleException {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        //  throws ArrayIndexOutOfBoundsException

        System.out.println(numbers[6]);
        

        int number = 10;

        // throws ArithmeticException

        System.out.println(number / 0);
        

        // causes overflow exception ( ArithmeticException )
        int x = Integer.MAX_VALUE;
        int y = 1;
        int sum = Math.addExact(x, y);
        

        String myString = null;
        // throws NullPointerException
        System.out.println(myString.length());

        // causes IllegalFormatConversionException
        String formattedString = String.format("My age is %d", "John");

        // throws NumberFormatException
        int myAge = Integer.parseInt("John");

    }
}
