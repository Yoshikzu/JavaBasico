
public class Account {
	private String accountNumber;
	private String accountHolder;
	private double balance;
	
	public Account(String accountNumber, String accountHolder) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
		
	public String getAccountHolder() {
		return accountHolder;
	}
	
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void deposit(double value) {
		this.balance += value;
	}
	
	public void withdaw(double value) {
		this.balance -= (value + 5.0); 		
	}

	@Override
	public String toString() {
		return "Account Data:\n" +
			   "Account: " + accountNumber + ",Holder: " + accountHolder + ", balance: $" + balance;
	
	}
	

}
