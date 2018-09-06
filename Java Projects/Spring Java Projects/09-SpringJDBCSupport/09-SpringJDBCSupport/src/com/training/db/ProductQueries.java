package com.training.db;

public interface ProductQueries {

	String INSERT = "insert into product values(?,?,?,?,?)";
	String UPDATE = "update product set name=?,price=?,mdate=?,category=? where id=?";
	String DELETE = "delete from product where id=?";
	String FIND = "select * from product where id=?";
	String FINDALL = "select * from product";

}
