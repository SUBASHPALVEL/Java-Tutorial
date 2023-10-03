public class TestStaticOrClassMethod {
    public static void main(String[] args) {

        System.out.println("Before an instance is created numberOfCats: " + Cat.getNumberOfCats());

        Cat catOlive = new Cat("Olive", 'M', "white", 12, 5.0f, 10.0f, 25.0f);
        Cat catCharlie = new Cat("Charlie", 'M', "white", 12, 5.0f, 10.0f, 25.0f);
        Cat catLeo = new Cat("Leo", 'M', "white", 12, 5.0f, 10.0f, 25.0f);

        //to access a static method we use class name instead using instance
        System.out.println("After creating some instancesd numberOfCats: " + Cat.getNumberOfCats());

    }
}
