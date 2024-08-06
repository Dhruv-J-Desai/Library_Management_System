package model;

public class Member {
    private int memberId;
    private String memberName;
    private String contactNo;
    private int age;
    private String address;
    private String email;

    public Member(int memberId, String memberName, String contactNo, int age, String address, String email) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.contactNo = contactNo;
        this.age = age;
        this.address = address;
        this.email = email;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
    public void showInfo(){
        System.out.println("Member Id: " + this.getMemberId() + " Member name: " + this.getMemberName() + " Email: " + this.getEmail());
    }
}
