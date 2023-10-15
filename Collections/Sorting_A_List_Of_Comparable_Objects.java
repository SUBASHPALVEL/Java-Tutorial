package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting_A_List_Of_Comparable_Objects {

    public static void main(String[] args) {

        Book bookA= new Book("Wisdom of the Dervish","Dogan Cuceloglu",10.0);
        Book bookB= new Book("Operating Systems","Andrew Tanenbaum",15.0);
        Book bookC= new Book("Java How To Program","Deitel",12.0);

        List<Book> books= new ArrayList<>();
        books.add(bookA);
        books.add(bookB);
        books.add(bookC);

        Collections.sort(books);

        for (Book book : books) {
            System.out.println(book);
        }


    }
}
