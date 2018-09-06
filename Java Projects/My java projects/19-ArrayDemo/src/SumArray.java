
public class SumArray {

	public static void main(String[] args) {
		
		int[] quantities = { 10, 4, 5, 6, 8, 9, 14, 17, 34 };
		int sum=0;
		
		// Write code to compute the sum of above array elements (Use for loop to traverse the array)

		for (int i = 0; i < quantities.length; i++) {
			
			sum+=quantities[i];
			
		}
		// Write code here to print the computed sum
		   System.out.println("sum  :"+sum);
		
	}

}
