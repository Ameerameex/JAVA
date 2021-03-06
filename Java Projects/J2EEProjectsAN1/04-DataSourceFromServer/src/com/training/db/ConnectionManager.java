package com.training.db;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ConnectionManager {
	
	public static Connection createConnection(){
		Context initContext=null;
	
		Connection connection=null;
		try {
			initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:/comp/env");
			DataSource ds = (DataSource) envContext.lookup("jdbc/salesDB");
			connection=ds.getConnection();
		}
	 catch (NamingException e) {   
		System.out.println("here4");
		System.out.println(e);
		e.printStackTrace();
	 } catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		return connection;
	}
	
	public static void closeConnection(Connection connection){
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
