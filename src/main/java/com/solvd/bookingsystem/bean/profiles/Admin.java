package com.solvd.bookingsystem.bean.profiles;

public class Admin extends User {

	public Admin() {

	}

	public Admin(String name, int id) {
		super(name, id);
	}

	@Override
	public String toString() {
		return "Admin [getId()=" + getId() + ", getAddress()=" + getAddress() + ", getFirstName()=" + getFirstName()
				+ ", getLastName()=" + getLastName() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}