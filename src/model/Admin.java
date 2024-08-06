package model;

public class Admin extends Employee{
    private String role;
    private String duty;


    public Admin(String name, String emp_id, int contact_no, String address1, String email, String role, String duty) {
        super(name, emp_id, contact_no, address1, email);
        this.role = role;
        this.duty = duty;
    }
}
