
public class Transaction {
	
	private float value;
	private String description;
	
	public Transaction(float val, String log) {
		value = val;
		description = log;
	}

	//Getter Methods
	public float getValue() {
		return value;
	}
	
	public String getDescription() {
		return description;
	}
}
