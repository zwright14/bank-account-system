import java.awt.EventQueue;

public class BankInterface {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		BankSystem bank = new BankSystem();
		bank.createCheckingAccount("Zach", "Zach"); //Account number 1
		bank.createSavingsAccount("Romeo", "Romeo"); //Account number 2
		bank.createCheckingAccount("Nathan", "Nathan"); //Account number 3
		HomeScreen frame = new HomeScreen(bank);
		frame.setVisible(true);
		
	}

}
