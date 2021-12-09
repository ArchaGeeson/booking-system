package com.solvd.bookingsystem.enums;

public enum PaymentStatus {
	SUCCESS, FAILURE, PENDING, BLOCKED;

	// using switch block
	public boolean isPaymentComplete() {
		switch (this) {
		case SUCCESS:
			return true;
		case FAILURE:
			return false;
		case PENDING:
			return false;
		case BLOCKED:
			return false;
		default:
			return true;
		}
	}
}
