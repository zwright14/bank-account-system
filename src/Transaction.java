
public class Transaction {
	
	private double value;
	private String description;
	
	public Transaction(double val, String log) {
		value = val;
		description = log;
	}

	//Getter Methods
	public double getValue() {
		return value;
	}
	
	public String getDescription() {
		return description;
	}
	
	//Print Transaction
	public String toString() {
		if (value>=0) {
			return "$" + value + description;
		}
		else {
			return "-$" + Math.abs(value) + description;
		}
	}
}