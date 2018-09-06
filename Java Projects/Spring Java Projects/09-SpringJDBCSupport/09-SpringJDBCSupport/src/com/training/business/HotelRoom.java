package com.training.business;

public class HotelRoom {

	String roomNo;
	String floorNo;
	String roomType;
	double tariffAmount;
	int maxCapacity;
	boolean occupied;

	public HotelRoom(String roomNo, String floorNo, String roomType, double tariffAmount, int maxCapacity,
			boolean occupied) {
		super();
		this.roomNo = roomNo;
		this.floorNo = floorNo;
		this.roomType = roomType;
		this.tariffAmount = tariffAmount;
		this.maxCapacity = maxCapacity;
		this.occupied = occupied;
	}

	public HotelRoom() {
		super();
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

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public double getTariffAmount() {
		return tariffAmount;
	}

	public void setTariffAmount(double tariffAmount) {
		this.tariffAmount = tariffAmount;
	}

	public int getMaxCapacity() {
		return maxCapacity;
	}

	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

	public boolean isOccupied() {
		return occupied;
	}

	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}

	@Override
	public String toString() {
		return "HotelRoom [roomNo=" + roomNo + ", floorNo=" + floorNo + ", roomType=" + roomType + ", tariffAmount="
				+ tariffAmount + ", maxCapacity=" + maxCapacity + ", occupied=" + occupied + "]";
	}

}
