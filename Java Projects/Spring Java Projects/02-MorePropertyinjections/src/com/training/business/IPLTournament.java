package com.training.business;

import java.util.Map;

public class IPLTournament {

	private int year;
	private int noOfTeams;
	private String officialSponsor;
	private Map<String,String> performanceMap;
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getNoOfTeams() {
		return noOfTeams;
	}
	public void setNoOfTeams(int noOfTeams) {
		this.noOfTeams = noOfTeams;
	}
	public String getOfficialSponsor() {
		return officialSponsor;
	}
	public void setOfficialSponsor(String officialSponsor) {
		this.officialSponsor = officialSponsor;
	}
	public Map<String, String> getPerformanceMap() {
		return performanceMap;
	}
	public void setPerformanceMap(Map<String, String> performanceMap) {
		this.performanceMap = performanceMap;
	}
	@Override
	public String toString() {
		return "IPLTournament [year=" + year + ", noOfTeams=" + noOfTeams + ", officialSponsor=" + officialSponsor
				+ ", performanceMap=" + performanceMap + "]";
	}
	
	
	
}
