
public class SavingsAccount extends Account {
	
	int withdrawLimit;
	
	public SavingsAccount(int num, String name, String key) {
		super(num, name, key);
		withdrawLimit = 6;
	}
	//withdrawal limit getter (like in real savings accounts) 
	public int getWithdrawLimit() {
		return withdrawLimit; 
	}
	//resets the withdrawal limit so you can continue to withdraw
	public void resetWithdrawalLimit() {
		withdrawLimit = 6;
	}
	//checks withdraw 
	public boolean withdrawalIsPossible(double withdrawal) {
		if (withdrawLimit>0) {
			return super.withdrawalIsPossible(withdrawal);
		}
		else {
			return false;
		}
	}
	//withdraw from account class 
	public void withdrawMoney(double withdrawal, String description) {
		if (description.isEmpty()) {
			super.withdrawMoney(withdrawal, description);
			withdrawLimit -= 1;
		}
	}
}
