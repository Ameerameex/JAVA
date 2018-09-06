import java.util.Scanner;

public class InputElements {

	public static void main(String[] args) {
		// This is a program to demonstrate the use of array
		// of dynamic size and dynamic values for elements

		Scanner scanner = new Scanner(System.in);

		System.out.println("\n\n");
		System.out.print("\t");

		int countOfInputs;
		System.out.print("How many values you want to Input ? ");
		countOfInputs = scanner.nextInt();
		if (countOfInputs <= 0) {
			System.out.println("Invalid Input value - Input value should be a positive number");
			System.out.println("Please Try Again...!!!");
		} else {

			int[] values = new int[countOfInputs];

			for (int i = 0; i < values.length; i++) {
				
				
					
					values[i]=scanner.nextInt();
					
				

				System.out.print("\t Enter value for element at position " + i + " :"+values[i]);
				// insert your code to initialize element in position i with a
				// value input by the user

			}

			int sum = 0;
			

			/*
			 * write code here to compute the sum of the elements in the array
			 * 
			 */
			for (int i = 0; i < values.length; i++) {
				
				
				sum+=values[i];
			}
            System.out.println();
			System.out.println("The sum of the values : " + sum);

		}
	}

}
