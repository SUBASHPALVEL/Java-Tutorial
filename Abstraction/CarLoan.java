package Abstraction;

// we will extend the abstract class Loan
// if we do not implement abstract methods here we get compilation error
// Also IntelliJ forces you to implement abstract methods. Click to red bulb
// and make IntelliJ generates them for you. You then modify them manually
// according to your need.
public class CarLoan extends Loan {

    // Since constructors can not be overridden we will add a new constructor
    // and we just call abstract class constructor using super keyword
    public CarLoan(String customerId, double amount, int length) {
        super(customerId, amount, length);
    }

    @Override
    public boolean apply() {
        System.out.println("Customer " + getCustomerId() + " applied for " +
                "car" +
                " " +
                "loan");
        return true;
    }

    @Override
    public void pay() {
        System.out.println(getAmount() + " paid to the car loan customer");
    }

    @Override
    public boolean repay(double amount) {
        System.out.println(amount + " car loan repaid");
        return true;
    }
}
