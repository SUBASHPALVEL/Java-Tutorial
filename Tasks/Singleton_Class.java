class A {
    private static A instance;

    private A() {

    }

    public static A getInstance() {
        if (instance == null) {
            instance = new A();
        }
        return instance;
    }
}

class B extends A {

}

class C extends A {

}

public class Singleton_Class {
    public static void main(String[] args) {
        B b = B.getInstance(); 
        C c = C.getInstance(); 
    }
}
