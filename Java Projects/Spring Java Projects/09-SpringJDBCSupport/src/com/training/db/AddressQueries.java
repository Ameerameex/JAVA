package com.training.db;

public interface AddressQueries {

	String INSERT="insert into Address(doorNo,areaName,city,pincode,state,cId) values(?,?,?,?,?,?)";
	String UPDATE="update Address set doorNo=?,areaName=?,city=?,pincode=?,state=?,cId=? where id=?";
	String DELETE="delete from Address where id=?";
	String FIND="select * from Address where id=?";
	String FINDALL="select * from Address";

}
