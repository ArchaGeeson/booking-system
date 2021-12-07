package com.solvd.bookingsystem.bean;

import com.solvd.bookingsystem.bean.profiles.User;

public class Payment {
	private String trasactionId;
	private User user;
	private String paymentMethod;

	public Payment() {
	}

	public String getTrasactionId() {
		return trasactionId;
	}

	public void setTrasactionId(String trasactionId) {
		this.trasactionId = trasactionId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
}
