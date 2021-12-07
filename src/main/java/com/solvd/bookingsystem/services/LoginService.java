package com.solvd.bookingsystem.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.bookingsystem.bean.Login;
import com.solvd.bookingsystem.exceptions.ValidationException;
import com.solvd.bookingsystem.interfaces.ILogin;

public class LoginService implements ILogin {
	private static Logger log = LogManager.getLogger(LoginService.class.getName());

	// private boolean isUsernameValid = true;
	// private boolean isPasswordValid = true;
	public void login(Login login) throws ValidationException {
		log.info("Please choose an account type...");

		if ("custom".equalsIgnoreCase(login.getLoginType())) {
			// System.out.println("login using custom info....");
			log.info("login using custom info....");

		} else if ("Google".equalsIgnoreCase(login.getLoginType())) {
			// System.out.println("login using Google account...");
			log.info("login using Google account...");
		} else if ("Facebook".equalsIgnoreCase(login.getLoginType())) {
			// System.out.println("login using Facebook account...");
			log.info("login using Facebook account...");
		} else {
			// System.out.println("Invalid Account Type...");
			log.warn("Invalid Account Type...");
		}

		if ("Tommy".equals(login.getUsername()) && "12345".equals(login.getPassword())) {
			log.info("Login successfully...");
		} else {
			throw new ValidationException("Invalid credentials...Please check your username and password...");
			
		}

		/*
		 * if(isUsernameValid && isPasswordValid) { log.info("Login successfully...");
		 * }else {
		 * log.info("Invalid credentials...Please check your username and password...");
		 * }
		 */

	}

}
