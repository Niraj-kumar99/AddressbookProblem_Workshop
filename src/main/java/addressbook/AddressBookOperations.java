package addressbook;

import java.util.Scanner;

public class AddressBookOperations {

    Scanner sc = new Scanner(System.in);


    // Method to add contact .
    public void addContact() {

        Contact_info contact_info = new Contact_info();
        System.out.println("Enter First Name : ");
        contact_info.setFirstName(sc.nextLine());

        System.out.println("Enter Last Name : ");
        contact_info.setLastName(sc.nextLine());

        System.out.println("Enter Address : ");
        contact_info.setAddress(sc.nextLine());

        System.out.println("Enter City : ");
        contact_info.setCity(sc.nextLine());

        System.out.println("Enter State : ");
        contact_info.setState(sc.nextLine());

        System.out.println("Enter Zip : ");
        contact_info.setPinCode(sc.nextLine());

        System.out.println("Enter Phone : ");
        contact_info.setPhoneNumber(sc.nextLine());

        System.out.println("Enter Email : ");
        contact_info.setPhoneNumber(sc.nextLine());

        sc.close();
    }
}
