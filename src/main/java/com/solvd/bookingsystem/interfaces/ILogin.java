package com.solvd.bookingsystem.interfaces;

import com.solvd.bookingsystem.bean.Login;
import com.solvd.bookingsystem.exceptions.ValidationException;


public interface ILogin {

	void login(Login login) throws ValidationException;

}
