package model;

import java.sql.SQLOutput;

public class Jaintor extends Employee{

    public Jaintor(String name, String empID, String contactNo, String email, String address1) {
        super(name, empID, contactNo, email, address1);
    }

    @Override
    public void performDuty(){
        System.out.println("Janitor Cleaning.");
    }
}
