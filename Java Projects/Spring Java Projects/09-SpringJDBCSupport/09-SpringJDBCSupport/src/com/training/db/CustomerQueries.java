package com.training.db;

public interface CustomerQueries {

	String INSERT = "insert into Customer(Name,gender,age,proofId,bookingDone) values(?,?,?,?,?)";
	String UPDATE = "update Customer set name=?,gender=?,age=?,proofId=?,bookingDone=? where id=?";
	String DELETE = "delete from Customer where id=?";
	String FIND = "select * from Customer where id=?";
	String FINDALL = "select * from Customer";

}
