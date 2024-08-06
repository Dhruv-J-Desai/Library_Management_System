import model.*;
import services.LibraryService;

import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        LibraryService libraryABC = new LibraryService();

        List<Item> libraryItems;

        libraryABC.addRandomItemsToLibrary();
        libraryItems = libraryABC.getItemsInLibrary();

        libraryABC.addItemToLibrary(new Hardcopy("The Secret", "AB5", "ANkit", 1999, "ButterPaper", "19X10", "C4 - 5"));

        for(Item item : libraryItems) {
//            if (item instanceof Hardcopy book) {
                item.displayDetails();
//            }

        }
    }

}