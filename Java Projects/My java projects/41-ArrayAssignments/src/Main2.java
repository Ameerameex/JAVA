
public class Main2 {
	static double getTotal(Account... allAccounts) {
		double sum = 0;
		for (Account account : allAccounts) {

			sum += account.getBalance();

		}
		return sum;
	}

	static double getAverage(Account... allAccounts) {
		double avg = 0;
		avg = getTotal(allAccounts) / allAccounts.length;
		return avg;
	}

	static String getMinimum(Account... allAccounts) {
		double min = allAccounts[0].getBalance();
		String Name = "";
		for (Account account : allAccounts) {

			if (min > account.getBalance()) {

				min = account.getBalance();

			}

		}
		for (int i = 0; i < allAccounts.length; i++) {

			if (min == allAccounts[i].getBalance()) {

				Name = allAccounts[i].getCustomerName();
			}
		}

		return Name + " " + min;

	}

	static String getMaximum(Account... allAccounts) {
		double max = allAccounts[0].getBalance();
		String Name = "";

		for (Account account : allAccounts) {

			if (max < account.getBalance()) {

				max = account.getBalance();
			}
		}
		for (int i = 0; i < allAccounts.length; i++) {

			if (max == allAccounts[i].getBalance()) {
				Name = allAccounts[i].getCustomerName();
			}
		}
		return Name + " " + max;

	}

	public static void main(String[] args) {

		Account[] accounts;

		accounts = new Account[4];
		accounts[0] = new Account("Suriya", 100.00);
		accounts[1] = new Account("Ameer", 200.00);
		accounts[2] = new Account("Dhoni", 400.00);
		accounts[3] = new Account("Virat", 300.00);

		System.out.println("Total Amount : " + getTotal(accounts));
		System.out.println("Average : " + getAverage(accounts));
		System.out.println("Maximum balance :" + getMaximum(accounts));
		System.out.println("Minimum balance : " + getMinimum(accounts));
	}
	

}
