public class Payment {
    
    public double maxDiscountRatio=3.75;


    public static String getAccountNumber(){
        return "Bank Account:123456789";
    }

    public void pay() {
        System.out.println("Payment class: Payment completed");
    }


    public void printInstallment(double totalAmount) {
        System.out.println("Payment class: Installment amount in Double: " + totalAmount / 3);
    }

}
