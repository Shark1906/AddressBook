package com.bridgelabz.addressbooksystem;

public class Contacts {
	
	private final String firstName;
	private final String lastName;
	private final String address;
	private final String city;
	private final String state;
	private final String email;
	private final String zip;
	private final String phone;
	
	public Contacts(String firstName, String lastName, String address, String city, String state, String email,
			String zip, String phone) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.email = email;
		this.zip = zip;
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "[FirstName=" + firstName + ", LastName=" + lastName + ", Address=" + address + ", City="
				+ city + ", State=" + state + ", Email=" + email + ", Zip=" + zip + ", Phone=" + phone + "]";
	}

}
