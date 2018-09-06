package com.example.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SearchClient {
	public static void main(String[] args) throws Exception {
		final String SQL = "SELECT * FROM product WHERE ID=?";
		Connection connection = null;

		PreparedStatement statement = null;
		// step 1
		Class.forName("com.mysql.jdbc.Driver");
		// step 2
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/salesDB", "root", "root");
		// step 3
		statement = connection.prepareStatement(SQL);

		int id =2;

		statement.setInt(1, id);

		// step 4
		ResultSet r = statement.executeQuery();
		if (r.next()) {
			System.out.println("Record found");
			System.out.println(r.getInt(1) + "\t" + r.getString(2) + "\t" + r.getDouble(3));
		}
		else{
			System.out.println("record not found");
		}
		// step 5
		statement.close();
		r.close();

		connection.close();

	}
}
