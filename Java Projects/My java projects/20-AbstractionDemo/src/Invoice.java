import org.omg.Messaging.SyncScopeHelper;

public class Invoice {

	String[] productNames = { "Infocus Vision3", "Micromax Video1", "Vivo V7", "LG Q6", "Gionee A1" };
	double[] prices = { 6999.00, 6273.00, 16900.00, 11490.00, 11647.00 };
	int[] quantities = { 3, 2, 1, 2, 5 };
	boolean[] hasDiscount={true, false,false, true, true};
	
	boolean hasValidData() {
		
		int namesLength=productNames.length;
		if(namesLength==prices.length&&namesLength==quantities.length&&namesLength==hasDiscount.length)
			return true;

		return false;
	}
	
	void printInvoice(){
		System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s\n","slno","Name","price","qty","value","discount" );
		System.out.println("--------------------------------------------");
		
		for(int i=0;i<productNames.length;i++){
			
			double	d1=prices[i]*quantities[i];
			double total=0.0;
			
			if(hasDiscount[i]==true){
			double	disc=d1*10.0/100.0;
				total=disc;
			}
			System.out.printf("%-3d %-20s %8.2f %3d %8.2f %8.2f\n" ,i+1,productNames[i],prices[i],quantities[i],d1,total);
		}
		System.out.println("------------------------------------------------------");
		System.out.println("Total : " + getTotal());
		System.out.println("Discount : "+ getTotalDiscount());
		
	}
	
	void printItem(int index){
		
	}
		
	
	
	double getTotal(){
		double d=0.0;
		for(int i=0;i<productNames.length;i++){
			
		double	d1=prices[i]*quantities[i];
		d=d+d1;
		}
		
		return d;
	}
	
	double getTotalDiscount(){
		
		double total=0.0;
		for(int i=0;i<productNames.length;i++){

			double	d1=prices[i]*quantities[i];
			
			if(hasDiscount[i]==true){
				 double disc=d1*10.0/100.0;
				total=total+disc;
			}
		}
		return total;
	
	}
	
	
	

}

