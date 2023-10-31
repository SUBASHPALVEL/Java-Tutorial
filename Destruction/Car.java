package Destruction;

class Car {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    public void start() {
        System.out.println(model + " is starting.");
    }

    @Override

     // finalize method runs before destruction
    protected void finalize() throws Throwable {
        // This method is similar to a destructor.
        System.out.println(model + " is being destroyed.");
    }
}
