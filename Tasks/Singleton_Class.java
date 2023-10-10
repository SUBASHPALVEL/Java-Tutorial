public class Singleton_Class {
    public static void main(String[] args) {
        B b = new B(); 
        
        C c = new C(); 
    }
}

class A {
   
}

class B extends A {
    private static boolean created = false;

    public B() {
        if (created) {
            throw new IllegalStateException("Only one instance of B can be created.");
        }
        created = true;
    }


}

class C extends A {
    private static boolean created = false;

    public C() {
        if (created) {
            throw new IllegalStateException("Only one instance of C can be created.");
        }
        created = true;
    }

}

