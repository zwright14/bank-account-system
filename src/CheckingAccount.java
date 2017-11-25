
public class CheckingAccount extends Account {
	
	public CheckingAccount(int num, String name, String key) {
		super(num, name, key);
	}
	
	public void sendCheck(float amount, Account otherAccount) {
		this.withdrawMoney(amount);
		otherAccount.depositMoney(amount);
	}
}
	