package com.example.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteClient2 {

	public static void main(String[] args) throws Exception {
		final String SQL="DELETE FROM product WHERE ID=?";
Connection connection=null;
		
		PreparedStatement statement=null;
		//step 1
		Class.forName("com.mysql.jdbc.Driver");
		//step 2
        connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/salesDB", "root", "root");
        //step 3
        statement=connection.prepareStatement(SQL);

        int id=16;
       
        
        statement.setInt(1, id);
        
      //step 4    
        int r=statement.executeUpdate();
        
        	System.out.println(r+" Records deleted");
        	
        
        //step 5
        	statement.close();
        connection.close();
		


	}

}
