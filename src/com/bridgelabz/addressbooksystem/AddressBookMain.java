package com.bridgelabz.addressbooksystem;

public class AddressBookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Address Book Program");
		ContactsOperations contactsOperations = new ContactsOperations();
		Contacts contacts1 = new Contacts("Aman", "Raj", "NewArea", "Dehri on sone",
				"Bihar", "aman@gmail.com", "821305", "9988776655" );
		contactsOperations.addContact(contacts1);
		System.out.println(contactsOperations.getList());
		contactsOperations.addNewContact();
		System.out.println(contactsOperations.getList());
		contactsOperations.removeContactByName();
		System.out.println(contactsOperations.getList());
		contactsOperations.editContact();
		System.out.println(contactsOperations.getList());
	}
}
