
public class SavingsAccount extends Account {
	
	int withdrawLimit;
	
	public SavingsAccount(int num, String name, String key) {
		super(num, name, key);
		withdrawLimit=6;
	}
	
	public int getWithdrawLimit() {
		return withdrawLimit; 
	}
	
	public void withdrawMoney(float withdrawal) {
		if (withdrawLimit > 0) {
			balance -= withdrawal;
			withdrawLimit -= 1;
			Transaction withdrawalTransaction = new Transaction(withdrawal, "Withdrew Money");
			this.addTransaction(withdrawalTransaction);
		}
		if (withdrawLimit == 0) {
			System.out.println("ERROR: No more withdrawals allowed.");
			return null;
		}
	}
	
	public void resetLimit() {
		withdrawLimit = 6;
	}
}
