package StringImplementation;

public class Interning {

    public static void main(String[] args) {

        String myCountry = "Germany"; // it creates a new instance // put in stringpool
        String yourCountry = "Germany"; // it does not create a new instance // put in heap memory

        System.out.println("myCountry == yourCountry: "+(myCountry == yourCountry));
  
        String myCity = "Tirupur"; //creates an instance
        String yourCity = new String("Tirupur"); //creates another instance

        System.out.println("myCity == yourCity: "+(myCity == yourCity));


        String myVillage="Golden Village";
        String yourVillage =new String("Golden Village").intern();
        System.out.println("myVillage==yourVillage: " +(myVillage==yourVillage));

        String myState =new String("Tamil Nadu").intern();
        String yourState =new String("Tamil Nadu").intern();
        System.out.println("myState==yourState: " +(myState==yourState));

    }
}
