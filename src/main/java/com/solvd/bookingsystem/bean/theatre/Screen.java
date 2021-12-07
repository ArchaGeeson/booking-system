package com.solvd.bookingsystem.bean.theatre;

import java.util.List;

public class Screen {

	private String name;
	private int id;
	private List<Show> shows;

	public Screen() {

	}

	public Screen(String name, int id, List<Show> shows) {
		this.name = name;
		this.id = id;
		this.shows = shows;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Show> getShows() {
		return shows;
	}

	public void setShows(List<Show> shows) {
		this.shows = shows;
	}

	void display() {

	}

}
