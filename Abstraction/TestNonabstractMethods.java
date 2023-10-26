package Abstraction;

public class TestNonabstractMethods {
    public static void main(String[] args) {
        
        NonAbstractHomeLoan  homeLoan = new NonAbstractHomeLoan ("A12345", 100_000, 5);
        if (homeLoan.checkCreditHistory()) {
            if (homeLoan.apply()) {
                homeLoan.pay();
            }
        }
    }
}
