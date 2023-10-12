public class Final_Block {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        try {
            System.out.println(numbers[0]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Wrong index");
        }
        finally {
            System.out.println("Finally block is being executed");
        }
    }
}
