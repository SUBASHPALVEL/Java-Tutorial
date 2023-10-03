public class TestNumberOfCat {
    public static void main(String[] args) {

        System.out.println("Before an instance is created Cat.numberOfCats: " + Cat.numberOfCats);

        Cat catOlive = new Cat("Olive", 'M', "white", 12, 5.0f, 10.0f, 25.0f);
        Cat catCharlie = new Cat("Charlie", 'M', "white", 12, 5.0f, 10.0f, 25.0f);
        Cat catLeo = new Cat("Leo", 'M', "white", 12, 5.0f, 10.0f, 25.0f);

        System.out.println("number of cats created so far: " + Cat.numberOfCats);
        System.out.print("name:" + catOlive.name + " id:" + catOlive.id);
        System.out.println();
        System.out.print("name:" + catCharlie.name + " id:" + catCharlie.id);
        System.out.println();
        System.out.print("name:" + catLeo.name + " id:" + catLeo.id);
        System.out.println();

    }
}
