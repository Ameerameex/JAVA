package com.training.example.ui;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionCreationMain1 {

	public static void main(String[] args) {

		Connection connection = null;
		Driver driver = null;
		try {
			driver = new com.mysql.jdbc.Driver();

		} catch (SQLException e) {

			System.out.println("Error in loading driver class");
			System.exit(0);
		}

		try {
			boolean status = driver.acceptsURL("jdbc:mysql://localhost:3306/salesdb");
			System.out.println(status);
			if (status == true) {
				Properties properties = new Properties();
				properties.put("user", "root");
				properties.put("password", "root");
				connection = driver.connect("jdbc:mysql://localhost:3306/salesdb", properties);
				System.out.println("Connected to DB");
			}
		} catch (SQLException e) {

			System.out.println("unable to connect to DB");
		}

	}

}
