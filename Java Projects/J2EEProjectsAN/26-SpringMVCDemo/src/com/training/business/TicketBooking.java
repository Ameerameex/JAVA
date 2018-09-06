package com.training.business;

import java.util.Date;

public class TicketBooking {

	int id;
	String passengerName;
	Date bookingDate,journeyDate;
	String serviceOperatorName,sourceOfJourney,destinationOfJourney;
	double ticketFare;
	public TicketBooking(int id, String passenger, Date bookingDate, Date journeyDate, String serviceOperatorName,
			String sourceOfJourney, String destinationOfJourney, double ticketFare) {
		super();
		this.id = id;
		this.passengerName = passenger;
		this.bookingDate = bookingDate;
		this.journeyDate = journeyDate;
		this.serviceOperatorName = serviceOperatorName;
		this.sourceOfJourney = sourceOfJourney;
		this.destinationOfJourney = destinationOfJourney;
		this.ticketFare = ticketFare;
	}
	public TicketBooking() {
		super();

	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passenger) {
		this.passengerName = passenger;
	}
	public Date getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}
	public Date getJourneyDate() {
		return journeyDate;
	}
	public void setJourneyDate(Date journeyDate) {
		this.journeyDate = journeyDate;
	}
	public String getServiceOperatorName() {
		return serviceOperatorName;
	}
	public void setServiceOperatorName(String serviceOperatorName) {
		this.serviceOperatorName = serviceOperatorName;
	}
	public String getSourceOfJourney() {
		return sourceOfJourney;
	}
	public void setSourceOfJourney(String sourceOfJourney) {
		this.sourceOfJourney = sourceOfJourney;
	}
	public String getDestinationOfJourney() {
		return destinationOfJourney;
	}
	public void setDestinationOfJourney(String destinationOfJourney) {
		this.destinationOfJourney = destinationOfJourney;
	}
	public double getTicketFare() {
		return ticketFare;
	}
	public void setTicketFare(double ticketFare) {
		this.ticketFare = ticketFare;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		TicketBooking other = (TicketBooking) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "TicketBooking [id=" + id + ", passenger=" + passengerName + ", bookingDate=" + bookingDate
				+ ", journeyDate=" + journeyDate + ", serviceOperatorName=" + serviceOperatorName + ", sourceOfJourney="
				+ sourceOfJourney + ", destinationOfJourney=" + destinationOfJourney + ", ticketFare=" + ticketFare
				+ "]";
	}
	
	
}
