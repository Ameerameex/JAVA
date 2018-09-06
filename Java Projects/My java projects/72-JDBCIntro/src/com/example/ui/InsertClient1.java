package com.example.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertClient1 {

	public static void main(String[] args) throws Exception {
		final String SQL="insert into PRODUCT value(8,'Oppo mobile',25000.00)";
		Connection connection=null;
		
		Statement statement=null;
		//step 1
		Class.forName("com.mysql.jdbc.Driver");
		//step 2
        connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/salesDB", "root", "root");
        //step 3
        statement=connection.createStatement();
//step 4
        int r=statement.executeUpdate(SQL);
        
        if(r>0){
        	System.out.println("PRODUCT INSERTED SUCCESSFULLY");
        	
        }
        //step 5
        connection.close();
		

	}

}
