package Abstraction;

public class TestStaticMembers {
    public static void main(String[] args) {
       
        System.out.println(StaticMemberLoan.maxTotalLoan);
     
        double repaymetAmount=StaticMemberHomeLoan.calcRepaymentAmount(50_000,1.15,5);
        System.out.println(repaymetAmount);

        //we can acess static members on objects but this is not recommended
        // it is a bad practise
        StaticMemberHomeLoan homeLoan= new StaticMemberHomeLoan("a123",300,10);
        System.out.println(homeLoan.maxTotalLoan);

    }
}

