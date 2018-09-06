import java.util.Scanner;

public class Program3 {

	static long factorial(int n) {

	if(n==1){
		return 1;
	}
	else
		
		return n*factorial(n-1);
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("\n\n\t Enter Number : ");
		int n = scanner.nextInt();
		long r = factorial(n);
		System.out.println(r);

	}

}
