package com.solvd.bookingsystem.bean;

import java.util.Date;
import java.util.List;

import com.solvd.bookingsystem.bean.profiles.User;
import com.solvd.bookingsystem.bean.theatre.Movie;
import com.solvd.bookingsystem.bean.theatre.Seat;
import com.solvd.bookingsystem.bean.theatre.Show;

public class Booking {

	private Date bookingDate;
	private List<Ticket> ticketNumbers;
	private User customerId;
	private int bookingId;

	public Booking() {
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public List<Ticket> getTicketNumbers() {
		return ticketNumbers;
	}

	public void setTicketNumbers(List<Ticket> ticketNumbers) {
		this.ticketNumbers = ticketNumbers;
	}

	public User getCustomerId() {
		return customerId;
	}

	public void setCustomerId(User customerId) {
		this.customerId = customerId;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

}
