package com.example.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateClient1 {

	public static void main(String[] args) throws Exception {
		final String SQL="update Product set price=price+(price*0.10) where id=3";
		
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
        	System.out.println(r+" records updated");
        	
        }
        //step 5
        connection.close();
		
		
	}

}
