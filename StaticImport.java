/*import static java.lang.Math.cos;
import static java.lang.Math.PI;
import static java.lang.Math.E;*/
import static java.lang.Math.*;

public class StaticImport {
    public static void main(String[] args) {

        double result= Math.cos(Math.PI*Math.E);

        result= cos(PI*E);
        System.out.println(result);

    }
}
