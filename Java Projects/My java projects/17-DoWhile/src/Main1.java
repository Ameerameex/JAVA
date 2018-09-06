import java.util.Scanner;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Main1 {

	public static void main(String[] args) {

		int choice;
		
		do{
			System.out.println("\n\n \t\t MENU");
			System.out.println("\t Add Product");
			System.out.println("\t Display Products");
			System.out.println("\t Find Products");
			System.out.println("\t Delete Products");
			System.out.println("\t\t Enter Ur Choice");
			Scanner sc=new Scanner(System.in);
			choice=sc.nextInt();


			
		}while(choice<=4);
	}

}
