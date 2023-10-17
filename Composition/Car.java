package Composition;

public class Car {
    private Engine engine;
    private Wheel[] wheels;

    public Car() {
        engine = new Engine();
        wheels = new Wheel[4];
        for (int i = 0; i < 4; i++) {
            wheels[i] = new Wheel();
        }
    }


    public static void main(String[] args) {
        System.out.println("Has a relationship");
    }
}

