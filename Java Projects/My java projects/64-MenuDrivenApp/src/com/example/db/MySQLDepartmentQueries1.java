package com.example.db;

public interface MySQLDepartmentQueries1 {

	String  INSERT_QUERY="insert into Department values(?,?,?)";
	String UPDATE_QUERY="update Department set name=?,head=? where id=?";
	String DELETE_QUERY="delete from Department where id=?";
	String FIND_ALL_QUERY="select * from Department";
	String FIND_ONE_QUERY="select * from Department where id=?";

}
