package com.gowda;

import java.util.Scanner;

public class AddressBookApp {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        ContactFunc func = new ContactFunc();

        System.out.println("Press 1 to add contact");
        System.out.println("Press 2 to delete contact");
        System.out.println("Press 3 to edit contact");
        int num = sc.nextInt();

        switch (num){
            case 1:func.addContact();
                break;
            case 2:func.deleteContact();
                break;
            case 3:func.editContact();
                break;

            default:
        }

        func.display();
    }
}
