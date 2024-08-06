package model;

public class Admin extends Employee{
    private String role;
    private String duty;


    public Admin(String libraryName, String address, long phoneNo, int libraryId, String emailId, String name, String empID, String contactNo, String email, String address1, String role, String duty) {
        super(libraryName, address, phoneNo, libraryId, emailId, name, empID, contactNo, email, address1);
        this.role = role;
        this.duty = duty;
    }


}
