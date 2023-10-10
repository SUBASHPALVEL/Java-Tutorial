public class TestUpcastingDowncasting {
    public static void main(String[] args) {
      
        Payment payment = new Bitcoin();
        //in above declaration upcasting is done automatically safely. We can
        // do the same upcasting explicitly
        Bitcoin bitcoin = new Bitcoin();
        Payment bitCoinPayment = (Payment) bitcoin;

        // With upcast reference we can not access the members that are
        // defined only in the sub class, they can be accessed only with
        // their own reference types
        System.out.println(bitcoin.oneBitcoin);
        System.out.println(bitcoin.exchangeBitcoin(10));

        //if we try to access the members that are defined only in the sub
        // class with an upcast reference ,bitCoinPayment, we got compilation
        // error
        //System.out.println(bitCoinPayment.oneBitcoin);
        //System.out.println(bitCoinPayment.exchangeBitcoin(10));

        //we will now create some different types objects and pass as
        // argument to the pyByAnything() method
        // Each  passing object implicitly is upcast to Payment type, if it
        // is one of the sub classes of Payment super class
        payByAnything(new Cash());
        payByAnything(new Bitcoin());
        payByAnything(new Payment());
        //here Cash and Bitcoin are implicitly are upcast to payment
        //and overriding methods of each method is invoked

        //Also we can create an array that has type of super and put the
        // elements that has a sub type of super class. So while putting the
        // each element to the array upcasting is done implicitly
        Payment[] payments = {new Payment(), new Bitcoin(), new Cash()};
        //so with each element we can do whatever we do with upcast reference
        //for example we can access hidden members in the Payment class
        // remember that getAccountNumber() method of Bitcoin hides the same
        // method in the Payment class. but it is inherited by Cash class
        for (Payment p : payments) {
            System.out.println(p.getAccountNumber());
        }

        //We use downcasting whenever we want to access behaviors of the
        // subtypes. This is used more frequently than that of upcasting
        //assume that we need to call members that only belong to the object
        // that is assigned to super class reference
        //for example  we need to access oneBitcoin field and
        // exchangeBitcoin() method that are defined in Bitcoin class using
        // bitCoinPayment reference whose type is Payment
        // we will downcast bitCoinPayment to Bitcoin type
        System.out.println(((Bitcoin) bitCoinPayment).oneBitcoin);
        System.out.println(((Bitcoin) bitCoinPayment).exchangeBitcoin(10));

        //Compiler allows downcast from a super type to a sub type even if
        // the actual object has a different type than downcast type
        // This problem is solved by JVM by performing (RTTI) Run time type
        // information check which is very expensive operation
        // Lets create a Payment object and downcast it to Bitcoin and then call
        // the exchangeBitcoin() method . You see that it will be compiled
        // but fail at run time
        Payment myPayment = new Payment();
        //System.out.println(((Bitcoin)myPayment).exchangeBitcoin(10));

        // so to avoid run time cast problem we should use instanceof method
        // to check there is "IS A" relation
        if (myPayment instanceof Bitcoin) {
            System.out.println(((Bitcoin) myPayment).exchangeBitcoin(10));
        } else {
            System.out.println("myPayment object can not be downcasted to " +
                    "Bitcoin");
        }


    }

    // The most common use of upcast is using methods that takes super types
    // as arguments so that passing sub types automatically implicitly upcast
    // to the super type. To illustrate this we will add a method that takes
    // an argument that has a type of super class
    public static void payByAnything(Payment payment) {
        payment.pay();
    }
}
