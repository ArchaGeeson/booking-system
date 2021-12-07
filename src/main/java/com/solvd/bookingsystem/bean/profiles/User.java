package com.solvd.bookingsystem.bean.profiles;

import com.solvd.bookingsystem.bean.Address;

public abstract class User {
	private int id;
	private String firstName;
	private String lastName;
	private Address address;

	public User() {

	}

	public User(String name, int id) {
		this.firstName = name;
		this.id= id;
		
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}