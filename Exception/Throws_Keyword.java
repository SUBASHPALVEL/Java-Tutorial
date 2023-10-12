import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Throws_Keyword {

    public static void printDateTime(String date) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yy");

        System.out.println(simpleDateFormat.parse(date));

    }

    public static void main(String[] args) throws ParseException {

        printDateTime("Subash");

    }
}
