import model.Book;
import model.Hardcopy;
import model.Item;
import model.Laptop;

import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

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