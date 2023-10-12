public class Union_Exceptions {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        try {
            System.out.println(numbers[10]);

            int number = Integer.parseInt("abc");
            
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("An exception is occured.");
        }
    }
}
