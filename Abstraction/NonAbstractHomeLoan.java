package Abstraction;

public class NonAbstractHomeLoan extends NonAbstractLoan {

    public NonAbstractHomeLoan (String customerId, double amount, int length) {
        super(customerId, amount, length);
    }

    @Override
    public boolean apply() {
        System.out.println("Customer " + getCustomerId() + " applied for home" +
                " " +
                "loan");
        return true;
    }

    @Override
    public void pay() {
        System.out.println(getAmount() + " paid to the home loan customer");
    }

    @Override
    public boolean repay(double amount) {
        System.out.println(amount + " home loan repaid");
        return true;
    }
}
