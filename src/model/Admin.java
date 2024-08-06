package model;

public class Admin extends Employee{
    private String role;
    private String duty;


    public Admin(String name, String empID, String contactNo, String email, String address1, String role, String duty) {
        super(name, empID, contactNo, email, address1);
        this.role = role;
        this.duty = duty;
    }

    @Override
    public void performDuty(){

    }

}
