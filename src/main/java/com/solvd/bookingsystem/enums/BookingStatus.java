package com.solvd.bookingsystem.enums;

public enum BookingStatus {
	// constant specific methods--> more type safety than switch block
	CREATED {
		public boolean isBookingComplete() {
			return false;
		}
	},
	CONFIRMED {
		public boolean isBookingComplete() {
			return true;
		}
	},
	EXPIRED {
		public boolean isBookingComplete() {
			return false;
		}
	};

	public abstract boolean isBookingComplete();

}
