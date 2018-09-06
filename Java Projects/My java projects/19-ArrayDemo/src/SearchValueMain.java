import java.util.Scanner;

public class SearchValueMain {

	public static void main(String[] args) {

		long[] idValues = { 1001, 1002, 1004, 1005, 1006, 1008, 1009, 1010 };

		int i=0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("\n\n");
		System.out.print("\t");

		int searchId;
		System.out.print("Enter ID value to Search : ");
		// Write code here to take input value from the user for searchId
		// variable
searchId=scanner.nextInt();
		boolean found = false;

		
		/*
		 * Write code here to check if the searchId value exists in the array.
		 * If the value exists in the array change the found variable value to
		 * true and exit the loop
		 */
		for ( i = 0; i < idValues.length; i++) {
			
			if(idValues[i]==searchId){
				found=true;
				break;
			}
			
			
		}
		if(found==true){
			System.out.println("index number :"+i);
		}
		// Write code here to print if the searchId value is found or not.
		// if found is true, Write code here to print the index position, where it is found.
		

	}

}
