
public class Doctor {
	
	protected String doctorName;
	private double consultationFee;
	
	private int experienceInYears;
	private boolean visitingDoctor;
	
	Doctor() {
		super();
	}
	String getDoctorName() {
		return doctorName;
	}
	void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	double getConsultationFee() {
		if(visitingDoctor==true){
			return consultationFee+300;
		}
		return consultationFee;
	}
	void setConsultationFee(double consultationFee) {
		this.consultationFee = consultationFee;
	}
	int getExperienceInYears() {
		return experienceInYears;
	}
	void setExperienceInYears(int experienceInYears) {
		this.experienceInYears = experienceInYears;
	}
	boolean isVisitingDoctor() {
		return visitingDoctor;
	}
	void setVisitingDoctor(boolean visitingDoctor) {
		this.visitingDoctor = visitingDoctor;
	}
		
	
	

}
