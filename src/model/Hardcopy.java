package model;

public class Hardcopy extends Book{
    private String bindingType;
    private String dimensions;
    private String storageLocation;

    public Hardcopy(String name, String uniqueID, String authorName, int publishYear, String bindingType, String dimensions, String storageLocation) {
        super(name, uniqueID, authorName, publishYear);
        this.bindingType = bindingType;
        this.dimensions = dimensions;
        this.storageLocation = storageLocation;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public String getStorageLocation() {
        return storageLocation;
    }

    public void setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation;
    }

    @Override
    public void displayDetails(){
        System.out.println(this.getClass().getName() + ": " + super.getName() +
                " by " + this.getAuthorName() +
                ", Publication Date: " + this.getPublishYear() +
                ", with cover of Type: " + this.getBindingType() +
                ", Dimensions: " + this.getDimensions() +
                ", Stored at Location: " + this.getStorageLocation());
    }
}
