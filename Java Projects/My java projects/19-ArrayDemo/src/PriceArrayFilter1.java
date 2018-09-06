
public class PriceArrayFilter1 {

	public static void main(String[] args) {
		
		double prices[]=new double[]{1000.5, 3000.65, 7600.00, 2400.00, 300.00, 5300.00, 1044.00, 5100.77, 4856.87};
		
		
		//The above array variable contains the prices of various items sold
		
		// Write Code here to print the prices above 3000.00 (Use conventional for loop)
		System.out.println("the prices above 3000.00");

		for (int i = 0; i < prices.length; i++) {
			
			if(prices[i]>3000.00){
				System.out.println(prices[i]);
			}
			
		}
		System.out.println("the prices below 5000.00");
		// Write Code here to print the prices below 5000.00 (Use for each loop)
		for (double d : prices) {
			if(d<5000.00){

				System.out.println(d);
			}
		}
	}

}
