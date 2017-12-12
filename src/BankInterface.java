import java.awt.EventQueue;

public class BankInterface {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		BankSystem bank = new BankSystem();
		bank.createCheckingAccount("Zach", "Zach");
		bank.createSavingsAccount("Romeo", "Romeo");
		bank.createCheckingAccount("Nathan", "Nathan");
		HomeScreen frame = new HomeScreen(bank);
		frame.setVisible(true);
		
	}

}
