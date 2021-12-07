package com.solvd.bookingsystem.services;

import com.solvd.bookingsystem.bean.profiles.User;
import com.solvd.bookingsystem.interfaces.IUser;

public class UserService<T extends User> implements IUser<T> {

	@Override
	public void addNewUser(T a) {
		// TODO Auto-generated method stub

	}

	@Override
	public T removeUser() {
		// TODO Auto-generated method stub
		return null;
	}

}
