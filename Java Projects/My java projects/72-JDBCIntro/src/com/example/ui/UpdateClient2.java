package com.example.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateClient2 {

	public static void main(String[] args) throws Exception {
		final String SQL="UPDATE product SET NAME=?,price=? WHERE ID=?";

Connection connection=null;
		
		PreparedStatement statement=null;
		//step 1
		Class.forName("com.mysql.jdbc.Driver");
		//step 2
        connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/salesDB", "root", "root");
        //step 3
        statement=connection.prepareStatement(SQL);

        int id=2;
        String name="Voltas AC";
        double price=30000.00;
        
       statement.setString(1, name);
        statement.setDouble(2, price);
        statement.setInt(3, id);
        
      //step 4    
        int r=statement.executeUpdate();
        
        	System.out.println(r+" Records updated");
        	
        
        //step 5
        	statement.close();
        connection.close();
		


	}

}
