import java.awt.EventQueue;

public class BankInterface {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		BankSystem bank = new BankSystem();
		HomeScreen frame = new HomeScreen(bank);
		frame.setVisible(true);
		
	}

}
