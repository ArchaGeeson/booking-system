package com.solvd.bookingsystem.enums;

public enum MovieGenre {
	HORROR(12), COMEDY(10), DRAMA(10), ACTION(10);

	private MovieGenre(int minAgeToWatch) {
		this.minAgeToWatch = minAgeToWatch;
	}

	private int minAgeToWatch;

	public int getMinAgeToWatch() {
		return minAgeToWatch;
	}

}
