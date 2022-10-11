package com.gowda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactFunc {
    static List<ContactDetails> details = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public void addContact() {

        System.out.println("Enter First Name");
        String firstName = sc.next();
        System.out.println("Enter Middle Name");
        String middleName = sc.next();
        System.out.println("Enter Last Name");
        String lastName = sc.next();


        //this for loop will check weather entered contact have any duplicate or not.
        //if any duplicate is present then it will not continue further to save contact, if no duplicate is present it save contact.
        for (ContactDetails contact : details) {
            if (contact.getFirstName().equalsIgnoreCase(firstName) && contact.getMiddleName().equalsIgnoreCase(middleName) && contact.getLastName().equalsIgnoreCase(lastName)) {
                System.out.println("Contact is already exist ");
                return;
            }
        }
            ContactDetails contact = new ContactDetails();
            contact.setFirstName(firstName);
            contact.setMiddleName(middleName);
            contact.setLastName(lastName);
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
        public void deleteContact() {

            System.out.println("Enter First Name");
            String firstName = sc.next();
            System.out.println("Enter Middle Name");
            String middleName = sc.next();
            System.out.println("Enter Last Name");
            String lastName = sc.next();

            for (ContactDetails contact : details) {
                if (contact.getFirstName().equalsIgnoreCase(firstName) && contact.getMiddleName().equalsIgnoreCase(middleName) && contact.getLastName().equalsIgnoreCase(lastName)) {
                    details.remove(contact);
                } else {
                    System.out.println("Contact not found");
                }
            }
        }
        public void editContact () {

            System.out.println("Enter First Name");
            String firstName = sc.next();
            System.out.println("Enter Middle Name");
            String middleName = sc.next();
            System.out.println("Enter Last Name");
            String lastName = sc.next();

            for (ContactDetails contact : details) {

                if (contact.getFirstName().equalsIgnoreCase(firstName) && contact.getMiddleName().equalsIgnoreCase(middleName) && contact.getLastName().equalsIgnoreCase(lastName)) {
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
                } else {
                    System.out.println("Contact not found");
                }
            }
        }
        public void multipleContact(){
            System.out.println("Enter number of contact to add in contact list");
            int num = sc.nextInt();
            for (int i=0;i<num;i++){
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
        }
        public void viewCity(){
            System.out.println("Enter city to view contact");
            String city = sc.next();
            for (ContactDetails contact : details) {
                if (contact.getCity().toLowerCase().contains(city)){
                    System.out.println(details);
                }
                System.out.println("No contact found in this city");
            }
        }
        public void viewState(){
            System.out.println("Enter city to view contact");
            String state = sc.next();
            for (ContactDetails contact : details) {
                if (contact.getCity().toLowerCase().contains(state)){
                    System.out.println(details);
                }
                System.out.println("No contact found in this state");
            }
        }
        public void viewZipCode(){
            System.out.println("Enter city to view contact");
            int zipCode = sc.nextInt();
            for (ContactDetails contact : details) {
                if (zipCode == contact.getZipCode()){
                    System.out.println(details);
                }
                System.out.println("No contact found in this zipcode");
            }
        }
        public void viewContactBy(){

            System.out.println("""
                    Press 1 to view Contact by city
                    Press 2 to view Contact by state
                    Press 3 to view Contact by zip code""");
            int num = sc.nextInt();
            switch (num){
                case 1:viewCity();
                    break;
                case 2:viewState();
                    break;
                case 3:viewZipCode();
                    break;
            }

        }
        public void display () {
            System.out.println(details);
        }

}
