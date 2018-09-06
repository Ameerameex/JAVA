package com.training.ui;

import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.training.business.HotelRoom;
import com.training.business.Product;
import com.training.db.HotelDAO;
import com.training.db.ProductDAO;

public class Main1 {
	static void insertTest() {
HotelRoom hotelRoom=new HotelRoom("A1","Third", "Ultra-Deluxe", 1000.00, 3, true)	;	
HotelDAO dao = getHotelDAO();
	System.out.println(dao.addHotelRoom(hotelRoom));
	}

	private static HotelDAO getHotelDAO() {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans1.xml");
		
		HotelDAO dao=(HotelDAO) applicationContext.getBean("daoBean");
		return dao;
	}

	static void deleteTest(){
HotelRoom hotelRoom=new HotelRoom();
hotelRoom.setRoomNo("A1");
HotelDAO dao = getHotelDAO();

		
	System.out.println(dao.deletehotelRoom(hotelRoom));
	}

	static void updateTest(){
		HotelRoom hotelRoom=new HotelRoom("A1","Second", "Deluxe", 500.00, 3, false);	
		HotelDAO dao = getHotelDAO();
			System.out.println(dao.updateHotelRoom(hotelRoom));
	}

	static void findTest(){
		String roomNo="A1";
		HotelDAO dao = getHotelDAO();
		HotelRoom hotelRoom=dao.findHotelRoom(roomNo);
		System.out.println(hotelRoom);

	}

	static void findAllTest(){
		HotelDAO dao = getHotelDAO();

		List<HotelRoom> hotelRooms = dao.getAllRooms();
		for (HotelRoom hotelRoom : hotelRooms) {
			System.out.println(hotelRoom);
		}
	}

	

	public static void main(String[] args) {

	//insertTest();
	//deleteTest();
	//updateTest();
	//findTest();
	findAllTest();
	}

}

