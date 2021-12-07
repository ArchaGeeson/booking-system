package com.solvd.bookingsystem.interfaces;

import com.solvd.bookingsystem.bean.theatre.Screen;
import com.solvd.bookingsystem.bean.theatre.Seat;
import com.solvd.bookingsystem.bean.theatre.Theatre;

public interface ITheatre {
	Theatre createTheater(Theatre theatre);

	Screen createScreen(String screenName, Theatre theatre);

	Seat createSeat(Screen screen);

}
