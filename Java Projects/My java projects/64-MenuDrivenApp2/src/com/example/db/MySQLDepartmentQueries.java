package com.example.db;

public interface MySQLDepartmentQueries {

	String  INSERT_QUERY="insert into department values(?,?,?)";
	String UPDATE_QUERY="update department set name=?,head=? where id=?";
	String DELETE_QUERY="delete from department where id=?";
	String FIND_ALL_QUERY="select * from department";
	String FIND_ONE_QUERY="select * from department where id=?";

}
