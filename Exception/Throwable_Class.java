public class Throwable_Class {

    public static void main(String[] args) {

        String myString = null;
        try {
            System.out.println(myString.toUpperCase());
        } catch (NullPointerException exception) {
           
            System.out.println(exception.getMessage());

            exception.printStackTrace();

            System.out.println("stack trace length:" + exception.getStackTrace().length);


            for (StackTraceElement stackTraceElement :
                    exception.getStackTrace()) {
                System.out.println(stackTraceElement);
            }


        }
    }
}
