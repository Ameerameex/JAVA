package com.ameex.training.business;

public class Address{

	int id;
	String doorNo;
	String areaName;
	String city;
	String pincode;
	String state;
	int cId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
	public Address(String doorNo, String areaName, String city, String pincode, String state, int cId) {
		super();
		this.doorNo = doorNo;
		this.areaName = areaName;
		this.city = city;
		this.pincode = pincode;
		this.state = state;
		this.cId = cId;
	}
	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", areaName=" + areaName + ", city=" + city + ", pincode=" + pincode
				+ ", state=" + state + "]";
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
