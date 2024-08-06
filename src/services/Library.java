package services;

import model.Book;

import java.util.LinkedList;
import java.util.List;

public class Library {
private String libraryName;
private String address;
private long phoneNo;
private int libraryId;
private String emailId;

    public Library(String libraryName, String address, long phoneNo, int libraryId, String emailId) {
        this.libraryName = libraryName;
        this.address = address;
        this.phoneNo = phoneNo;
        this.libraryId = libraryId;
        this.emailId = emailId;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public String getAddress() {
        return address;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public int getLibraryId() {
        return libraryId;
    }

    public String getEmailId() {
        return emailId;
    }
}
