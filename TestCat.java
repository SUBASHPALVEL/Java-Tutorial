public class TestCat {
    public static void main(String[] args) {

        Cat myCat = new Cat();
        myCat.name = "Oscar";
        myCat.gender = 'M';
        myCat.age = 5;
        myCat.color = "White";
        myCat.weight = 5.5f;

        Cat yourCat = new Cat();
        yourCat.name = "Lexi";
        yourCat.gender = 'F';
        yourCat.age = 3;
        yourCat.color = "Brown";
        yourCat.weight = 4.75f;

        System.out.println("myCat.name is " + myCat.name);
        System.out.println("yourCat.name is " + yourCat.name);
        System.out.println("myCat.weight is " + myCat.weight);
        System.out.println("yourCat.weight is " + yourCat.weight);

        myCat.mew();
        yourCat.mew();

        myCat.walk(5);
        yourCat.walk(10);

    }
}
