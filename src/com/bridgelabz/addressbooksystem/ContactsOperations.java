package com.bridgelabz.addressbooksystem;

import java.util.ArrayList;
import java.util.List;

public class ContactsOperations {
private List<Contacts> contactList = new  ArrayList();
	
	public void addContact(Contacts contacts) {
		contactList.add(contacts);
	}
	
	public List getList() {
		return contactList;
	}
}
