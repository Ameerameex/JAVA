package com.training.business;

public class HotelRoom {

	String roomNo,floorNo;
	int roomType;//Deluxe-1;ultradeluxe-2;superior-3
	boolean occupied;
	Guest guest;
	public HotelRoom(String roomNo, String floorNo, int roomType, boolean occupied, Guest guest) {
		super();
		this.roomNo = roomNo;
		this.floorNo = floorNo;
		this.roomType = roomType;
		this.occupied = occupied;
		this.guest = guest;
	}
	public String getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}
	public String getFloorNo() {
		return floorNo;
	}
	public void setFloorNo(String floorNo) {
		this.floorNo = floorNo;
	}
	public int getRoomType() {
		return roomType;
	}
	public void setRoomType(int roomType) {
		this.roomType = roomType;
	}
	public boolean isOccupied() {
		return occupied;
	}
	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
		if(occupied==false){
			guest=null;
		}
	}
	public Guest getGuest() {
		return guest;
	}
	public void setGuest(Guest guest) {
		this.guest = guest;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((roomNo == null) ? 0 : roomNo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HotelRoom other = (HotelRoom) obj;
		if (roomNo == null) {
			if (other.roomNo != null)
				return false;
		} else if (!roomNo.equals(other.roomNo))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "HotelRoom [roomNo=" + roomNo + ", floorNo=" + floorNo + ", roomType=" + roomType + ", occupied="
				+ occupied + ", guest=" + guest + "]";
	}
	
}
