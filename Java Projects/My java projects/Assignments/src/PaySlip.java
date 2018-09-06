import java.util.Scanner;

public class PaySlip {

	public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
		
		int id; 
		String name;
		double basicSalaryPerDay=800.00;
		float hraPercentage,pfPercentage;
		int noOfworkingDays; int leaveDays;
		System.out.println("enter the id");
		id=scanner.nextInt();
		System.out.println("enter the name");

		name=scanner.next();
		System.out.println("enter the hrapercentage");

		hraPercentage=scanner.nextFloat();
		System.out.println("enter the pfpercentage");

		pfPercentage=scanner.nextFloat();
		System.out.println("enter the no of workingdays");

		noOfworkingDays=scanner.nextInt();
		System.out.println("enter the leave days");

		leaveDays=scanner.nextInt();
		
		// Write code to initialze above variables with input values from user
		
		// Fill the following code to display the values
		
		System.out.println("ID \t\t\t :" + id);
		System.out.println("Name \t\t\t :"+ name);
		System.out.println("basicSalaryPerDay \t\t\t :"+ basicSalaryPerDay);
		System.out.println("hraPercentage \t\t\t :"+ hraPercentage);
		System.out.println("hraAmount \t\t\t :"+ hraPercentage/100*basicSalaryPerDay*noOfworkingDays);

		System.out.println("pfPercentage \t\t\t :"+ pfPercentage);
		System.out.println("pfAmount \t\t\t :"+ pfPercentage/100*basicSalaryPerDay*noOfworkingDays);

		System.out.println("noOfworkingDays \t\t\t :"+ noOfworkingDays);
		System.out.println("leaveDays \t\t\t :"+ leaveDays);

		//Write the code here to print other details in payslip format
		
	}

}
