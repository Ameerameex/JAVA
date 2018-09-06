package com.ameex.training.db;

public interface MySQLCustomerQueries {

	String  INSERT_QUERY="insert into Customer(name,gender,age,proofId,bookingDone) values(?,?,?,?,?)";
	String UPDATE_QUERY="update Customer set name=?,gender=?,age=?,proofId=?,bookingDone=? where id=?";
	String DELETE_QUERY="delete from Customer where id=?";
	String FIND_ALL_QUERY="select * from Customer";
	String FIND_ONE_QUERY="select * from Customer where id=?";

}
