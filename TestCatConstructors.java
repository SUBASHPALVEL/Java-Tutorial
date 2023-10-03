public class TestCatConstructors {
    public static void main(String[] args) {

        Cat myCat = new Cat();

        myCat.name="Oscar";

        Cat yourCat= new Cat("Lexi");

        System.out.println(yourCat.name);

        Cat myHouseCat =new Cat("Olive",1,'M');

        System.out.println("myHouseCat");
        System.out.println("------------------");
        System.out.println(myHouseCat.name);
        System.out.println(myHouseCat.gender);
        System.out.println(myHouseCat.age);

        System.out.println(myHouseCat.weight);
        System.out.println(myHouseCat.color);

    }
}

