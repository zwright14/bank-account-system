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
	 * takes a BankSystem so it holds the same BankSystem through all screens
	 */
	public CreateAccountScreen(BankSystem bank) {
		//set bank
		this.bank = bank;
		//set window conditions
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		//create a upper panel and add JLabel
		JPanel northPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		northPanel.add(new JLabel("Creating Account"));
		
		//create mid panel
		JPanel midPanel = new JPanel(new GridLayout(4,2));
		
		//start adding elements to mid panel
		//create and add labels
		JLabel accountLabel = new JLabel("Account Number: ");
		accountLabel.setHorizontalAlignment(SwingConstants.CENTER);
		midPanel.add(accountLabel);
		JLabel accountNum = new JLabel(Integer.toString(bank.getAccountNum()));
		accountNum.setHorizontalAlignment(SwingConstants.CENTER);
		midPanel.add(accountNum);
		JLabel label = new JLabel("Account Type:");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		midPanel.add(label);
		//selector to choose account type
		String[] accountTypes = {"Checking", "Savings"};
		JComboBox accountType = new JComboBox(accountTypes);
		midPanel.add(accountType);
		JLabel label_1 = new JLabel("Account Name:");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		midPanel.add(label_1);
		//creating name and password for login
		JTextField accountName = new JTextField();
		midPanel.add(accountName);
		JLabel label_2 = new JLabel("Password:");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		midPanel.add(label_2);
		JPasswordField accountKey = new JPasswordField();
		midPanel.add(accountKey);
		
		//create lower panel
		JPanel southPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		
		//made up of two buttons - create and add buttons
		JButton btnCreateAccount = new JButton("Create Account");
		btnCreateAccount.setActionCommand("Create"); //need action listener to do things
		btnCreateAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (accountType.getSelectedItem().equals("Savings")) {
					//call BankSystem to create a new savings account to store.
					bank.createSavingsAccount(accountName.getText(), accountKey.getText());
					dispose();
					HomeScreen frame = new HomeScreen(bank);
					frame.setVisible(true);		
				}
				else {
					//call BankSystem to create a new checking account to store.
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
		//simple back button action to previous screen
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					dispose(); //dumps the frame
					HomeScreen frame = new HomeScreen(bank);
					frame.setVisible(true);
				}
		});
		southPanel.add(btnBack);
		
		//add panels to content pane
		getContentPane().add(northPanel, BorderLayout.NORTH);
		getContentPane().add(midPanel, BorderLayout.CENTER);
		getContentPane().add(southPanel, BorderLayout.SOUTH);
		
		//shrink it to size
		pack();
	}	
}