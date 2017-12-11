import java.util.ArrayList;

public class BankSystem {
	ArrayList<CheckingAccount> checkingAccounts;
	ArrayList<SavingsAccount> savingsAccounts;
	int accountNum;
	
	public BankSystem() {
		accountNum = 1;
		checkingAccounts = new ArrayList<CheckingAccount>();
		savingsAccounts = new ArrayList<SavingsAccount>();
	}
	
	//getters
	public int getAccountNum() {
		return accountNum;
	}
	
	//create accounts
	public void createSavingsAccount(String name, String key) {
		SavingsAccount newAccount = new SavingsAccount(accountNum, name, key);
		savingsAccounts.add(newAccount);
		accountNum++;	
	}
	
	public void createCheckingAccount(String name, String key) {
		CheckingAccount newAccount = new CheckingAccount(accountNum, name, key);
		checkingAccounts.add(newAccount);
		accountNum++;
	}
	
	//login to accounts
	public CheckingAccount loginToChecking(int num, String key) {
		for (CheckingAccount account:checkingAccounts) {
			if (account.getNumber() == num) {
				if (key.equals(account.getKey())) {
					return account;
				}
			}
		}
		return null;
	}
	
	public SavingsAccount loginToSavings(int num, String key) {
		for (SavingsAccount account:savingsAccounts) {
			if (account.getNumber() == num) {
				if (key.equals(account.getKey())) {
					return account;
				}
			}
		}
		return null;
	}

	//check for accounts
	public boolean savingsAccountExist(int num, String key) {
		for (Account account:savingsAccounts) {
			if (account.getNumber() == num) {
				if (key.equals(account.getKey())) {
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean checkingAccountExists(int num, String key) {
		for (Account account:checkingAccounts) {
			if (account.getNumber() == num) {
				if (key.equals(account.getKey())) {
					return true;
				}
			}
		}
		return false;
	}
	
}
	
