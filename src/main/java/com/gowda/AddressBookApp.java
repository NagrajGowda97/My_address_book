package com.gowda;

import java.util.Scanner;

public class AddressBookApp {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        boolean exit = false;

        while (!exit) {
            ContactFunc func = new ContactFunc();
            System.out.println("""
                     Press 1 to add contact
                     Press 2 to delete contact
                     Press 3 to edit contact
                     Press 4 to add multiple contact
                     press 5 to search contact by city, state or zip code
                     press 6 to exit""");
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
                    func.viewContactBy();
                    break;
                case 6:
                    exit = true;
                    break;
                default:
            }
            func.display();
        }
    }
}
