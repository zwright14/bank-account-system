
public class CheckingAccount extends Account {
	
	public CheckingAccount(int num, String name, String key) {
		super(num, name, key);
	}
	
	public void sendCheck(float amount, Account otherAccount) {
		this.withdrawMoney(amount);
		otherAccount.depositMoney(amount);
		Transaction sendTransaction = new Transaction(amount, "Sent Check To: " + otherAccount.getName());
		this.addTransaction(sendTransaction);
		Transaction receiveTransaction = new Transaction(amount, "Received Check From: " + this.getName());
		otherAccount.addTransaction(receiveTransaction);
	}
}
	