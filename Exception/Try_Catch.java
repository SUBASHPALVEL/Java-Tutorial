public class Try_Catch {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        try {

            System.out.println(numbers[8]);
            
        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("You specified a wrong index");
        }

        System.out.println("The next instruction after the Exception");
     
    }
}
