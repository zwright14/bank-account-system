import java.util.ArrayList;

public class BankSystem {
	ArrayList<Account> bankAccounts;
	int accountNum; //next created account number
	
	public BankSystem() {
		accountNum = 1;
		bankAccounts = new ArrayList<Account>();
	}
	
	//getters
	public int getAccountNum() {
		return accountNum;
	}
	
	//create accounts
	public void createSavingsAccount(String name, String key) {
		SavingsAccount newAccount = new SavingsAccount(accountNum, name, key);
		bankAccounts.add(newAccount);
		accountNum++;	
	}
	
	public void createCheckingAccount(String name, String key) {
		CheckingAccount newAccount = new CheckingAccount(accountNum, name, key);
		bankAccounts.add(newAccount);
		accountNum++;
	}
	
	//check for an account
	public boolean accountExists(int accountNum) {
		for (Account account:bankAccounts) {
			if (account.getNumber() == accountNum) {
				return true;
			}
		}
		return false;
	}
	
	//find an account
	public Account findAccount(int num) {
		for (Account account:bankAccounts) {
			if (account.getNumber() == num) {
				return account;
			}
		}
		return null;
	}
}
	
