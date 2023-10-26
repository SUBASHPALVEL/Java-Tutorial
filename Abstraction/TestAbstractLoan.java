package Abstraction;

public class TestAbstractLoan {
    public static void main(String[] args) {
        HomeLoan homeLoan= new HomeLoan("A12345",100_000,5);
        homeLoan.apply();
        homeLoan.pay();
        homeLoan.repay(100);
    }
}
