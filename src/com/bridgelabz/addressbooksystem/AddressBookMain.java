package com.bridgelabz.addressbooksystem;

public class AddressBookMain {
	
	private final String firstName;
	private final String lastName;
	private final String address;
	private final String city;
	private final String state;
	private final String email;
	private final String zip;
	private final String phone;

	public AddressBookMain(String firstName, String lastName, String address, String city, String state, String email,
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Address Book Program");
		AddressBookMain addressBookMain = new AddressBookMain("Aman", "Raj", "New Area", "Dehri on sone",
				"Bihar", "aman@gmail.com", "821305", "9988776655" );
		System.out.println(addressBookMain);
		

	}

	@Override
	public String toString() {
		return "[firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city="
				+ city + ", state=" + state + ", email=" + email + ", zip=" + zip + ", phone=" + phone + "]";
	}

}
