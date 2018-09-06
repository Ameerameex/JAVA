package com.training.example.ui;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.training.example.db.ConnectionManager;

public class BatchExecutionMain {

	public static void main(String[] args) throws Exception {

		String string = "insert into product(id,name) values(409,'abcd')";
		String string2 = "insert into product(id,name) values(411,'x')";
		String string3 = "insert into product(id,name) values(412,'y')";
		String string4 = "insert into product(id,name) values(413,'xyz')";

		Connection connection = ConnectionManager.createConnection();

		Statement statement = connection.createStatement();
		statement.addBatch(string);
		statement.addBatch(string2);
		statement.addBatch(string3);
		statement.addBatch(string4);
int[] rowCounts=statement.executeBatch();
for (int i : rowCounts) {
	System.out.println(i+" row affected");
}
statement.close();
		ConnectionManager.closeConnection(connection);

	}

}
