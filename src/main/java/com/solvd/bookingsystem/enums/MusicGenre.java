package com.solvd.bookingsystem.enums;

public enum MusicGenre {
	ROCK("Rock"), POPMUSIC("Pop Music"), JAZZ("Jazz"), CLASSICAL("Classical");

	private String musicGenre;

	private MusicGenre(String musicGenre) {
		this.musicGenre = musicGenre;
	}

	public String getMusicGenre(String musicGenre) {
		return musicGenre;
	}

}
