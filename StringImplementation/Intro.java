package StringImplementation;

public class Intro {

    public static void main(String[] args) {

        String name = "Subash Palvel";
        String eMail = "subashpalvel.ai@gmail.com";
        String title = new String("ML Engineer");
        char[] TitleChars = {'M', 'L', '.'};
        String Title = new String(TitleChars);
        System.out.println(title);
        System.out.println(Title);

        String myCountry = "Germany";
        String yourCountry = "Germany"; 
        System.out.println("myCountry == yourCountry: "+(myCountry == yourCountry));
 
        String myCity = "Tirupur"; 
        String yourCity = new String("Tirupur");

        System.out.println("myCity == yourCity: "+(myCity == yourCity));
    }
}
