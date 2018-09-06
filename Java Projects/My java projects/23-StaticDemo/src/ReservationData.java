
public class ReservationData {

	int[] seatNos = { 31, 32, 33, 34, 35, 36, 37, 38, 39, 40 };
	String[] passengerNames = { "John", null, "Abirami", null, "Dinesh", "Pranav", null, "Abinaya", "Smitha", "Karthik" };
	boolean[] isFemalePassengers = { false, false, true, false, true, true, false, true, true, false };
static double ticketPricePerSeat;
static String busOperator;

	String getPassengerName(int seatNo) {
		String name = null;
		boolean found=false;
		int foundPosition=0;
		for(int i=0; i< seatNos.length; i++){
			if(seatNos[i]==seatNo){
				found=true;
				foundPosition=i;
				break;
			}
		}
		if(found)
			name=passengerNames[foundPosition];
		
		return name;
	}

	double getTotalAmount() {
		double sum = 0.0;
		for (int i = 0; i < passengerNames.length; i++) {
			if(passengerNames[i]!=null){
				sum+=ticketPricePerSeat;
			}
		}
		return sum;
	}

	int getFemaleCount() {
		int count=0;
		for(int i=0; i< isFemalePassengers.length ; i++){
			if(isFemalePassengers[i]==true)
				count++;
		}
		return count;
	}

	boolean isFemale(int seatNo) {
		boolean found=false;
		int foundPosition=0;
		for(int i=0; i< seatNos.length; i++){
			if(seatNos[i]==seatNo){
				found=true;
				foundPosition=i;
				break;
			}
		}
		boolean isFemale=false;
		if(found)
			isFemale=isFemalePassengers[foundPosition];
		return isFemale;
	}

}
