package com.ameex.training.db;

public interface MySQLProductQueries {
	String INSERT_QUERY="insert into product(id,name,price,mDate) values(?,?,?,?)";
	String UPDATE_QUERY="update product set name=?, price=?, mdate=?  where id=?";
	String DELETE_QUERY="delete from product where id=?";
	String FIND_ALL_QUERY="select * from product";
	String FIND_ONE_QUERY="select * from product where id=?";
}
