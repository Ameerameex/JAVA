
public class ConsultationFeesClient {

	public static void main(String[] args) {

		ConsultationFees consultationFees=new ConsultationFees();
		consultationFees.feesPerHour=1000.00;
		consultationFees.minutes=140;
		System.out.println(consultationFees.computeFeesPerMinute());
		System.out.println(consultationFees.getChargableFees());
		ConsultationFees consultationFees2=new ConsultationFees();
		consultationFees2.feesPerHour=2000.00;
		consultationFees2.minutes=140;
		System.out.println(consultationFees2.computeFeesPerMinute());
		System.out.println(consultationFees2.getChargableFees());
		
	}

}
