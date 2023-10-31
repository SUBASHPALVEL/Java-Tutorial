package Destruction;

public class DestructorExample {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota");
        Car car2 = new Car("Honda");

        car1.start();
        car2.start();

        // Explicitly setting the references to null to make the objects eligible for garbage collection.
        car1 = null;
        car2 = null;

        // The garbage collector may run at some point, calling the finalize method.
        System.gc(); // Explicitly request garbage collection

        // After the garbage collection, you might see the "finalize" messages.
    }
}