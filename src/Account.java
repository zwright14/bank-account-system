
public abstract class Account {
	
	private int accountNumber;
	private String accountName;
	private String accountKey;
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
	
	//Setter Methods
	public void setName(String newName) {
		accountName = newName;
	}
	
	public void setKey(String newKey) {
		accountKey = newKey;
	}
	
	//Transactions
	public void withdrawMoney(float withdrawal) {
		balance -= withdrawal;
	}
	
	public void depositMoney(float deposit) {
		balance += deposit;
	}

}
