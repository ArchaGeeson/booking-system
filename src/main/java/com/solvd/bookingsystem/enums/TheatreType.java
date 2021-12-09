package com.solvd.bookingsystem.enums;

public enum TheatreType {
	MULTIPLEX("Multiplex"), IMAX("Imax");

	private String theatreType;

	private TheatreType(String theatreType) {
		this.theatreType = theatreType;
	}

	public String getTheatreType(String theatreType) {
		return theatreType;
	}
}
