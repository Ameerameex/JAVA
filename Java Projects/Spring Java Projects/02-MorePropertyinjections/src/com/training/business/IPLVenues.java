package com.training.business;

import java.util.List;

public class IPLVenues {

	String regionName;
	List<String> venueNames;
	
	public String getRegionName() {
		return regionName;
	}
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}
	public List<String> getVenueNames() {
		return venueNames;
	}
	public void setVenueNames(List<String> venueNames) {
		this.venueNames = venueNames;
	}
	@Override
	public String toString() {
		return "IPLVenues [regionName=" + regionName + ", venueNames=" + venueNames + "]";
	}
	
	
	
}
