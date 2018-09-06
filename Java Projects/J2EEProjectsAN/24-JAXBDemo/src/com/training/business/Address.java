package com.training.business;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
@XmlRootElement
@XmlType(propOrder={"doorNo","areaName","cityName","pincode"})
public class Address {
	String doorNo;
	String areaName;
	String cityName;
	String pincode;
	
	public Address(String doorNo, String areaName, String cityName, String pincode) {
		super();
		this.doorNo = doorNo;
		this.areaName = areaName;
		this.cityName = cityName;
		this.pincode = pincode;
	}

	public Address() {
		super();
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

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", areaName=" + areaName + ", cityName=" + cityName + ", pincode="
				+ pincode + "]";
	}
	
	
	

}
