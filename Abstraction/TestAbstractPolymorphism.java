package Abstraction;

public class TestAbstractPolymorphism {

    // The best  way to test polymorphism is to use methods that takes
    // Polymorphic sub-types as arguments
    // we will declare a method that takes an argument that has  a type of Loan
    public static void testLoan(Loan loan) {
        loan.apply();
        loan.pay();
        loan.repay(100);
    }

    public static void main(String[] args) {

       
        Loan homeLoanA = new HomeLoan("AQ123", 200_000, 10);
        HomeLoan homeLoanB = new HomeLoan("AW890", 250_000, 5);
        CarLoan carLoan = new CarLoan("AS234", 25_000, 2);

        testLoan(homeLoanA);
        testLoan(homeLoanB);
        testLoan(carLoan);
    }

}
