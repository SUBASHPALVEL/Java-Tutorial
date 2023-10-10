public class TestPaymentPolymorphism {
    public static void main(String[] args) {
        Payment paymentA, paymentB, paymentC, paymentD;
        paymentA = new Payment();
        paymentB = new Cash();
        paymentC = new CreditCard();
        paymentD = new Cheque();

        paymentA.pay();
        paymentB.pay();
        paymentC.pay();
        paymentD.pay();
    }
}
