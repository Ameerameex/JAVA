
public class Client {

	public static void main(String[] args) {
Doctor doctor=new Doctor();


doctor.setConsultationFee(300);
doctor.setDoctorName("suriya");
doctor.setExperienceInYears(5);
doctor.setVisitingDoctor(true);
System.out.println(doctor.doctorName);


Specialist specialist=new Specialist();
specialist.setConsultationFee(300);
specialist.setDoctorName("suriya");
specialist.setExperienceInYears(5);
specialist.setVisitingDoctor(true);
specialist.setSpecialization("heart specialist");



		
		
		
	}

}
