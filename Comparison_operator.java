public class Comparison_operator {
    public static void main(String[] args) {

        int numA = 5;
        int numB = 10;

        System.out.println((numA > numB));

        boolean comparison = numA > numB;
        System.out.println(comparison);

        System.out.println(numA + "==" + numB + ": " + (numA == numB));
        System.out.println(numA + "!=" + numB + ": " + (numA != numB));
        System.out.println(numA + ">" + numB + ": " + (numA > numB));
        System.out.println(numA + "<" + numB + ": " + (numA < numB));
        System.out.println(numA + ">=" + numB + ": " + (numA >= numB));
        System.out.println(numA + "<=" + numB + ": " + (numA <= numB));

    }
}
