package GenericClass;

public class CaptureHelper {

    public static void main(String[] args) {
        // We create a magical box for fruits that can hold any type of fruit.
        MagicalBox<String> fruitBox = new MagicalBox<>();

        // "Capture" - We put an orange into the box.
        fruitBox.putFruit("Orange");
        
        // "Helper" - We ask the Helper to give us the fruit from the box.
        String myFruit = fruitBox.getFruit();

        System.out.println("I got a " + myFruit); // This will print "I got an Orange."
    }
}

class MagicalBox<T> {
    private T item; // This is where we store the fruit in the box.

    // "Capture" - This method sets the fruit inside the box.
    public void putFruit(T fruit) {
        item = fruit;
    }

    // "Helper" - This method helps us get the fruit from the box.
    public T getFruit() {
        return item;
    }
}


