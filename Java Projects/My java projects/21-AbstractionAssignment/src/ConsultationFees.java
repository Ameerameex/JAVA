
public class ConsultationFees {
	
	double feesPerHour;
	int minutes;
	
	
	double computeFeesPerMinute(){
		return feesPerHour/60;
	}
	
	double getChargableFees(){
		double value=minutes*computeFeesPerMinute();
		return value;
	}

}
