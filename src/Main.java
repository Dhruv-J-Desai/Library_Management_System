import model.Book;
import model.Hardcopy;
import model.Item;
import model.Laptop;
import services.LibraryService;

import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        LibraryService libraryABC = new LibraryService();

        List<Item> listOfItems = new ArrayList<>();
//        List<Book> listOfBooks = new ArrayList<>();

        libraryABC.addItemsToLibrary();
        listOfItems = libraryABC.getItemsInLibrary();

        libraryABC.addItemToLibrary(new Hardcopy("The Secret", "AB5", "ANkit", 1999, "ButterPaper", "19X10", "C4 - 5"));

        for(Item item : listOfItems) {
            if (item instanceof Hardcopy book) {
                item.displayDetails();
            }

        }
    }

}