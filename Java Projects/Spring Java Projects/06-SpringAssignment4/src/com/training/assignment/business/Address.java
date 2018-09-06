package com.training.assignment.business;

public class Address {
	
	String doorNumber,streetName,areaName,city,pincode;

	public Address(String doorNumber, String streetName, String areaName, String city, String pincode) {
		super();
		this.doorNumber = doorNumber;
		this.streetName = streetName;
		this.areaName = areaName;
		this.city = city;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [doorNumber=" + doorNumber + ", streetName=" + streetName + ", areaName=" + areaName + ", city="
				+ city + ", pincode=" + pincode + "]";
	}
	
	
	// No Setter/Getters
	// Only paramaterized constructor
	// toString()

}
