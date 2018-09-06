package com.training.db;

public interface MySQLEmployeeQueries {

	String  INSERT_QUERY="insert into Employee1 values(?,?,?,?,)";
	String UPDATE_QUERY="update Employee1 set name=?,basic=?,grade=?,doj=? where id=?";
	String DELETE_QUERY="delete from Employee1 where id=?";
	String FIND_ALL_QUERY="select * from Employee1";
	String FIND_ONE_QUERY="select * from Employee1 where id=?";

}
