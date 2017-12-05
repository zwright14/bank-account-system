import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class CreateAccountScreen extends JFrame {
	
	private BankSystem bank;

	/**
	 * Create the frame.
	 */
	public CreateAccountScreen(BankSystem bank) {
		this.bank = bank;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		JPanel northPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		northPanel.add(new JLabel("Creating Account"));
		
		JPanel midPanel = new JPanel(new GridLayout(4,2));
		JLabel accountLabel = new JLabel("Account Number: ");
		accountLabel.setHorizontalAlignment(SwingConstants.CENTER);
		midPanel.add(accountLabel);
		JLabel accountNum = new JLabel(Integer.toString(bank.getAccountNum()));
		accountNum.setHorizontalAlignment(SwingConstants.CENTER);
		midPanel.add(accountNum);
		JLabel label = new JLabel("Account Type:");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		midPanel.add(label);
		String[] accountTypes = {"Checking", "Savings"};
		JComboBox accountType = new JComboBox(accountTypes);
		midPanel.add(accountType);
		JLabel label_1 = new JLabel("Account Name:");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		midPanel.add(label_1);
		JTextField accountName = new JTextField();
		midPanel.add(accountName);
		JLabel label_2 = new JLabel("Password:");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		midPanel.add(label_2);
		JPasswordField accountKey = new JPasswordField();
		midPanel.add(accountKey);
		
		JPanel southPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JButton btnCreateAccount = new JButton("Create Account");
		btnCreateAccount.setActionCommand("Create");
		btnCreateAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (accountType.getSelectedItem().equals("Savings")) {
					bank.createSavingsAccount(accountName.getText(), accountKey.getText());
					dispose();
					HomeScreen frame = new HomeScreen(bank);
					frame.setVisible(true);		
				}
				else {
					bank.createCheckingAccount(accountName.getText(), accountKey.getText());
					dispose();
					HomeScreen frame = new HomeScreen(bank);
					frame.setVisible(true);		
				}
			}
		});
		southPanel.add(btnCreateAccount);
		
		JButton btnBack = new JButton("Back");
		btnBack.setActionCommand("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					dispose();
					HomeScreen frame = new HomeScreen(bank);
					frame.setVisible(true);
				}
		});
		southPanel.add(btnBack);
		
		getContentPane().add(northPanel, BorderLayout.NORTH);
		getContentPane().add(midPanel, BorderLayout.CENTER);
		getContentPane().add(southPanel, BorderLayout.SOUTH);
		
		pack();
	}	
}