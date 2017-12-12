import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class LoginScreen extends JFrame {

	private BankSystem bank;

	/**
	 * Create the frame.
	 */
	public LoginScreen(BankSystem bank) {
		this.bank = bank;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel northPanel = new JPanel(new GridLayout(2,1));
		JPanel labelPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JLabel lblTheNrcBank = new JLabel("The NRC Bank System");
		labelPanel.add(lblTheNrcBank);
		JPanel accountPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JButton btnCreateAccount = new JButton("Create Account");
		btnCreateAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					dispose();
					CreateAccountScreen frame = new CreateAccountScreen(bank);
					frame.setVisible(true);
			}
		});
		accountPanel.add(btnCreateAccount);
		northPanel.add(labelPanel, BorderLayout.CENTER);
		northPanel.add(accountPanel, BorderLayout.CENTER);
		
		
		JPanel midPanel = new JPanel(new GridLayout(2,2));
		JLabel label = new JLabel("Account Number: ");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		midPanel.add(label);
		JTextField accountNum = new JTextField();
		midPanel.add(accountNum);
		JLabel password = new JLabel("Password: ");
		password.setHorizontalAlignment(SwingConstants.CENTER);
		midPanel.add(password);
		JPasswordField accountKey = new JPasswordField();
		midPanel.add(accountKey);
		
		JPanel southPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JPanel loginPanel = new JPanel(new GridLayout(1,2));
		
		JButton btnCheckingLogin = new JButton("Login To Account");
		btnCheckingLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num = Integer.parseInt(accountNum.getText());
				String password = new String(accountKey.getPassword());
				if (bank.accountExists(num)) {
					Account account = bank.findAccount(num);
					if (account.passwordIsCorrect(password)) {
						dispose();
						HomeScreen frame = new HomeScreen(account, bank);
						frame.setVisible(true);
					}
					else {
						JOptionPane.showMessageDialog(null, "That is an invalid password!", "Error", JOptionPane.ERROR_MESSAGE);
						accountNum.setText("");
						accountKey.setText("");
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "That account number is not in the bank system!", "Error", JOptionPane.ERROR_MESSAGE);
					accountNum.setText("");
					accountKey.setText("");
				}
			}
		});
		loginPanel.add(btnCheckingLogin);
		southPanel.add(loginPanel);
		
		getContentPane().add(northPanel, BorderLayout.NORTH);
		getContentPane().add(midPanel, BorderLayout.CENTER);
		getContentPane().add(southPanel, BorderLayout.SOUTH);
		
		pack();
	}
}
