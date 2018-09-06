package com.training.db;

public interface HotelQueries {

	String INSERT = "insert into hotelroom values(?,?,?,?,?,?)";
	String UPDATE = "update hotelRoom set floorNo=?,roomType=?,tariffAmount=?,maxCapacity=?,occupied=? where roomNo=?";
	String DELETE = "delete from hotelRoom where roomNo=?";
	String FIND = "select * from hotelRoom where roomNo=?";
	String FINDALL = "select * from hotelRoom";

}
