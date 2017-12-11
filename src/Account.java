import java.util.ArrayList;

public abstract class Account {
	
	private int accountNumber;
	private String accountName;
	private String accountKey;
	private ArrayList<Transaction> transactionLog;
	private double balance;
	
	
	public Account(int num, String name, String key) {
		accountNumber = num;
		accountName = name;
		accountKey = key;
		transactionLog = new ArrayList<Transaction>();
		balance = 0;
	}
	
	//Getter Methods
	public int getNumber() {
		return accountNumber;
	}
	
	public String getName() {
		return accountName;
	}
	
	public String getKey() {
		return accountKey;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public Transaction getTransaction(int i) {
		return transactionLog.get(i);
	}
	
	public ArrayList<Transaction> getTransactionLog() {
		return transactionLog;
	}
	
	//Setter Methods
	public void setName(String newName) {
		accountName = newName;
	}
	
	public void setKey(String newKey) {
		accountKey = newKey;
	}
	
	public void addTransaction(Transaction log) {
		transactionLog.add(log);
	}
	
	//Transactions
	public void withdrawMoney(double withdrawal, String description) {
		if (description.isEmpty()) {
			description = "Withdrew Money";
		}
		balance = (balance*1000 - withdrawal*1000)/1000;
		Transaction withdrawalTransaction = new Transaction(withdrawal, description);
		this.addTransaction(withdrawalTransaction);
		}
	
	public void depositMoney(double deposit, String description) {
		if (description.isEmpty()) {
			description = "Deposited Money";
		}
		balance += deposit;
		Transaction depositTransaction = new Transaction(deposit, description);
		this.addTransaction(depositTransaction);
	}

	public boolean withdrawalIsPossible(double withdrawal) {
		if (balance >= withdrawal && withdrawal > 0 && (withdrawal*100)%1==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean depositIsPossible(double deposit) {
		if (deposit>0 && ((deposit*100)%1==0)) {
			return true;
		}
		else {
			return false;
		}
	}
}
