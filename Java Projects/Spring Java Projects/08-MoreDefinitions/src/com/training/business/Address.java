package com.training.business;

public class Address {

	String cityName,stateName,pincode;

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [cityName=" + cityName + ", stateName=" + stateName + ", pincode=" + pincode + "]";
	}
	
	
	
	
	
}
