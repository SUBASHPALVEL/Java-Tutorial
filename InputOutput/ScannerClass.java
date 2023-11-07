package InputOutput;

import java.math.BigDecimal;
import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        String name = input.nextLine();

        System.out.print("Enter employee age: ");
        int age = input.nextInt();

        System.out.print("Enter employee salary: ");
        BigDecimal salary = input.nextBigDecimal();

        System.out.println("--------------------------");
        System.out.println("Employee Name:"+name);
        System.out.println("Employee Age:"+age);
        System.out.println("Employee Salary:"+salary);

        input.close();

    }
}
