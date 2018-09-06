import java.util.Scanner;

public class Program1 {
	
  static	void printNumber(int number){
		System.out.println("The number is " + number);
	}
	
	static int square(int number){
		System.out.println("This is square function");
		return number*number;
	}

	public static void main(String[] args) {
		
		
		printNumber(25);
	int res=square(25);
		System.out.println(res);
		
		System.out.println(square(25));
		int res1=10+square(20);
		System.out.println(res);

	}

}
