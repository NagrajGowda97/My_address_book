package com.gowda;

import java.util.ArrayList;

import java.util.HashMap;

import java.util.Scanner;

public class ContactFunc {
    public static HashMap<String, ArrayList> addressBookList  = new HashMap<String, ArrayList>();
    static ArrayList<ContactDetails> currentAddressBook;
    static String addressBookName;
    static String currentAddressBookName;
    static Scanner sc = new Scanner(System.in);

    public void addContact(){

        System.out.println("Enter First Name");
        String firstName = sc.next();
        System.out.println("Enter Middle Name");
        String middleName = sc.next();
        System.out.println("Enter Last Name");
        String lastName = sc.next();
        //this for loop will check weather entered contact have any duplicate or not.
        //if any duplicate is present then it will not continue further to save contact, if no duplicate is present it save contact.
        for (ContactDetails contact : currentAddressBook) {
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
            currentAddressBook.add(contact);

        }
        public void deleteContact() {

            System.out.println("Enter First Name");
            String firstName = sc.next();
            System.out.println("Enter Middle Name");
            String middleName = sc.next();
            System.out.println("Enter Last Name");
            String lastName = sc.next();
            for (ContactDetails contact : currentAddressBook) {
                if (contact.getFirstName().equalsIgnoreCase(firstName) && contact.getMiddleName().equalsIgnoreCase(middleName) && contact.getLastName().equalsIgnoreCase(lastName)) {
                    currentAddressBook.remove(contact);
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

            for (ContactDetails contact : currentAddressBook) {

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

                    currentAddressBook.add(contact);
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

                currentAddressBook.add(contact);
            }
        }
        public void viewCity(String city){
            System.out.println("Search result: ");
            for (String addressBookName : addressBookList.keySet()) {
                for (Object p : addressBookList.get(addressBookName)) {
                    ContactDetails person = (ContactDetails) p;
                    if (person.getCity().equalsIgnoreCase(city)) {
                        System.out.println(currentAddressBook);
                    }
                }
            }
        }
        public void viewState(String state){
            System.out.println("Search result: ");
            for (String addressBookName : addressBookList.keySet()){
                for (Object p : addressBookList.get(addressBookName)) {
                    ContactDetails person = (ContactDetails) p;
                    if (person.getCity().equalsIgnoreCase(state)) {
                        System.out.println(currentAddressBook);
                    }
                }
            }
        }

        public void viewZipCode(int zipCode){
            System.out.println("Search result: ");
            for (String addressBookName : addressBookList.keySet()) {
                for (Object p : addressBookList.get(addressBookName)) {
                    ContactDetails person = (ContactDetails) p;
                    if (person.getZipCode() == zipCode) {
                        System.out.println(currentAddressBook);
                    }
                }
            }
        }
        public void viewContactBy(){
            System.out.println("""
                    Press 1 to view Contact by city
                    Press 2 to view Contact by state
                    Press 3 to view Contact by zip code""");
            int num = sc.nextInt();
            switch (num){
                case 1:
                    System.out.println("Enter city name: ");
                    viewCity(sc.next());
                    break;
                case 2:
                    System.out.println("Enter state name: ");
                    viewState(sc.next());
                    break;
                case 3:
                    System.out.println("Enter zip code: ");
                    viewZipCode(sc.nextInt());
                    break;
                default:
                    viewContactBy();
            }
        }
    void showContacts(ArrayList addressBook) {
        System.out.println("Contacts: ");
        for (Object p : addressBook) {
            ContactDetails person = (ContactDetails) p;
            System.out.println(person);
        }
    }
    public void chooseAddressBook() {
        System.out.println("""
        Press 1 to add AddressBook
        Press 2 to select AddressBook""");

        int option = sc.nextInt();
        switch (option) {
            case 1:
                System.out.println("Enter name for AddressBook");
                String AddressBookName = sc.next();
                ArrayList<ContactDetails> AddressBook = new ArrayList();
                addressBookList.put(AddressBookName, AddressBook);
                System.out.println("new AddressBook created");
                currentAddressBook = addressBookList.get(AddressBookName);
                currentAddressBookName = AddressBookName;
                break;
            case 2:
                System.out.println(addressBookList.keySet());
                System.out.println("enter name of address book");
                String addressBookName = sc.next();

                for (String key : addressBookList.keySet()) {
                    if (key.equalsIgnoreCase(addressBookName)) {
                        currentAddressBook = addressBookList.get(key);
                        currentAddressBookName = key;
                    }
                }
                System.out.println("current AddressBook is " + currentAddressBookName);

                break;
            default:
                break;
        }
    }

    public void display () {
            System.out.println(currentAddressBook);
        }
}
