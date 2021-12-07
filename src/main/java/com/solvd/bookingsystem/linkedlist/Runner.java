package com.solvd.bookingsystem.linkedlist;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Runner {

	private static Logger log = LogManager.getLogger(Runner.class.getName());

	public static void main(String[] args) {

		LinkedListClass<Integer> list = new LinkedListClass<>();

		list.addData(10);
		list.addData(20);
		list.addAtAny(2, 40);
		list.addData(10);
		list.printList();
		log.info("Size of the list: " + list.size());

		LinkedListClass<String> listString = new LinkedListClass<>();

		listString.addData("Jim");
		listString.addData("Rose");
		listString.addAtFirst("Kim");
		listString.addAtAny(2, "John");
		listString.printList();
		log.info("Size of the list: " + listString.size());
	}

}
