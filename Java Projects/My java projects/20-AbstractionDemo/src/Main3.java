import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int number1,number2;
		int choice=0;
		int result;
		Menuhandler menuhandler=new Menuhandler();
		
		
		switch (choice) {
		case 1:
			System.out.print("\t\t Number 1 : ");
			number1=scanner.nextInt();
			System.out.print("\t\t Number 2 : ");
			number2=scanner.nextInt();
			result=number1+number2;
			System.out.println("\n\t\t The Sum is "+ result);
			break;

		case 2:
			System.out.print("\t\t Number 1 : ");
			number1=scanner.nextInt();
			System.out.print("\t\t Number 2 : ");
			number2=scanner.nextInt();
			result=number1-number2;
			System.out.println("\n\t\t The Difference is "+ result);
			break;

		case 3:
			System.out.print("\t\t Number 1 : ");
			number1=scanner.nextInt();
			System.out.print("\t\t Number 2 : ");
			number2=scanner.nextInt();
			result=number1*number2;
			System.out.println("\n\t\t The Product is "+ result);
			break;

		case 4:
			System.out.print("\t\t Number 1 : ");
			number1=scanner.nextInt();
			System.out.print("\t\t Number 2 : ");
			number2=scanner.nextInt();
			result=number1/number2;
			System.out.println("\n\t\t The Quotient is "+ result);
			break;

			
		default:
			System.out.println("\n\t\t Invalid Choice !!!");
			break;
		}
	}

}
