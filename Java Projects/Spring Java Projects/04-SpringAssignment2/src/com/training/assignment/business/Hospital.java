package com.training.assignment.business;

import java.util.List;

public class Hospital {
	
	List<String> doctorNames;
	List<Double> fees;
	public List<String> getDoctorNames() {
		return doctorNames;
	}
	public void setDoctorNames(List<String> doctorNames) {
		this.doctorNames = doctorNames;
	}
	public List<Double> getFees() {
		return fees;
	}
	public void setFees(List<Double> fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Hospital [doctorNames=" + doctorNames + ", fees=" + fees + "]";
	}
	
	
	// Getters Setters
	
	// toString()
	
	

}
