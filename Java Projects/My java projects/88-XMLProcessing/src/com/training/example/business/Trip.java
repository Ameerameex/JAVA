package com.training.example.business;

import java.util.Date;

public class Trip {
	
	private String id;
	private String source,destination,operatorName;
	private double adultFare,kidFare;
	private Date tripDate;
	private int totalSeats,occupiedSeats;
	private Driver driver;
	
	public final String getId() {
		return id;
	}
	public final void setId(String id) {
		this.id = id;
	}
	public final String getSource() {
		return source;
	}
	public final void setSource(String source) {
		this.source = source;
	}
	public final String getDestination() {
		return destination;
	}
	public final void setDestination(String destination) {
		this.destination = destination;
	}
	public final double getAdultFare() {
		return adultFare;
	}
	public final void setAdultFare(double adultFare) {
		this.adultFare = adultFare;
	}
	public final double getKidFare() {
		return kidFare;
	}
	public final void setKidFare(double kidFare) {
		this.kidFare = kidFare;
	}
	public final Date getTripDate() {
		return tripDate;
	}
	public final void setTripDate(Date tripDate) {
		this.tripDate = tripDate;
	}
	public final int getTotalSeats() {
		return totalSeats;
	}
	public final void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}
	public final int getOccupiedSeats() {
		return occupiedSeats;
	}
	public final void setOccupiedSeats(int occupiedSeats) {
		this.occupiedSeats = occupiedSeats;
	}
	public final Driver getDriver() {
		return driver;
	}
	public final void setDriver(Driver driver) {
		this.driver = driver;
	}
	public final String getOperatorName() {
		return operatorName;
	}
	public final void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}
	
	@Override
	public String toString() {
		return "Trip [id=" + id + ", source=" + source + ", destination=" + destination + ", operatorName="
				+ operatorName + ", adultFare=" + adultFare + ", kidFare=" + kidFare + ", tripDate=" + tripDate
				+ ", totalSeats=" + totalSeats + ", occupiedSeats=" + occupiedSeats + "]";
	}
	
	
	
	
	
	
}
