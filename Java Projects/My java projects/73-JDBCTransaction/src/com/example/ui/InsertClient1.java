package com.example.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class InsertClient1 {

	public static void main(String[] args) throws Exception {
		String SQL1 = "insert into contact values(1,'abc','8883970825')";
		String SQL2 = "insert into contact values(2,'ijk','8883980825')";
		String SQL3 = "insert into contact values(3,'xyz','8883990825')";
		Connection connection = null;

		Statement statement = null;
		// step 1
		Class.forName("com.mysql.jdbc.Driver");
		// step 2
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/salesDB", "root", "root");
		// step 3
		statement = connection.createStatement();
		// step 4
		connection.setAutoCommit(false);
		statement.executeUpdate(SQL1);
		statement.executeUpdate(SQL2);
		statement.executeUpdate(SQL3);
		Scanner scanner=new Scanner(System.in);
		System.out.println("do you want to save ?");
		char answer=scanner.next().charAt(0);
		if(answer=='Y'||answer=='y'){
			
			connection.commit();
		}
		else{
			connection.rollback();
		}


		
		// step 5
		connection.close();

	}

}
