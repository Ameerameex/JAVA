package com.example.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class InsertClient2 {

	public static void main(String[] args) throws Exception {
		final String SQL="insert into product value(? ,? ,?)";
Connection connection=null;
		
		PreparedStatement statement=null;
		//step 1
		Class.forName("com.mysql.jdbc.Driver");
		//step 2
        connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/salesDB", "root", "root");
        //step 3
        statement=connection.prepareStatement(SQL);

        int id=16;
        String name="Samsung TV";
        double price=70000.00;
        
        statement.setInt(1, id);
        statement.setString(2, name);
        statement.setDouble(3, price);
      //step 4    
        int r=statement.executeUpdate();
        
        	System.out.println(r+" Record added");
        	
        
        //step 5
        	statement.close();
        connection.close();
		

	}

}
