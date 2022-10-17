package com.gowda;

import java.util.Scanner;

public class AddressBookApp {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)  {
        ContactFunc func = new ContactFunc();
        func.chooseAddressBook();
        boolean exit = false;

        while (!exit) {
            System.out.println("""
                     Press 1 to add contact
                     Press 2 to delete contact
                     Press 3 to edit contact
                     Press 4 to add multiple contact
                     press 5 to search contact by city, state or zip code
                     Press 6 to add new address book or to search address book
                     Press 7 to Show contact
                     Press 8 to view by city, state or zip code
                     press 9 to exit""");
            int num = sc.nextInt();

            switch (num) {
                case 1:
                    func.addContact();
                    break;
                case 2:
                    func.deleteContact();
                    break;
                case 3:
                    func.editContact();
                    break;
                case 4:
                    func.multipleContact();
                    break;
                case 5:
                    func.searchContactBy();
                    break;
                case 6:
                    func.chooseAddressBook();
                    break;
                case 7:
                    func.showContacts(ContactFunc.currentAddressBook);
                    break;
                case 8:
                    func.viewContacts();
                    break;
                case 9:
                    exit = true;
                    break;
                default:
            }
            func.display();
        }
    }
}
