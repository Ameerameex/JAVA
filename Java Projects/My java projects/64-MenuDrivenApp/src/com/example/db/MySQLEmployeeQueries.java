package com.example.db;

public interface MySQLEmployeeQueries {

	String  INSERT_QUERY="insert into Employee values(?,?,?,?,?)";
	String UPDATE_QUERY="update Employee set name=?,basic=?,grade=?,doj=?,did=? where id=?";
	String DELETE_QUERY="delete from Employee where id=?";
	String FIND_ALL_QUERY="select * from Employee";
	String FIND_ONE_QUERY="select * from Employee where id=?";

}
