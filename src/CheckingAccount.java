
public class CheckingAccount extends Account {
	
	public CheckingAccount(int num, String name, String key) {
		super(num, name, key);
	}
	
	public void sendCheck(double amount, Account account) {
		Account otherAccount = account;
		this.withdrawMoney(amount, "Sent Check To: " + otherAccount.getName());
		otherAccount.depositMoney(amount, "Received Check From: " + this.getName());
	}	
	
	public void payBill(String bill) {
		if (bill == "Mortgage") {
			if (this.withdrawalIsPossible(1000)) {
				this.withdrawMoney(1000, "Paid Mortgage");
			}
		} else if (bill == "Water Bill") {
			if (this.withdrawalIsPossible(150)) {
				this.withdrawMoney(150, "Paid Water Bill");
			}
		} else if (bill == "Phone Bill") {
			if (this.withdrawalIsPossible(75)) {
				this.withdrawMoney(75, "Paid Phone Bill");
			}
		} else if (bill == "Credit Card") {
			if (this.withdrawalIsPossible(1750)) {
				this.withdrawMoney(1750, "Paid Credit Card Bill");
			}
		} else if (bill == "Groceries") {
			if (this.withdrawalIsPossible(125)) {
				this.withdrawMoney(125, "Paid for Groceries");
			}
		} else if (bill == "Electric Bill") {
			if (this.withdrawalIsPossible(250)) {
				this.withdrawMoney(250, "Paid Electric Bill");
			}
		}
	}
}