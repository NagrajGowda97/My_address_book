package com.gowda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactFunc {
    static List<ContactDetails> details = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public  void addContact(){

        ContactDetails contact = new ContactDetails();
        System.out.println("Enter First Name");
        contact.setFirstName(sc.next());
        System.out.println("Enter Middle Name");
        contact.setMiddleName(sc.next());
        System.out.println("Enter Last Name");
        contact.setLastName(sc.next());
        System.out.println("Address");
        contact.setAddress(sc.next());
        System.out.println("City");
        contact.setCity(sc.next());
        System.out.println("State");
        contact.setState(sc.next());
        System.out.println("Zip code");
        contact.setZipCode(sc.nextInt());
        System.out.println("Phone Number");
        contact.setPhNumber(sc.nextLong());
        System.out.println("Email address");
        contact.setMailId(sc.next());

        details.add(contact);
    }
    public void deleteContact(){
        System.out.println("Enter First Name");
        String firstName = sc.next();
        System.out.println("Enter Middle Name");
        String middleName = sc.next();
        System.out.println("Enter Last Name");
        String lastName = sc.next();

       // ContactDetails contact = new ContactDetails();
        for (ContactDetails contact: details) {
            if (contact.getFirstName().equalsIgnoreCase(firstName) && contact.getMiddleName().equalsIgnoreCase(middleName) && contact.getLastName().equalsIgnoreCase(lastName)){
                details.remove(contact);
            }
            else {
                System.out.println("Contact not found");
            }

        }
    }

    public void display(){
        System.out.println(details);
    }

}
