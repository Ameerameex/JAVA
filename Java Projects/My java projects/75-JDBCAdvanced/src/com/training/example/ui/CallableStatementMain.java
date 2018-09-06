package com.training.example.ui;

import java.awt.Window.Type;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

import com.training.example.db.ConnectionManager;

public class CallableStatementMain {

	public static void main(String[] args) throws Exception {
	
		Connection connection=ConnectionManager.createConnection();
		
		CallableStatement callableStatement=connection.prepareCall("{call getdetails(?,?,?)}" );
		callableStatement.setInt(1,122);
		callableStatement.registerOutParameter(2,Types.VARCHAR);
		callableStatement.registerOutParameter(3,Types.DOUBLE);
		
		callableStatement.execute();
		System.out.println(callableStatement.getString(2));
		System.out.println(callableStatement.getDouble(3));
		
		callableStatement.close();
		connection.close();


	}

}
