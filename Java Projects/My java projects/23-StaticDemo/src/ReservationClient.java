
public class ReservationClient {

	public static void main(String[] args) {

		ReservationData data=new ReservationData();
		
		ReservationData data2=new ReservationData();
		
		ReservationData.busOperator="SRM";
		
		ReservationData.ticketPricePerSeat=500;
		
		System.out.println(ReservationData.busOperator);
		System.out.println(ReservationData.ticketPricePerSeat);
		
		System.out.println(data.getPassengerName(33));
		System.out.println(data.isFemale(33));
		
		System.out.println(data.getFemaleCount());
		System.out.println(data.getTotalAmount());
	ReservationData.busOperator="YBM";
		
		ReservationData.ticketPricePerSeat=700;
		
		System.out.println(ReservationData.busOperator);
		System.out.println(ReservationData.ticketPricePerSeat);
		
		System.out.println(data2.getPassengerName(36));
		System.out.println(data2.isFemale(36));
		
		System.out.println(data2.getFemaleCount());
		System.out.println(data2.getTotalAmount());
		
		
		
	}

}
