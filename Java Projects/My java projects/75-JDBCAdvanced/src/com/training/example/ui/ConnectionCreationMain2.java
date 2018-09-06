package com.training.example.ui;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import javax.imageio.stream.FileImageInputStream;

public class ConnectionCreationMain2 {

	public static void main(String[] args) {

		Properties properties = new Properties();

		try {
			properties.load(new FileInputStream("DB.properties"));
		} catch (FileNotFoundException e) {
			System.out.println("unable to locate db settings");
		} catch (IOException e) {
			System.out.println("Error while reading DB settings");
		}
		System.out.println(properties);
		String url = (String) properties.get("url");
		String driver = (String) properties.get("driver");
		String pwd = (String) properties.get("password");
		String user = (String) properties.get("user");
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			System.out.println("Error:In loading Driver Class");
			System.exit(0);
		}
		try {
			Connection connection = DriverManager.getConnection(url, user, pwd);
			System.out.println("conncted to DB");
		} catch (SQLException e) {
			System.out.println("Error:while connecting to DB ");
			System.exit(0);
		}
	}

}
