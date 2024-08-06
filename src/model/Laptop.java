package model;

public class Laptop extends Item{
    private String serialNumber;

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public void displayDetails(){
        System.out.println("Laptop: " + getTitle() + ", serial number: " + serialNumber);
    }
}
