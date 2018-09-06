
public class Main5 {

	public static void main(String[] args) {
		int number = 5876;
		int rev = 0;
		int temp = number;
		while (number != 0) {

			rev = (rev * 10) + number % 10;
			number = number / 10;

		}
		if (temp == rev) {
			System.out.println("It is palindrome");

		} else
			System.out.println("It is not palindrome");

	}

}
