package com.solvd.bookingsystem.enums;

public enum UserStatus {
	ACTIVE("Active"), BLOCKED("Blocked"), DEACTIVATED("Deactivated"), DELETED("Deleted");

	private String userStatus;

	private UserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	public String getUserStatus(String userStatus) {
		return userStatus;
	}
}
