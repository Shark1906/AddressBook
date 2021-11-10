package com.bridgelabz.addressbooksystem;

import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Address Book Program");
		ContactsOperations contactsOperations = new ContactsOperations();
		Contacts contacts1 = new Contacts("Aman", "Raj", "NewArea", "Dehri on sone",
				"Bihar", "aman@gmail.com", "821305", "9988776655" );
		contactsOperations.addContact(contacts1);
		System.out.println(contactsOperations.getList());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Firstname");
		String firstName = sc.nextLine();
		System.out.println("Enter Lastname");
		String lastName = sc.nextLine();
		System.out.println("Enter Address");
		String address = sc.nextLine();
		System.out.println("Enter City");
		String city = sc.nextLine();
		System.out.println("Enter State");
		String state = sc.nextLine();
		System.out.println("Enter Email");
		String email = sc.nextLine();
		System.out.println("Enter Zip");
		String zip = sc.nextLine();
		System.out.println("Enter Phone");
		String phone = sc.nextLine();
	
		Contacts contacts2 = new Contacts(firstName, lastName, address, city, state, email, zip, phone);
		contactsOperations.addContact(contacts2);
		System.out.println(contactsOperations.getList());
		System.out.println("Enter Firstname of Contact to delete");
		String deleteContact = sc.nextLine();
		contactsOperations.removeContactByName(deleteContact);
		System.out.println(contactsOperations.getList());
		
		sc.close();
	}

	

}
