package model;

public class EBook extends Book{
    private int eBookID;

    public EBook(String name, String uniqueID, String authorName, int publishYear, int eBookID) {
        super(name, uniqueID, authorName, publishYear);
        this.eBookID = eBookID;
    }

    public int geteBookID() {
        return eBookID;
    }

    public void seteBookID(int eBookID) {
        this.eBookID = eBookID;
    }

    @Override
    public void displayDetails(){
        System.out.println("EBook: " + this.getName() + " by " + this.getAuthorName() + ", ebook_id: " + this.geteBookID());
    }
}
