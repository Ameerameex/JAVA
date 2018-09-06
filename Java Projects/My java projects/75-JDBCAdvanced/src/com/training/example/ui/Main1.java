package com.training.example.ui;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.training.example.db.ConnectionManager;

public class Main1 {

	public static void main(String[] args) throws Exception {

		
		Connection connection=ConnectionManager.createConnection();
		
		String SQL="insert into contact1(name,phone) values('ijk','6768558765')";
		
		Statement statement=connection.createStatement();
		
		int r=statement.executeUpdate(SQL);
		
	ResultSet resultSet=statement.getGeneratedKeys();
	
	resultSet.next();
	System.out.println(resultSet.getInt(1));
		
		System.out.println(r);
		
	}

}
