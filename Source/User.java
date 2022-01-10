package entity;

public class User {

    private String name,dateOfBirth,email,phoneNumber,password,gender,membershipType,balance;

    public User () {

        this.name = null;
        this.dateOfBirth = null;
        this.email = null;
        this.phoneNumber = null;
        this.password = null;
        this.gender = null;
        this.membershipType = null;
        this.balance = null;

    }

    public User (String [] info) {

        this.name = info[0];
        this.dateOfBirth = info[1];
        this.email = info[2];
        this.phoneNumber =info[3];
        this.password = info[4];
        this.gender = info[5];
        this.membershipType = info[6];

    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   
    public String getDateOfBirth() {
        return dateOfBirth;
    }

   
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    
    public String getEmail() {
        return email;
    }

    
    public void setEmail(String email) {
        this.email = email;
    }

    
    public String getPhoneNumber() {
        return phoneNumber;
    }

    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

   
    public String getPassword() {
        return password;
    }

    
    public void setPassword(String password) {
        this.password = password;
    }

    
    public String getGender() {
        return gender;
    }

  
    public void setGender(String gender) {
        this.gender = gender;
    }

   
    public String getMembershipType() {
        return membershipType;
    }

   
    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    public void setBalance (String balance) {

        this.balance = balance;
    }

    public String getBalance () {

        return this.balance;
    }

}