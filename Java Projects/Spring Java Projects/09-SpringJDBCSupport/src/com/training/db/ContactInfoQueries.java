package com.training.db;

public interface ContactInfoQueries {

	String INSERT = "insert into ContactInfo(email,phone,cId) values(?,?,?)";
	String UPDATE = "update ContactInfo set email=?,phone=?,cId=? where id=?";
	String DELETE = "delete from ContactInfo where id=?";
	String FIND = "select * from ContactInfo where id=?";
	String FINDALL = "select * from ContactInfo";

}
