package com.solvd.bookingsystem.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.bookingsystem.bean.Payment;
import com.solvd.bookingsystem.exceptions.PaymentFailedException;

public class PaymentService {
	private static Logger log = LogManager.getLogger(ShowService.class.getName());

	public String makePayment(Payment payment) throws PaymentFailedException {
		Payment pay = new Payment();
		log.info("Select a payment type...");

		if ("Paypal".equalsIgnoreCase(payment.getPaymentMethod())) {
			
			log.info("Provide login details for Paypal account....");
			
			} else if ("Cash".equalsIgnoreCase(payment.getPaymentMethod())) {
				
			log.info("Please pay at the counter...");
			} else if ("Credit".equalsIgnoreCase(payment.getPaymentMethod())) {
				
			log.info("Provide card details...");	
			
			log.info("Payment confirmed");
			pay.setTrasactionId("T1234");
			
			log.info("Transaction Id: " + pay.getTrasactionId());
			}

		
		return payment.getTrasactionId();
		}

}
