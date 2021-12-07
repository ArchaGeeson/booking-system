package com.solvd.bookingsystem.bean.theatre;

import java.util.Date;
import java.util.List;

import com.solvd.bookingsystem.bean.Ticket;

public class Show<T>{
	private Date showStartTime;
	private Date showEndTime;
	private String showId;
	private Ticket ticketNumber;
	private Screen showPlayedAt;
	private T entertainment;
	private List<T> entertainments;
	
	

	public Show() {

	}

	public Show(T entertainment, Date showStartTime) {
		this.entertainment = entertainment;
		this.showStartTime = showStartTime;
		
	}

	
	public Show(String showId, T entertainment, Screen screen, Date showStartTime2) {
		this.showId = showId;
		this.entertainment = entertainment;
		this.showPlayedAt = screen;
		this.showStartTime = showStartTime;
	}

	public Date getShowStartTime() {
		return showStartTime;
	}

	public void setShowStartTime(Date showStartTime) {
		this.showStartTime = showStartTime;
	}

	public Date getShowEndTime() {
		return showEndTime;
	}

	public void setShowEndTime(Date showEndTime) {
		this.showEndTime = showEndTime;
	}

	public String getShowId() {
		return showId;
	}

	public void setShowId(String showId) {
		this.showId = showId;
	}

	public Ticket getTicketNumber() {
		return ticketNumber;
	}

	public void setTicketNumber(Ticket ticketNumber) {
		this.ticketNumber = ticketNumber;
	}

	public Screen getShowPlayedAt() {
		return showPlayedAt;
	}

	public void setShowPlayedAt(Screen showPlayedAt) {
		this.showPlayedAt = showPlayedAt;
	}

	public T getEntertainment() {
		return entertainment;
	}

	public void setEntertainment(T entertainment) {
		this.entertainment = entertainment;
	}

	public List<T> getEntertainments() {
		return entertainments;
	}

	public void setEntertainments(List<T> entertainments) {
		this.entertainments = entertainments;
	}

	
	

}
