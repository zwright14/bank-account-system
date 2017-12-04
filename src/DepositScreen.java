import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;

public class DepositScreen extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DepositScreen frame = new DepositScreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DepositScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWithdrawMoney = new JLabel("Deposit Money");
		lblWithdrawMoney.setBounds(167, 6, 109, 16);
		contentPane.add(lblWithdrawMoney);
		
		JButton btn5Dollars = new JButton("$5");
		btn5Dollars.setBounds(40, 60, 117, 29);
		contentPane.add(btn5Dollars);
		
		JButton btn10Dollars = new JButton("$10");
		btn10Dollars.setBounds(40, 101, 117, 29);
		contentPane.add(btn10Dollars);
		
		JButton btn20Dollars = new JButton("$20");
		btn20Dollars.setBounds(40, 142, 117, 29);
		contentPane.add(btn20Dollars);
		
		JButton btn50Dollars = new JButton("$50");
		btn50Dollars.setBounds(287, 60, 117, 29);
		contentPane.add(btn50Dollars);
		
		JButton btn100Dollars = new JButton("$100");
		btn100Dollars.setBounds(287, 101, 117, 29);
		contentPane.add(btn100Dollars);
		
		JButton btnEnterButton = new JButton("Enter");
		btnEnterButton.setBounds(287, 205, 117, 29);
		contentPane.add(btnEnterButton);
		
		JButton btn1000Dollars = new JButton("$1000");
		btn1000Dollars.setBounds(287, 142, 117, 29);
		contentPane.add(btn1000Dollars);
		
		JFormattedTextField formattedTextField = new JFormattedTextField("Enter an Amount:");
		formattedTextField.setHorizontalAlignment(SwingConstants.CENTER);
		formattedTextField.setBounds(40, 205, 236, 26);
		contentPane.add(formattedTextField);
	}
}
