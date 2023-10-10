public class CreditCard extends Payment {
    @Override
    public void pay() {
        System.out.println("Payment by credit card completed");
    }
   
}
