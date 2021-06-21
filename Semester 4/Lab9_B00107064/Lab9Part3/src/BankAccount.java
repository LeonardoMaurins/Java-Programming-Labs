
public class BankAccount {

	protected int balance;
	
	public BankAccount(int balance) {
		this.balance = balance;
	}
	
	public synchronized int getBalance() {
		return balance;
	}
	
	public synchronized int makeWithdrawal(int withdrawAmount) {
		return balance -= withdrawAmount;
	}
}
