public class Multiple_Catch {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        try {
            // causes ArrayIndexOutOfBoundException
            System.out.println(numbers[10]);

            // causes NumberFormatException
            int number = Integer.parseInt("abc");
          
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("You specified a wrong index");
        } catch (NumberFormatException e) {
            System.out.println("Number format exception");
        }
        String name = null;
        // causes NullPointerException
        try {
            System.out.println(name.substring(1));
           
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception occurred");
        }
        
        catch (Exception e) {
            System.out.println("Parent exception");
        }
        System.out.println("Last statement in the main() method ");
    }
}
