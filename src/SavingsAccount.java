
public class SavingsAccount extends Account {
	
	int withdrawLimit;
	
	public SavingsAccount(int num, String name, String key) {
		super(num, name, key);
		withdrawLimit = 6;
	}
	
	public int getWithdrawLimit() {
		return withdrawLimit; 
	}
	
	public void resetWithdrawalLimit() {
		withdrawLimit = 6;
	}
	
	public boolean withdrawalIsPossible(double withdrawal) {
		if (withdrawLimit>0) {
			return super.withdrawalIsPossible(withdrawal);
		}
		else {
			return false;
		}
	}
	
	public void withdrawMoney(double withdrawal, String description) {
		if (description.isEmpty()) {
			super.withdrawMoney(withdrawal, description);
			withdrawLimit -= 1;
		}
	}
}
