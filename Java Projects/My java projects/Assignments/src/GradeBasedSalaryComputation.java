import java.util.Scanner;

public class GradeBasedSalaryComputation {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		double basicSalary;
		float hraPercentage=0.0f,pfPercentage=0.0f;
		double netSalary;
		char grade;
		
		System.out.print("Basic Salary :\t\t");
		// Input Statement for basicSalary
		basicSalary=sc.nextDouble();
		
		System.out.print("grade :\t\t");
		// Input Statement for grade
		grade=sc.next().charAt(0);
		
		//initialze discountPercentage as per following specification
		
				/*
				 * grade ='A' hraPercentage is 25.0% pfPercentage is 17.0%
				 * grade ='B' hraPercentage is 21.0% pfPercentage is 13.0%
				 * grade ='C' hraPercentage is 18.0% pfPercentage is 12.0%				 
		 		 * grade ='D' hraPercentage is 15.0% pfPercentage is 11.0%
		 		 */
		switch (grade) {
		case 'A':hraPercentage=25.0f;
		pfPercentage=17.0f;
		
			
			break;
			
case 'B' :hraPercentage=21.0f;
pfPercentage=13.0f;
break;
case 'C' :hraPercentage=18.0f;
pfPercentage=12.0f;
break;
case 'D' :hraPercentage=15.0f;
pfPercentage=11.0f;
break;
		default:System.out.println("enter the valid grade");
			break;
		}
				// Write code here to compute netSalary
		netSalary=basicSalary+(hraPercentage*basicSalary)-(pfPercentage*basicSalary);
		System.out.println(netSalary);
				
				// Write Code here tp print the values of variables

	}

}
