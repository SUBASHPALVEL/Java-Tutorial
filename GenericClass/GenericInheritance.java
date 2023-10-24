package GenericClass;

class Printer<K> {
    void print(K k) {
        System.out.println(k.getClass().getName());
    }
}

class MyPrinter<K> extends Printer<K> {
    @Override
    void print(K k) {
        super.print(k);
    }
}

class MyStringPrinter extends Printer<String> {
    @Override
    void print(String s) {
        super.print(s);
    }
}

interface Printable<K> {
    void print(K k);
}

class MyPrintable<K> implements Printable<K> {
    @Override
    public void print(K k) {
        System.out.println(k.getClass().getName());
    }
}

class MyIntPrintable implements Printable<Integer> {
    @Override
    public void print(Integer integer) {
        System.out.println(integer.intValue());
    }
}

class MyGenericPrintable<T> extends MyIntPrintable {
}

public class GenericInheritance {
    public static void main(String[] args) {
        
    }
}
