package model;

public class Hardcopy extends Book{
    public String isbn;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public void displayDetails(){
        System.out.println("Hardcopy: " + getTitle() + " by " + getAuthor_name() + ", ISBN: " + isbn);
    }
}
