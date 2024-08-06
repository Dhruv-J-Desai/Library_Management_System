package services;

import model.Book;

import java.util.LinkedList;
import java.util.List;

public class LibraryService {
    List<Book> booklist = new LinkedList<Book>();
    public List<Book> addBook(Book book){
        booklist.add(book);
        return booklist;
    }
}
