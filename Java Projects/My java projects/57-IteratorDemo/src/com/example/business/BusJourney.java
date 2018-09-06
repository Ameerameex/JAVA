package com.example.business;

public class BusJourney {
	private String source,destination;
	private int journeyHours;
	private double fare;
	
	public BusJourney(String source, String destination, int journeyHours, double fare) {
		super();
		this.source = source;
		this.destination = destination;
		this.journeyHours = journeyHours;
		this.fare = fare;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getJourneyHours() {
		return journeyHours;
	}
	public void setJourneyHours(int journeyHours) {
		this.journeyHours = journeyHours;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	
	@Override
	public String toString() {
		return "BusJourney [source=" + source + ", destination=" + destination + ", journeyHours=" + journeyHours
				+ ", fare=" + fare + "]";
	}
	
	
	

}
