package com.solvd.bookingsystem.bean.theatre;

import java.util.List;

import com.solvd.bookingsystem.bean.Address;

public class Theatre {

	private int id;
	private String name;
	private Address address;
	private List<Screen> screens;

	public Theatre() {

	}

	public Theatre(List<Screen> screens) {
		this.screens = screens;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Screen> getScreens() {
		return screens;
	}

	public void setScreens(List<Screen> screens) {
		this.screens = screens;
	}

}
