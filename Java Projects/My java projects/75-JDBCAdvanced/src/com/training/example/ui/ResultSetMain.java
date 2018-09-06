package com.training.example.ui;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.training.example.db.ConnectionManager;

public class ResultSetMain {
	
	public static void main(String[] args) throws Exception {
		
		Connection connection=ConnectionManager.createConnection();
		
		
		
		Statement statement=null;
		String SQL="select * from product";
		
		statement=connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet resultSet=statement.executeQuery(SQL);
	/*	resultSet.moveToInsertRow();
		resultSet.updateInt(1,125);
		resultSet.updateString(2, "Mobile");
		resultSet.updateDouble(3, 22000.00);
		resultSet.insertRow();
		*/
//		resultSet.absolute(2);
//		resultSet.updateString(2, "abc");
//		resultSet.updateDouble(3, 0.0);
//		resultSet.updateRow();
//resultSet.absolute(4);
//resultSet.deleteRow();
		
		boolean status=false;
		
		status=resultSet.absolute(3);
		status=resultSet.relative(-1);
		if(status)
		System.out.println(resultSet.getInt(1)+","+resultSet.getString(2)+","+resultSet.getDouble(3));
		resultSet.absolute(3);
		System.out.println(resultSet.isFirst());
		resultSet.close();

		/*resultSet.next();
		System.out.println(resultSet.getInt(1)+","+resultSet.getString(2)+","+resultSet.getDouble(3));
		
		resultSet.last();
		System.out.println(resultSet.getInt(1)+","+resultSet.getString(2)+","+resultSet.getDouble(3));
		resultSet.previous();
		System.out.println(resultSet.getInt(1)+","+resultSet.getString(2)+","+resultSet.getDouble(3));
//resultSet.absolute(3);
//System.out.println(resultSet.getInt(1)+","+resultSet.getString(2)+","+resultSet.getDouble(3));
resultSet.deleteRow();
System.out.println(resultSet.getInt(1)+","+resultSet.getString(2)+","+resultSet.getDouble(3));
*/
		
	}

}
