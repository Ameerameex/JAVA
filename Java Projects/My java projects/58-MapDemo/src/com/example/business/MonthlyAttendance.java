package com.example.business;

public class MonthlyAttendance {
	
	private int numberOfWorkingDays;
	private int casualLeave;
	private int medicalLeave;
	
	public MonthlyAttendance(int numberOfWorkingDays, int casualLeave, int medicalLeave) {
		super();
		this.numberOfWorkingDays = numberOfWorkingDays;
		this.casualLeave = casualLeave;
		this.medicalLeave = medicalLeave;
	}
	
	

	public int getNumberOfWorkingDays() {
		return numberOfWorkingDays;
	}



	public void setNumberOfWorkingDays(int numberOfWorkingDays) {
		this.numberOfWorkingDays = numberOfWorkingDays;
	}



	public int getCasualLeave() {
		return casualLeave;
	}



	public void setCasualLeave(int casualLeave) {
		this.casualLeave = casualLeave;
	}



	public int getMedicalLeave() {
		return medicalLeave;
	}



	public void setMedicalLeave(int medicalLeave) {
		this.medicalLeave = medicalLeave;
	}



	@Override
	public String toString() {
		return "MonthlyAttendance [numberOfWorkingDays=" + numberOfWorkingDays + ", casualLeave=" + casualLeave
				+ ", medicalLeave=" + medicalLeave + "]";
	}
	
	

}
