
public class Account {

	private String customerName;
	private double balance;
	public Account(String customerName, double balance) {
		super();
		this.customerName = customerName;
		this.balance = balance;
	}
	public final String getCustomerName() {
		return customerName;
	}
	public final void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public final double getBalance() {
		return balance;
	}
	public final void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
}
