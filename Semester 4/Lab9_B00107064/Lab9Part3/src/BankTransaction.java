
public class BankTransaction extends Thread{

		private static BankAccount _BankAccount = new BankAccount(10000);
	
	public void run() {
		_BankAccount.makeWithdrawal(10);
		System.out.println("Thread name: " + super.getName() + ". Balance: " + _BankAccount.getBalance());
	}
}
