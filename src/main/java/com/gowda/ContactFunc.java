package com.gowda;

import java.util.*;

import java.util.stream.Collectors;

public class ContactFunc {
    public static HashMap<String, ArrayList> addressBookList  = new HashMap<String, ArrayList>();
    static ArrayList<ContactDetails> currentAddressBook;
    static String currentAddressBookName;
    static HashMap<String, ContactDetails> cityContactList = new HashMap<>();
    static HashMap<String, ContactDetails> stateContactList = new HashMap<>();
    static HashMap<Integer, ContactDetails> zipContactList = new HashMap<>();
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
        public void searchCity(String city){
            System.out.println("Search result: ");
            for (String addressBookName : addressBookList.keySet()) {
                for (Object p : addressBookList.get(addressBookName)) {
                    ContactDetails person = (ContactDetails) p;
                    if (person.getCity().equalsIgnoreCase(city)) {
                        System.out.println(person);
                    }
                }
            }
        }
        public void searchState(String state){
            System.out.println("Search result: ");
            for (String addressBookName : addressBookList.keySet()){
                for (Object p : addressBookList.get(addressBookName)) {
                    ContactDetails person = (ContactDetails) p;
                    if (person.getCity().equalsIgnoreCase(state)) {
                        System.out.println(person);
                    }
                }
            }
        }

        public void searchZipCode(int zipCode){
            System.out.println("Search result: ");
            for (String addressBookName : addressBookList.keySet()) {
                for (Object p : addressBookList.get(addressBookName)) {
                    ContactDetails person = (ContactDetails) p;
                    if (person.getZipCode() == zipCode) {
                        System.out.println(person);
                    }
                }
            }
        }
        public void searchContactBy(){
            System.out.println("""
                    Press 1 to search Contact by city
                    Press 2 to search Contact by state
                    Press 3 to search Contact by zip code""");
            int num = sc.nextInt();
            switch (num){
                case 1:
                    System.out.println("Enter city name: ");
                    searchCity(sc.next());
                    break;
                case 2:
                    System.out.println("Enter state name: ");
                    searchState(sc.next());
                    break;
                case 3:
                    System.out.println("Enter zip code: ");
                    searchZipCode(sc.nextInt());
                    break;
                default:
                    searchContactBy();
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
    public void viewContacts() {
        System.out.println("""
                Press 1 for View by City 
                Press 2 for View by State 
                Press 3 for View by Zip code""");
        switch (sc.nextInt()) {
            case 1:
                viewContactByCity();
                break;
            case 2:
                viewContactByState();
                break;
            case 3:
                viewContactByZipCode();
                break;
            default:
                viewContacts();
                break;
        }
    }

    public void viewContactByCity() {
        System.out.println("Enter City:");
        String city = sc.next();
        for (String key : cityContactList.keySet()) {
            if (key.equalsIgnoreCase(city)){
                System.out.println(cityContactList.get(city));
            }
        }
    }
    public void viewContactByState() {
        System.out.println("Enter State:");
        String state = sc.next();
        for (String key : stateContactList.keySet()) {
            if (key.equalsIgnoreCase(state)){
                System.out.println(stateContactList.get(state));
            }
        }
    }

    public void viewContactByZipCode(){
        System.out.println("Enter Zip Code");
        int zipCode = sc.nextInt();
        for (int key : zipContactList.keySet()) {
            if (key == zipCode){
                System.out.println(zipContactList.get(zipCode));
            }
        }
    }
    public void sortContacts(){
        List<ContactDetails> allContacts = getAllContacts();
        List<ContactDetails> sortedContacts;
        System.out.println("""
                Press 1 to sort by name
                Press 2 to sort by city
                Press 3 to sort by state
                Press 4 to sort by zip code
                Press 5 to go back""");
        switch (sc.nextInt()){
            case 1:
                sortedContacts = allContacts.stream().sorted(Comparator.comparing(ContactDetails::getFirstName)).collect(Collectors.toList());
                sortedContacts.forEach(System.out::println);
                break;
            case 2:
                sortedContacts = allContacts.stream().sorted(Comparator.comparing(ContactDetails::getCity)).collect(Collectors.toList());
                sortedContacts.forEach(System.out::println);
                break;
            case 3:
                sortedContacts = allContacts.stream().sorted(Comparator.comparing(ContactDetails::getState)).collect(Collectors.toList());
                sortedContacts.forEach(System.out::println);
                break;
            case 4:
                sortedContacts = allContacts.stream().sorted(Comparator.comparing(ContactDetails::getZipCode)).collect(Collectors.toList());
                sortedContacts.forEach(System.out::println);
                break;
            case 5:
                break;
            default:
                sortContacts();
                break;
        }
    }

     List<ContactDetails> getAllContacts() {
        List<ContactDetails> allContacts = new ArrayList<>();
        for (String key: addressBookList.keySet()){
            allContacts.addAll(addressBookList.get(key));
        }
        return allContacts;
    }

    public void display () {
            System.out.println(currentAddressBook);
        }
}
