package com.training.assignment.business;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Company {
	
	String name;
	int[] expansionYears;
	List<String> directorNames;
	Set<String> branchLocations;
	
	Map<Integer,Double> lastTenYearsProfit;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getExpansionYears() {
		return expansionYears;
	}

	public void setExpansionYears(int[] expansionYears) {
		this.expansionYears = expansionYears;
	}

	public List<String> getDirectorNames() {
		return directorNames;
	}

	public void setDirectorNames(List<String> directorNames) {
		this.directorNames = directorNames;
	}

	public Set<String> getBranchLocations() {
		return branchLocations;
	}

	public void setBranchLocations(Set<String> branchLocations) {
		this.branchLocations = branchLocations;
	}

	public Map<Integer, Double> getLastTenYearsProfit() {
		return lastTenYearsProfit;
	}

	public void setLastTenYearsProfit(Map<Integer, Double> lastTenYearsProfit) {
		this.lastTenYearsProfit = lastTenYearsProfit;
	}

	@Override
	public String toString() {
		return "Company [getName()=" + getName() + ", getExpansionYears()=" + Arrays.toString(getExpansionYears())
				+ ", getDirectorNames()=" + getDirectorNames() + ", getBranchLocations()=" + getBranchLocations()
				+ ", getLastTenYearsProfit()=" + getLastTenYearsProfit() + "]";
	}
	
	
	//  the above map will contain years(Integers) as keys and profits(Double) as values
	//  
	//  sample entry for above map is
	//  2008  100000.00
	
	// setters Getters
	// toString()
	
	

}
