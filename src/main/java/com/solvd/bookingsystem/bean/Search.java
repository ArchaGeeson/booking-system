package com.solvd.bookingsystem.bean;

public class Search {
	private String searchFilterType;
	private String searchByTitle;
	
	public Search() {
		
	}

	public String getSearchFilterType() {
		return searchFilterType;
	}

	public void setSearchFilterType(String searchFilterType) {
		this.searchFilterType = searchFilterType;
	}

	public String getSearchByTitle() {
		return searchByTitle;
	}

	public void setSearchByTitle(String searchByTitle) {
		this.searchByTitle = searchByTitle;
	}

}
