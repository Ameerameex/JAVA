package com.training.db;

public interface MySQLEmployeeQueries {
	
	
	String EMP_INSERT_QUERY = "insert into employee values(?,?,?,?,? )";
	String EMP_UPDATE_QUERY = "update employee set name=?, basic=?,doj=?,grade=? where id=?";
	String EMP_FIND_ONE_QUERY = "select * from employee where id=?";
	String EMP_DELETE_QUERY = "delete from employee where id=?";
	String EMP_FIND_ALL_QUERY = "select * from employee";
}
