package com.solvd.bookingsystem.bean.theatre;

import java.util.Date;

public class Concert {
	private String artist;
	private String title;
	private String duration;
	private Date showDate;
	
	@Override
	public String toString() {
		return "Concert [artist=" + artist + ", title=" + title + ", duration=" + duration + ", showDate=" + showDate
				+ "]";
	}

	public Concert() {
		
	}

	public Concert(String artist, String title) {
		super();
		this.artist = artist;
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public Date getShowDate() {
		return showDate;
	}

	public void setShowDate(Date showDate) {
		this.showDate = showDate;
	}

	
}
