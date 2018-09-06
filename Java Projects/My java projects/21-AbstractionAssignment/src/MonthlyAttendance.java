
public class MonthlyAttendance {

	private int totalWorkingDays;
	private int casualLeaveDays, medicalLeave;
	int extraHoursWorked;
	static int salaryPerday;
	static int salaryperhour;

	int getTotalWorkingDays() {
		return totalWorkingDays;
	}

	void setTotalWorkingDays(int totalWorkingDays) {
		this.totalWorkingDays = totalWorkingDays;
		this.totalWorkingDays=this.totalWorkingDays-(getCasualLeaveDays() + getMedicalLeave());
	}

	int getCasualLeaveDays() {
		return casualLeaveDays;
	}

	void setCasualLeaveDays(int casualLeaveDays) {
		this.casualLeaveDays = casualLeaveDays;
	}

	int getMedicalLeave() {
		return medicalLeave;
	}

	void setMedicalLeave(int medicalLeave) {
		this.medicalLeave = medicalLeave;
	}

	double getNetPayableSalary() {

		 
		double netSalary = (getTotalWorkingDays() * salaryPerday);
		
		return netSalary;
	}

double getNetPayableSalary1(int extraHoursWorked){
	this.extraHoursWorked=extraHoursWorked;
	double netSalary1=(getTotalWorkingDays() * salaryPerday)+(this.extraHoursWorked*salaryperhour);
	
	
		return netSalary1;
	}

}
