package com.training.db;

public interface UserQueries {

	String INSERT="insert into User(userName,password,userType) values(?,?,?)";
	String UPDATE="update User set userName=?,password=?,userType=? where userName=?";
	String DELETE="delete from User where userName=?";
	String FIND="select * from User where userName=?";
	String FINDALL="select * from User";

}
