package com.ameex.training.db;

public interface MySQLContactInfoQueries {

	String  INSERT_QUERY="insert into ContactInfo(email,phone,cId) values(?,?,?)";
	String UPDATE_QUERY="update ContactInfo set email=?,phone=?,cId=? where id=?";
	String DELETE_QUERY="delete from ContactInfo where id=?";
	String FIND_ALL_QUERY="select * from ContactInfo";
	String FIND_ONE_QUERY="select * from ContactInfo where id=?";

}
