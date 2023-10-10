public class PolymorphicSubtypes {
    public static void main(String[] args) {

        Payment[] myPayments = new Payment[3];
        myPayments[0] = new Payment();
        myPayments[1] = new CreditCard();
        myPayments[2] = new VisaCard();

        for (Payment payment : myPayments) {
            payment.pay();
        }
        payByCreditCard(new CreditCard());
        payByCreditCard(new VisaCard());

    }

    public static void payByCreditCard(CreditCard creditCard) {
        creditCard.pay();
    }
}
