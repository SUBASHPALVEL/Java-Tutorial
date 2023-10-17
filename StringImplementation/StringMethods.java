package StringImplementation;

public class StringMethods {

    public static void main(String[] args) {
        String myState ="Tamil Nadu";
        System.out.println("Length:" + myState.length());

        System.out.println("char at index 0: "+myState.charAt(0));

        System.out.println("Substring starting from index 4:"+myState.substring(4));

        System.out.println("Occurrences of Nadu: "+myState.indexOf("Nadu"));
        System.out.println("Occurrences of Subash: "+myState.indexOf("Subash"));

        System.out.println(myState.equals("Tamil NAdu"));
        System.out.println(myState.equalsIgnoreCase("Tamil NAdu"));

        // compare lexicographically using compareTo() method
        System.out.println(myState.compareTo("Arizona"));
   
        String mySalary = String.valueOf(2000.155);
        System.out.println(mySalary.substring(4));

    }
}
