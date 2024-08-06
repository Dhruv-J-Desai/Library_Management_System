package model;

public class Laptop extends Item {
    private String serialNumber;

    public Laptop(String name, String uniqueID, String serialNumber) {
        super(name, uniqueID);
        this.serialNumber = serialNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public void displayDetails(){
        System.out.println("Laptop: " + super.getName() + ", serial number: " + serialNumber);
    }
}
