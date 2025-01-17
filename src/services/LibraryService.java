package services;

import model.Book;
import model.Hardcopy;
import model.Item;
import model.Laptop;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LibraryService {

    private List<Item> listOfItems = new ArrayList<>();
    private List<Book> listOfBooks = new ArrayList<>();

    public void addItemToLibrary(Item item){
        listOfItems.add(item);
    }

    public List<Item> getItemsInLibrary(){

        return listOfItems;
    }

    public void addRandomItemsToLibrary(){

        Item Lost = new Book("Lost", "AB1", "Steve Jobs", 1999);
//        Book bookTesting2  = new Book("Lost", "AB1", "Steve Jobs", 1999);

        addItemToLibrary(Lost);
//        addItemToLibrary(bookTesting2);

        Item Maverick = new Laptop("Maaverick", "AB2", "12345678");
        addItemToLibrary(Maverick);

        Item FoundByElon = new Hardcopy("Found", "AB3", "Elon musk", 2003, "Hard Cover", "10X8", "C4 - 4");
        addItemToLibrary(FoundByElon);

    }

}
