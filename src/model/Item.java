package model;

import services.Library;

public abstract class Item {
    private String name;
    private String uniqueID;


    public Item(String name, String uniqueID) {
        this.name = name;
        this.uniqueID = uniqueID;
    }

    public String getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(String uniqueID) {
        this.uniqueID = uniqueID;
    }

    public String getName() {
        return name;
    }

    public void setName(String title) {
        this.name = name;
    }

    public void displayDetails(){
        System.out.println("Name of the Item: " + this.getName() + " and Unique ID: " + this.getUniqueID());
    } //Abstract method to display details of the item.
}
