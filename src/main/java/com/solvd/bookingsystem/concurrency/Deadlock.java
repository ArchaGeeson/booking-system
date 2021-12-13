package com.solvd.bookingsystem.concurrency;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Deadlock {
	private static Logger log = LogManager.getLogger(Deadlock.class.getName());

	public static void main(String[] args) {
		String resource1 = "Resource 1";
		String resource2 = "Resource 2";

		Thread thread1 = new Thread() {
			public void run() {
				synchronized (resource1) {
					log.info("Thread 1 locked resource 1");
					try {
						Thread.sleep(10);
					} catch (Exception e) {
						log.info("Thread 1 waiting for resource 2");
					}
					synchronized (resource2) {
						log.info("Thread 1 locked resource 2");
					}
				}
			}

		};

		Thread thread2 = new Thread() {
			public void run() {
				synchronized (resource2) {
					log.info("Thread 2 locked resource 2");
					try {
						Thread.sleep(10);
					} catch (Exception e) {
						log.info("Thread 2 waiting for resource 1");
					}
					synchronized (resource1) {
						log.info("Thread 2 locked resource 1");
					}

				}
			}

		};
		
		thread1.start();
		thread2.start();
	}

}
