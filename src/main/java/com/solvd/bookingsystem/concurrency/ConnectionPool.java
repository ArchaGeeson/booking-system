package com.solvd.bookingsystem.concurrency;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.*;
import java.util.concurrent.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConnectionPool {
	private static ConnectionPool pooliInstance;
	private List<Connection> connections = new CopyOnWriteArrayList<>();
	private static Logger log = LogManager.getLogger(ConnectionPool.class.getName());
	private static String url = "52.59.193.212:3306";
	private static String userName = "root";
	private static String password = "devintern";

	private ConnectionPool() {
		for (int i = 0; i < 3; i++) {
			Connection connection = null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				connection = DriverManager.getConnection(url, userName, password);
				connections.add(connection);
			} catch (Exception e) {
				log.error(e);
			}
		}
	}

	public static ConnectionPool getPoolInstance() {
		if (pooliInstance == null) {

			synchronized (ConnectionPool.class) {
				if (pooliInstance == null) {
					pooliInstance = new ConnectionPool();
				}
			}
		}
		return pooliInstance;
	}

	public synchronized Connection getConnection() {
		Connection connection = null;

		if (isConnectionAailable()) {
			log.info("pool size= " + connections.size());
			connection = connections.get(0);
			connections.remove(0);
			log.info("pool size after = " + connections.size());
		}

		return connection;
	}

	public synchronized void releaseConnection(Connection connection) {
		connections.add(connection);
	}

	private boolean isConnectionAailable() {
		if (connections.isEmpty()) {
			try {
				log.info("connection is empty");
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				log.error(e);
			}
			isConnectionAailable();
		}
		return true;
	}
}
