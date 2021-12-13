package com.solvd.bookingsystem.concurrency;

import java.util.*;
import java.util.concurrent.*;

public class ConnectionPool {
	private static ConnectionPool pooliInstance;
	private List<Connection> connections = new CopyOnWriteArrayList<>();

	private ConnectionPool() {
		for (int i = 0; i < 3; i++) {
			connections.add(new Connection());
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
			System.out.println("pool size= "+connections.size());
			connection = connections.get(0);
			connections.remove(0);	
			System.out.println("pool size after = "+connections.size());
		}

		return connection;
	}

	public synchronized void releaseConnection(Connection connection) {
		connections.add(connection);
	}
	private boolean isConnectionAailable() {
		if(connections.isEmpty()) {
			try {
				System.out.println("connection is empty");
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			isConnectionAailable();
		}
		return true;
	}
}
