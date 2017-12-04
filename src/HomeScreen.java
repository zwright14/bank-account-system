import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class HomeScreen extends JFrame {

	private BankSystem bank;

	/**
	 * Create the frame.
	 */
	public HomeScreen(BankSystem bank) {
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
		midPanel.add(new JLabel("Account Number: "));
		JTextField accountNum = new JTextField();
		midPanel.add(accountNum);
		midPanel.add(new JLabel("Password: "));
		JPasswordField accountKey = new JPasswordField();
		midPanel.add(accountKey);
		
		JPanel southPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JPanel loginPanel = new JPanel(new GridLayout(1,2));
		
		JButton btnCheckingLogin = new JButton("Login To Checking Account");
		btnCheckingLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Account account = bank.loginToChecking(Integer.parseInt(accountNum.getText()), accountKey.getText());
				LoginScreen frame = new LoginScreen(account);
				frame.setVisible(true);
			}
		});
		loginPanel.add(btnCheckingLogin);
		
		JButton btnSavingsLogin = new JButton("Login To Savings Account");
		btnSavingsLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Account account = bank.loginToSavings(Integer.parseInt(accountNum.getText()), accountKey.getText());
				LoginScreen frame = new LoginScreen(account);
				frame.setVisible(true);
			}
		});
		loginPanel.add(btnSavingsLogin);
		southPanel.add(loginPanel);
		
		add(northPanel, BorderLayout.NORTH);
		add(midPanel, BorderLayout.CENTER);
		add(southPanel, BorderLayout.SOUTH);
		
		pack();
		
		/*contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(168, 186, 117, 29);
		btnLogin.setActionCommand("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Account checkAccount = bank.loginToChecking(Integer.parseInt(accountNum.getText()), accountKey.getText());
				LoginScreen frame = new LoginScreen(checkAccount);
				frame.setVisible(true);
			}
		});
		contentPane.add(btnLogin);
		
		JButton btnCreateAccount = new JButton("Create Account");
		btnCreateAccount.setBounds(157, 227, 140, 29);
		btnCreateAccount.setActionCommand("Create");
		btnCreateAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					dispose();
					CreateAccountScreen frame = new CreateAccountScreen(bank);
					frame.setVisible(true);
			}
		});
		contentPane.add(btnCreateAccount);
		
		accountNum = new JTextField();
		accountNum.setBounds(155, 95, 130, 26);
		contentPane.add(accountNum);
		accountNum.setColumns(10);
		
		accountKey = new JPasswordField();
		accountKey.setBounds(155, 133, 130, 26);
		contentPane.add(accountKey);
		accountKey.setColumns(10);
		
		JLabel lblAccountNumber = new JLabel("Account Number");
		lblAccountNumber.setBounds(35, 100, 108, 16);
		contentPane.add(lblAccountNumber);
		
		JLabel lblPasswordOrKey = new JLabel("Password or Key");
		lblPasswordOrKey.setBounds(35, 138, 108, 16);
		contentPane.add(lblPasswordOrKey);
		
		JLabel lblTheNrcBank = new JLabel("The NRC Bank System");
		lblTheNrcBank.setBounds(144, 38, 141, 29);
		contentPane.add(lblTheNrcBank);
	}*/
	}
}
