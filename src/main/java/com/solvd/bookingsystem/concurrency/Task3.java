package com.solvd.bookingsystem.concurrency;

import java.sql.Connection;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Task3 {

	private static Logger log = LogManager.getLogger(Task3.class.getName());
	public static void main(String[] args) {
		Task3 task1=new Task3();
		Task3 task2=new Task3();
		Task3 task3=new Task3();
		Task3 task4=new Task3();
		
		ExecutorService service = Executors.newCachedThreadPool();
		try {
			Future f1=service.submit(()->task1.getConnection());
			System.out.println("thread 1");
			Future f2=service.submit(()->task2.getConnection());
			System.out.println("thread 2");
			Future f3=service.submit(()->task3.getConnection());
			System.out.println("thread 3");
			Future f4=service.submit(()->task4.getConnection());
			System.out.println("thread 4");
			f1.get();
			f2.get();
			f3.get();
			f4.get();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			log.error(e);
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			log.error(e);
		}
		
		
		
	}

	
	

	private void getConnection() {
		ConnectionPool connectionPool=ConnectionPool.getPoolInstance();
		Connection connection=connectionPool.getConnection();
		/*
		 * try { Thread.sleep(1000000000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		connectionPool.releaseConnection(connection);
	}
}
