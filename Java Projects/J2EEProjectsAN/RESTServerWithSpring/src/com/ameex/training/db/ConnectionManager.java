package com.ameex.training.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	
	public static  Connection getConnection() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Error : Loading Driver failed");
			System.exit(0);
		}
		String url="jdbc:mysql://localhost:3306/salesdb";
		String userName="root";
		String password="root";
		Connection connection=null;
		try {
			connection = DriverManager.getConnection(url, userName, password);
		} catch (SQLException e) {
			System.out.println("Error : Unable to connect with DB");
			System.exit(0);
		}
		return connection;
	}
	
	public static void closeConnection(Connection connection){
		try {
			connection.close();
		} catch (SQLException e) {
			System.out.println("Error : Unable to close Connection");
		}
		
	}

}
