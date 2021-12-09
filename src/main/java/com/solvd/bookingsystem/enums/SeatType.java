package com.solvd.bookingsystem.enums;

public enum SeatType {
	MEZZANINE("Mezzanine"), ORCHESTRA("Orchestra"), BALCONY("Balcony");

	private String seatType;

	private SeatType(String seatType) {
		this.seatType = seatType;
	}

	public String getSeatType() {
		return seatType;
	}

}
