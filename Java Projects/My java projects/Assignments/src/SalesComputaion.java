import java.util.Scanner;

public class SalesComputaion {

	public static void main(String[] args) {
		String productName;
		int quantity;
		float price;
		float discountPercentage;
		float discountAmount;
		Scanner scanner=new Scanner(System.in);

		System.out.print("Enter Product Name : \t");
		// Input statement for productName here
		productName=scanner.next();
		
		System.out.print("Enter Product Price : \t");
		// Input statement for Price here
		price=scanner.nextFloat();
		
		
		System.out.print("Enter Quantity : \t");
		// Input statement for quantity here
		quantity=scanner.nextInt();
		
		//initialze discountPercentage as per following specification
		
		/*
		 * quantity <=10 discountPercentage : 0.0 %
		 * quantity 11-50 discountPercentage : 3.0 %
		 * quantity 51-100 discountPercentage : 6.0 %
		 * quantity >100 discountPercentage : 10.0 %
		 */
		
		if (quantity<=10) {
			
			discountPercentage=0.0f;
			
		}
		else if (quantity<=50) {
		
			discountPercentage=3.0f;
		}
		else if (quantity<=100) {
			discountPercentage=6.0f;
			
		}
		else
			discountPercentage=10.0f;
		// Write code here to compute discountAmount
		discountAmount=price*quantity*(discountPercentage/100);
		
		// Write Code here tp print the values of variables
		System.out.println("discountAmount: "+ discountAmount);
		
	}

}
