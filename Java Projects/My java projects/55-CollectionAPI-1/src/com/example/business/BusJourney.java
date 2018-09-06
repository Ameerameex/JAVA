package com.example.business;

public class BusJourney implements Comparable<BusJourney> {
	private String source, destination;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		long temp;
		temp = Double.doubleToLongBits(fare);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + journeyHours;
		result = prime * result + ((source == null) ? 0 : source.hashCode());
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
		BusJourney other = (BusJourney) obj;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (Double.doubleToLongBits(fare) != Double.doubleToLongBits(other.fare))
			return false;
		if (journeyHours != other.journeyHours)
			return false;
		if (source == null) {
			if (other.source != null)
				return false;
		} else if (!source.equals(other.source))
			return false;
		return true;
	}

	public int compareTo(BusJourney o) {

		if (this.source.equals(o.source))
			return 0;

		return -1;
	}

}
