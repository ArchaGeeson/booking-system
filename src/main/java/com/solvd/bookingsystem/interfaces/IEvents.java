package com.solvd.bookingsystem.interfaces;

import java.util.List;

public interface IEvents<T> {
	void create(T t);
	void update(T t);
	void delete(T t);
	List<T> getAllEvents();
}
