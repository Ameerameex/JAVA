import java.util.Scanner;

public class MonthlyAttendanceClient {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		MonthlyAttendance attendance=new MonthlyAttendance();
		
		
		MonthlyAttendance.salaryPerday=900;
		MonthlyAttendance.salaryperhour=100;
		System.out.println("Enter the casual leave  days");
		attendance.setCasualLeaveDays(scanner.nextInt());
		System.out.println("Enter the Medical leave  days");
		attendance.setMedicalLeave(scanner.nextInt());
		
		attendance.setTotalWorkingDays(26);
		
		
		
System.out.println(attendance.getNetPayableSalary());
System.out.println(attendance.getNetPayableSalary1(10));


	}

}
