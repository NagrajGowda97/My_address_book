package com.gowda;

public class ContactDetails {

    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private int zipCode;
    private long phNumber;
    private String mailId;
    public ContactDetails(String firstName, String middleName, String lastName, String address, String city, String state, int zipCode, long phNumber, String mailId) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phNumber = phNumber;
        this.mailId = mailId;
    }
    public ContactDetails() {
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public int getZipCode() {
        return zipCode;
    }
    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
    public long getPhNumber(long l) {
        return phNumber;
    }
    public void setPhNumber(long nextLong) {
        this.phNumber = nextLong;
    }
    public String getMailId() {
        return mailId;
    }
    public void setMailId(String mailId) {
        this.mailId = mailId;
    }
    @Override
    public String toString() {
        return "ContactDetails{" +
                ",first name = '"+firstName+'\''+
                ",middle name = '"+middleName+'\'' +
                ",last name = '"+lastName+'\'' +
                ", address = '" + address + '\'' +
                ", city = '" + city + '\'' +
                ", state = '" + state + '\'' +
                ", zipCode = " + zipCode +
                ", phNumber = " + phNumber +
                ", mailId = '" + mailId + '\'' +
                '}';
    }



}

