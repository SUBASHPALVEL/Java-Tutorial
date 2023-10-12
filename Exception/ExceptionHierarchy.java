public class ExceptionHierarchy {

    public static void main(String[] args) {

        String myString = null;

        recursive();

    }
    public static void recursive(){
        recursive();
    }
}
