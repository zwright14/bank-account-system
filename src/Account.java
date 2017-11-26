import java.util.ArrayList;

public abstract class Account {
	
	private int accountNumber;
	private String accountName;
	private String accountKey;
	private ArrayList<Transaction> transactionLog;
	protected float balance;
	
	
	public Account(int num, String name, String key) {
		accountNumber = num;
		accountName = name;
		accountKey = key;
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
	
	public float getBalance() {
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
	public void withdrawMoney(float withdrawal) {
		balance -= withdrawal;
		Transaction withdrawalTransaction = new Transaction(withdrawal, "Withdrew Money");
		this.addTransaction(withdrawalTransaction);
	}
	
	public void depositMoney(float deposit) {
		balance += deposit;
		Transaction depositTransaction = new Transaction(deposit, "Deposited Money");
		this.addTransaction(depositTransaction);
	}

}
