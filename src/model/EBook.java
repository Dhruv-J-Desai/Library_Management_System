package model;

public class EBook extends Book{
    private int ebook_id;

    public int getEbook_id() {
        return ebook_id;
    }

    public void setEbook_id(int ebook_id) {
        this.ebook_id = ebook_id;
    }

    @Override
    public void displayDetails(){
        System.out.println("EBook: " + getTitle() + " by " + getAuthor_name() + ", ebook_id: " + ebook_id);
    }
}
