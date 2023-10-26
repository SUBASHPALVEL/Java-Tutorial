package Abstraction;

    //Example for Abstracted class and methods

public abstract class Loan {

    private double amount;
    private String customerId;
    private int length;

    public Loan(String customerId, double amount, int length) {
        setCustomerId(customerId);
        setAmount(amount);
        setLength(length);
    }

    public Loan() {
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public abstract boolean apply();

    public abstract void pay();

    public abstract boolean repay(double amount);

}
