package com.training.db;

import java.util.List;

import com.training.business.HotelRoom;

public interface HotelDAO {
	boolean addHotelRoom(HotelRoom hotelRoom);

	boolean deletehotelRoom(HotelRoom hotelRoom);

	boolean updateHotelRoom(HotelRoom hotelRoom);

	HotelRoom findHotelRoom(String roomNo);

	List<HotelRoom> getAllRooms();

}
