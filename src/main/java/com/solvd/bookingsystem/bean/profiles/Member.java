package com.solvd.bookingsystem.bean.profiles;

import java.util.ArrayList;
import java.util.List;

import com.solvd.bookingsystem.bean.Ticket;

public class Member extends User {

	public List<Ticket> bookingHistory;

	public Member() {

	}

	public Member(String name, int id) {
		super(name, id);
		this.bookingHistory = new ArrayList<>();
	}

	@Override
	public String toString() {
		return "Member [getId()=" + getId() + ", getAddress()=" + getAddress() + ", getFirstName()=" + getFirstName()
				+ ", getLastName()=" + getLastName() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	
}
