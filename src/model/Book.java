package model;

public class Book extends Item{

    private String authorName;
    private int publishYear;

    public Book(String name, String uniqueID, String authorName, int publishYear) {
        super(name, uniqueID);
        this.authorName = authorName;
        this.publishYear = publishYear;
    }


    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    @Override
    public void displayDetails(){
      System.out.println("Book: " + super.getName() + " by " + this.getAuthorName() + ", Publication Date: " + this.getPublishYear());
    }
}
