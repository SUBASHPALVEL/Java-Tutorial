public class TestThisKeyword {
    public static void main(String[] args) {

        Cat myCat = new Cat("Olive", 'M', "White", 7, 5.8f);
        myCat.mewMultiple(5);

        Cat myLittleLexi = new Cat("Lexi", 'F', "Black", 7, 5.8f, 10.25f, 25.5f);
        System.out.println("Height:" + myLittleLexi.height);
        System.out.println("Length:" + myLittleLexi.name);
    }
    
}
