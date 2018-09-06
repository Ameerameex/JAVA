package com.ameex.training.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public   class ConnectionManager {

	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			System.out.println("Error :Loading Driver Failed");
			System.exit(0);
		}
		String url="jdbc:mysql://localhost:3306/salesDB";
		String userName="root";
		String passWord="root";
		Connection connection=null;
		try {
			connection = DriverManager.getConnection(url,userName,passWord);
		} catch (SQLException e) {
			System.out.println("Error : Unable to Connect With DB");
			System.exit(0);
		}
		return connection;
	}
	public static void closeConnection(Connection connection){
		try {
			connection.close();
		} catch (SQLException e) {
			
			System.out.println("Error : unable to close connection");
		}
	}
}
