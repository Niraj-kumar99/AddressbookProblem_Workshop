package addressbook;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {

        // Welcome Message .
        System.out.println("Welcome");

        AddressBookOperations addressBookOperations = new AddressBookOperations();
        addressBookOperations.addContact();
    }
}
