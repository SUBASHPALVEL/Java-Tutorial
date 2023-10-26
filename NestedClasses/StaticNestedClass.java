package NestedClasses;

public class StaticNestedClass {
    public static void main(String[] args) {

        Car myCar = new Car("Toyota", "Camry");
            // Car.Engine can be independently acccessed
        Car.Engine carEngine = new Car.Engine(4, "V6");

        System.out.println("My car's engine info: " + carEngine.getEngineInfo());
        carEngine.start();

        System.out.println("Car Make: " + myCar.getMake());
        System.out.println("Car Model: " + myCar.getModel());
    }
}

class Car {
    private String make;
    private String model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public static class Engine {
        private int cylinders;
        private String type;

        public Engine(int cylinders, String type) {
            this.cylinders = cylinders;
            this.type = type;
        }

        public void start() {
            System.out.println("Engine started!");
        }

        public String getEngineInfo() {
            return "Engine type: " + type + ", Cylinders: " + cylinders;
        }
    }
}


