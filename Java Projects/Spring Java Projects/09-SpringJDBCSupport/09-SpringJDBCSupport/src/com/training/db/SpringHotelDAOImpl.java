package com.training.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.training.business.HotelRoom;
import com.training.business.Product;

public class SpringHotelDAOImpl implements HotelDAO,HotelQueries {
	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	
	private class HotelRowMapper implements RowMapper<HotelRoom> {

		@Override
		public HotelRoom mapRow(ResultSet rs, int arg1) throws SQLException {
			HotelRoom hotelRoom=new HotelRoom();
			hotelRoom.setRoomNo(rs.getString(1));
			hotelRoom.setFloorNo(rs.getString(2));
			hotelRoom.setRoomType(rs.getString(3));
			hotelRoom.setTariffAmount(rs.getInt(4));
			hotelRoom.setMaxCapacity(rs.getInt(5));
			hotelRoom.setOccupied(rs.getBoolean(6));

			return hotelRoom;
		}
	}


	@Override
	public boolean addHotelRoom(HotelRoom hotelRoom) {
		Object[] values = {hotelRoom.getRoomNo(), hotelRoom.getFloorNo(), hotelRoom.getRoomType(), hotelRoom.getTariffAmount(), hotelRoom.getMaxCapacity(),
				hotelRoom.isOccupied()};
		int rowCount = template.update(INSERT, values);
		if (rowCount > 0) {
			return true;
		}
		return false;
		
	}


	@Override
	public boolean deletehotelRoom(HotelRoom hotelRoom) {
		String values=hotelRoom.getRoomNo();
		int rowCount = template.update(DELETE, values);
		if (rowCount > 0) {
			return true;
		}
		return false;
	}


	@Override
	public boolean updateHotelRoom(HotelRoom hotelRoom) {
		Object[] values = { hotelRoom.getFloorNo(), hotelRoom.getRoomType(), hotelRoom.getTariffAmount(), hotelRoom.getMaxCapacity(),
				hotelRoom.isOccupied(),hotelRoom.getRoomNo()};
		
		int rowCount = template.update(UPDATE, values);
		if (rowCount > 0) {
			return true;
		}
		return false;
	}


	@Override
	public HotelRoom findHotelRoom(String roomNo) {
		HotelRoom hotelRoom = (HotelRoom) template.queryForObject(FIND, new HotelRowMapper(), roomNo);
		return hotelRoom;
	}


	@Override
	public List<HotelRoom> getAllRooms() {
		List<HotelRoom> hotelRoom = template.query(FINDALL, new HotelRowMapper());

		return hotelRoom;
	}
}
