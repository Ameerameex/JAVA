package com.example.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main {

	public static void main(String[] args) throws Exception {

		final String SQL = "SELECT count(*) FROM product";
		Connection connection = null;

		PreparedStatement statement = null;
		// step 1
		Class.forName("com.mysql.jdbc.Driver");
		// step 2
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/salesDB", "root", "root");
		// step 3
		statement = connection.prepareStatement(SQL);

		

		

		// step 4
		ResultSet r = statement.executeQuery();
		if (r.next()) {
			System.out.print("Count : ");
			System.out.println(r.getInt(1));
		}
		
		// step 5
		statement.close();
		r.close();

		connection.close();
		
	}

}
