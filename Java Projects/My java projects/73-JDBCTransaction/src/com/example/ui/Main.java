package com.example.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {

	static void displaysForSource(String source) throws Exception {

		String SQL = "Select * from journey where source=?";

		Connection connection = null;

		PreparedStatement statement = null;
		// step 1
		Class.forName("com.mysql.jdbc.Driver");
		// step 2
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/salesDB", "root", "root");
		// step 3
		statement = connection.prepareStatement(SQL);

		statement.setString(1, source);

		ResultSet resultSet = statement.executeQuery();
		System.out.printf("%15s%15s%15s%15s", "SOURCE", "DESTINATION", "HOURS", "FARE");
		System.out.println();
		System.out.println("--------------------------------------------------------------------");
		while (resultSet.next()) {
			System.out.printf("%15s%15s%15d%15.2f", resultSet.getString(1), resultSet.getString(2), resultSet.getInt(3),
					resultSet.getDouble(4));
			System.out.println();

		}
		System.out.println("--------------------------------------------------------------------");

	}

	static void displaysForDestination(String destination) throws Exception {
		String SQL = "Select * from journey where destination=?";

		Connection connection = null;

		PreparedStatement statement = null;
		// step 1
		Class.forName("com.mysql.jdbc.Driver");
		// step 2
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/salesDB", "root", "root");
		// step 3
		statement = connection.prepareStatement(SQL);

		statement.setString(1, destination);

		ResultSet resultSet = statement.executeQuery();
		System.out.printf("%15s%15s%15s%15s", "SOURCE", "DESTINATION", "HOURS", "FARE");
		System.out.println();
		System.out.println("--------------------------------------------------------------------");
		while (resultSet.next()) {
			System.out.printf("%15s%15s%15d%15.2f", resultSet.getString(1), resultSet.getString(2), resultSet.getInt(3),
					resultSet.getDouble(4));
			System.out.println();

		}
		System.out.println("--------------------------------------------------------------------");

	}

	static void displayRecords() throws Exception {
		String SQL = "select * from journey";
		String SQL2 = "select sum(fare) from journey";
		Connection connection = null;

		PreparedStatement statement = null;
		// step 1
		Class.forName("com.mysql.jdbc.Driver");
		// step 2
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/salesDB", "root", "root");
		// step 3
		statement = connection.prepareStatement(SQL);
		// step 4
		ResultSet resultSet = statement.executeQuery();
		System.out.printf("%15s%15s%15s%15s", "SOURCE", "DESTINATION", "HOURS", "FARE");
		System.out.println();
		System.out.println("--------------------------------------------------------------------");
		while (resultSet.next()) {
			System.out.printf("%15s%15s%15d%15.2f", resultSet.getString(1), resultSet.getString(2), resultSet.getInt(3),
					resultSet.getDouble(4));
			System.out.println();

		}
		System.out.println("--------------------------------------------------------------------");

		statement = connection.prepareStatement(SQL2);
		ResultSet resultSet2 = statement.executeQuery();
		if (resultSet2.next()) {
			System.out.printf("%45s%15.2f", "TOTAL", resultSet2.getDouble(1));
			System.out.println();
		}
		System.out.println("--------------------------------------------------------------------");

		resultSet.close();

		// step 5
		connection.close();

	}

	static void insertRecord() throws Exception {
		String sourcePoint, destinationPoint;
		int hours;
		double fare;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Source Of Journey:  ");
		sourcePoint = scanner.next();

		System.out.println();

		System.out.print("Enter Destination Of Journey:  ");
		destinationPoint = scanner.next();
		System.out.print("Enter Journey hours :  ");
		hours = scanner.nextInt();
		System.out.print("Enter Fare :  ");
		fare = scanner.nextDouble();
		String SQL = "insert into journey values(?,?,?,?)";
		Connection connection = null;

		PreparedStatement statement = null;
		// step 1
		Class.forName("com.mysql.jdbc.Driver");
		// step 2
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/salesDB", "root", "root");
		// step 3
		statement = connection.prepareStatement(SQL);
		statement.setString(1, sourcePoint);
		statement.setString(2, destinationPoint);
		statement.setInt(3, hours);
		statement.setDouble(4, fare);
		int r = statement.executeUpdate();
		if (r > 0) {
			System.out.println(r + "  record inserted");

		}
		statement.close();
		connection.close();
	}

	public static void main(String[] args) throws Exception {

		// insertRecord();
		System.out.println("-------------------------- All Records----------------");
		System.out.println();
		
		displayRecords();
		System.out.println();
		System.out.println("-------------------------- Records for Specified Source-----------------------");
		System.out.println();
		
		displaysForSource("newyork");
		System.out.println();
		System.out.println("-------------------------- Records for Specified Destination-----------------------");
		System.out.println();
		
		displaysForDestination("tuticorin");

	}

}
