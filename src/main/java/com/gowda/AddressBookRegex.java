package com.gowda;

import java.util.regex.Pattern;

public class AddressBookRegex {

    public static Pattern nameRegex = Pattern.compile("^[A-Z][a-zA-Z]{2,}");
    public static Pattern emailRegex = Pattern.compile("^(?=.{1,64})[A-Za-z0-9_-]+(\\\\.[A-Za-z0-9_-]+)*@*[^-][A-Za-z0-9-]+[^-][a-z]{2}[^-][a-z]{2,}$");
    public static Pattern phoneRegex = Pattern.compile("^(?:.{12})[0-9]$");
    public static Pattern zipRegex = Pattern.compile("^[1-9]{1}[0-9]{5}$");

    public boolean validateNames(String name){

        boolean isvalid = nameRegex.matcher(name).matches();
        if (isvalid){
            System.out.println(name+" is valid");
        }
        else {
            System.out.println(name + " is not valid");
        }
        return isvalid;
    }

    public boolean validateZipCode(String zipCode){
        boolean isValid = zipRegex.matcher(zipCode).matches();
        if (isValid){
            System.out.println(zipCode+" is valid ");
        }
        else {
            System.out.println(zipCode+" is not valid");
        }
        return isValid;
    }
    public boolean validatePhoneNo(String phone){
        boolean isValid = phoneRegex.matcher(phone).matches();
        if (isValid){
            System.out.println(phone+" is valid");
        }
        else {
            System.out.println(phone+" is not valid");
        }
        return isValid;
    }
    public boolean validateEmail(String email){
        boolean isValid = emailRegex.matcher(email).matches();
        if (isValid){
            System.out.println(email+ " is valid ");
        }
        else {
            System.out.println(email+ " is not valid");
        }
        return isValid;
    }
}