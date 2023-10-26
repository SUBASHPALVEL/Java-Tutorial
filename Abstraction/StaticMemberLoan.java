package Abstraction;


public abstract class StaticMemberLoan  {
    // We will add a static field is common to all Loan types and sub types.
    // We can declare maximum total amount of the loan that a loaner
    // company give and we can also mark it final to make unmodifiable
    final static double maxTotalLoan = 300_000_000;
  
    private double amount;
    private String customerId;
    private int length;

    public StaticMemberLoan(String customerId, double amount, int length) {
        setCustomerId(customerId);
        setAmount(amount);
        setLength(length);
    }


    public StaticMemberLoan() {
    }

    // static methods that is common to all subclasses

    public static double calcRepaymentAmount(double amount,
                                             double interestRate, int length) {

        return amount + amount * interestRate * length / 12;
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

    private boolean checkLoanHistory() {
        System.out.println("Loan history is checking...");
        return true;
    }

    private boolean checkCreditCardHistory() {
        System.out.println("Credit card history is checking...");
        return true;
    }


    public final boolean checkCreditHistory() {
        if (!checkLoanHistory()) return false;
        if (!checkCreditCardHistory()) return false;
        System.out.println("Credit History Check Completed for the customer: "
                + getCustomerId());
        return true;
    }

}
