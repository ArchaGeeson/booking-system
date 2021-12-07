package com.solvd.bookingsystem.bean;

public class Ticket {
	private int ticketId;
	private int price;
	private static int availableTickets;
	
	public Ticket() {
		
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getAvailableTickets() {
		return availableTickets;
	}

	public void setAvailableTickets(int availableTickets) {
		Ticket.availableTickets = availableTickets;
		
	}
	
	

}
