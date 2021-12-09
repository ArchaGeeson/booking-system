package com.solvd.bookingsystem.functionalInterfaces;

import com.solvd.bookingsystem.bean.profiles.User;
import com.solvd.bookingsystem.bean.theatre.Show;

@FunctionalInterface
public interface IBooking {
	void book(User userId, Show showId);

}
