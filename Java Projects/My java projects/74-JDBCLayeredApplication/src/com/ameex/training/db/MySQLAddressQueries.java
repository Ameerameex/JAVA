package com.ameex.training.db;

public interface MySQLAddressQueries {

	String  INSERT_QUERY="insert into Address(doorNo,areaName,city,pincode,state,cId) values(?,?,?,?,?,?)";
	String UPDATE_QUERY="update Address set doorNo=?,areaName=?,city=?,pincode=?,state=?,cId=? where id=?";
	String DELETE_QUERY="delete from Address where id=?";
	String FIND_ALL_QUERY="select * from Address";
	String FIND_ONE_QUERY="select * from Address where id=?";

}
