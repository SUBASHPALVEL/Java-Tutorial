import java.util.Arrays;

public class TestStaticBlock {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(Cat.catSpecies));
        Cat catA = new Cat();
        System.out.println(Arrays.toString(Cat.catSpecies));
        Cat catB = new Cat();
        System.out.println(Arrays.toString(Cat.catSpecies));

    }
}
