package com.example.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DisplayAllClient {

	public static void main(String[] args) throws Exception {
		final String SQL = "SELECT id,price,name FROM product";
		Connection connection = null;

		Statement statement = null;
		// step 1
		Class.forName("com.mysql.jdbc.Driver");
		// step 2
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/salesDB", "root", "root");
		// step 3
		statement = connection.createStatement();
		// step 4
          ResultSet resultSet=statement.executeQuery(SQL);
         while(resultSet.next()){
        	 System.out.println(resultSet.getInt(1)+","+resultSet.getDouble(2)+","+resultSet.getString(3));
        	 
         }
         resultSet.close();

		// step 5
		connection.close();

	}

}
