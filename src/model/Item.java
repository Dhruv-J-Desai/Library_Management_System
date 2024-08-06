package model;

public abstract class Item {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public abstract void displayDetails(); //Abstract method to display details of the item.
}
