package com.solvd.bookingsystem.bean;

public class State {
	private String stateName;
	private Country country;

	public State() {

	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

}
