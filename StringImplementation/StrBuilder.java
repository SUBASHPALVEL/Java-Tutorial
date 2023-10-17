package StringImplementation;

public class StrBuilder {

    public static void main(String[] args) {

        StringBuilder addressBuilder = new StringBuilder("Newyork");
        System.out.println(addressBuilder);

        addressBuilder.append(12345);
        System.out.println(addressBuilder);

        addressBuilder.insert(7, "-");
        System.out.println(addressBuilder);

        addressBuilder.replace(0, 7, "N.Y");
        System.out.println(addressBuilder);

        addressBuilder.reverse();
        System.out.println(addressBuilder);

        System.out.println("Length:" + addressBuilder.length());
        System.out.println("Capacity:" + addressBuilder.capacity());

        addressBuilder.ensureCapacity(128);
        System.out.println("Length:" + addressBuilder.length());
        System.out.println("Capacity:" + addressBuilder.capacity());

        addressBuilder.setLength(5);
        System.out.println("Length:" + addressBuilder.length());
        System.out.println("Capacity:" + addressBuilder.capacity());
        System.out.println(addressBuilder);

    }
}
