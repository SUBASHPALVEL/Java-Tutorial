public class BookTest {
    public static void main(String[] args) {
    Book mathBook = new Book();

        mathBook.setIsbn("ISBN 0-13-089571-3");
        mathBook.setName("Calculus");
        mathBook.setAuthor("John");
        mathBook.setWeight(0.90f);

        System.out.println("ISBN: " + mathBook.getIsbn());
        System.out.println("Name: " + mathBook.getName());
        System.out.println("Author: " + mathBook.getAuthor());
        System.out.println("Publisher: " + mathBook.getPublisher());
        System.out.println("Weight: " + mathBook.getWeight());

        System.out.println("Sales Price: "+mathBook.getSalePrice());
    }
}
