package model;

import services.Library;

public class Employee extends Library {
    private String name;
    private String empID;
    private String contactNo;
    private String address;
    private String email;


    public Employee(String libraryName, String address, long phoneNo, int libraryId, String emailId, String name, String empID, String contactNo, String email, String address1) {
        super(libraryName, address, phoneNo, libraryId, emailId);
        this.name = name;
        this.empID = empID;
        this.contactNo = contactNo;
        this.email = email;
        this.address = address1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void performDuty(){
        System.out.println("Performing there duties" + "Name: " + getName() + " EmpId: " + getEmpID() + " Email: " + getEmail());
    }
}

