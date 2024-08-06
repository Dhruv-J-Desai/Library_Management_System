package model;

import services.Library;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Employee extends Library {
    private String name;
    private String emp_id;
    private int contact_no;
    private String address;
    private String email;


    public Employee(String libraryName, String address, long phoneNo, int libraryId,
                    String emailId, String name, String emp_id, int contact_no,
                    String address1, String email) {
        super(libraryName, address, phoneNo, libraryId, emailId);
        this.name = name;
        this.emp_id = emp_id;
        this.contact_no = contact_no;
        this.address = address1;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(String emp_id) {
        this.emp_id = emp_id;
    }

    public int getContact_no() {
        return contact_no;
    }

    public void setContact_no(int contact_no) {
        this.contact_no = contact_no;
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
        System.out.println("Performing there duties" + "Name: " + getName() + " EmpId: " + getEmp_id() + " Email: " + getEmail());
    }
}

