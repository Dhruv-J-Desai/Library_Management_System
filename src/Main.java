import model.Book;
import model.Hardcopy;
import model.Item;
import model.Laptop;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {
//
//            // Press Shift+F9 to start debugging your code. We have set one breakpoint
//            // for you, but you can always add more by pressing Ctrl+F8.
//            System.out.println("i = " + i);
//        }

        List<Item> listOfItems = new ArrayList<>();
        List<Book> listOfBooks = new ArrayList<>();

        Item bookTesting = new Book("Lost", "AB1", "Steve Jobs", 1999);
        Book bookTesting2  = new Book("Lost", "AB1", "Steve Jobs", 1999);

        listOfItems.add(bookTesting);
        listOfItems.add(bookTesting2);

//        listOfBooks.add(bookTesting2);
//        listOfBooks.add(bookTesting); // Makes sense why it won't work

        Item laptopTesting = new Laptop("Maaverick", "AB2", "12345678");
        listOfItems.add(laptopTesting);

        Item hardCopyTesting = new Hardcopy("Found", "AB3", "Elon musk", 2003, "Hard Cover", "10X8", "C4 - 4");
        listOfItems.add(hardCopyTesting);

        for(Item item : listOfItems){
            item.displayDetails();
        }

    }
}