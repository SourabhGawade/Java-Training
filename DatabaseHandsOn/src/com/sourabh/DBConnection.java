package com.sourabh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static Connection connection;

	public DBConnection(String serverAddress, String database, String user, String pass)
			throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://" + serverAddress + ":3306/" + database;
		connection = DriverManager.getConnection(url, user, pass);
	}

	public static Connection getConnection() {
		return connection;
	}
}
