import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class WithdrawScreen extends JFrame {

	//initialize private variables
	private JPanel contentPane;
	private BankSystem bank;
	private Account account;
	private JTextField textDescription;
	private JTextField textEnterAmount;
	
	/**
	 * Create the frame
	 * Takes the account that is logged in and the BankSystem
	 */
	public WithdrawScreen(Account account, BankSystem bank) {
		//init account and bank
		this.account = account;
		this.bank = bank;
		//set window conditions
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		//set contentPane to a panel and initialize layout/border
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		/**
		 * Upper Panel of GUI 
		 * Labels and a back button
		 * Similar to other Screens, googled Strut's for better UI. 
		 **/
		JPanel panelUpper = new JPanel();
		contentPane.add(panelUpper, BorderLayout.NORTH);
		
		//create back button with action listener to return to previous screen
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				HomeScreen frame = new HomeScreen(account, bank);
				frame.setVisible(true);
			}
		});
		panelUpper.add(btnBack);
		
		//googled for better UI
		Component horizontalStrut_1 = Box.createHorizontalStrut(85);
		panelUpper.add(horizontalStrut_1);
		
		JLabel lblDepositMoney = new JLabel("Withdraw Money");
		panelUpper.add(lblDepositMoney);
		
		Component horizontalStrut = Box.createHorizontalStrut(155);
		panelUpper.add(horizontalStrut);
		
		
		/**
		 * Center Panel of GUI
		 * Creates another panel to hold the buttons within it on the lower edge
		 * Adds labels, balance display, and a text field to allow user to type description
		 */
		JPanel panelCenter = new JPanel();
		contentPane.add(panelCenter, BorderLayout.CENTER);
		panelCenter.setLayout(null);
		
		JLabel lblDescription = new JLabel("Description: ");
		lblDescription.setBounds(30, 34, 81, 16);
		panelCenter.add(lblDescription);
		
		//Goes with Description
		textDescription = new JTextField();
		textDescription.setBounds(118, 34, 286, 61);
		panelCenter.add(textDescription);
		textDescription.setColumns(10);
		
		//displays current balance within label
		JLabel labelBalance = new JLabel("Current Balance: $" + account.getBalance());
		labelBalance.setHorizontalAlignment(SwingConstants.CENTER);
		labelBalance.setBounds(30, 6, 374, 16);
		panelCenter.add(labelBalance);
		
		/**
		 * Button Panel within Center Panel of GUI
		 * Creates a panel with flowLayout for the buttons to be evenly spaced and organized
		 * One after the other
		 * Like an ATM, quick amounts to deposit
		 * All buttons perform same action with different amounts 
		 * Design Decision to go back to previous screen after Withdrawal
		 */
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBounds(30, 107, 374, 77);
		panelCenter.add(buttonPanel);
		buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		//add buttons and their ActionListener actions so that when pressed they do something
		JButton button1Dollar = new JButton("$1");
		button1Dollar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (account.withdrawalIsPossible(1)) {
					dispose();
					account.withdrawMoney(1, textDescription.getText());
					HomeScreen frame = new HomeScreen(account, bank);
					frame.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Funds aren't available to withdraw!", "Error", JOptionPane.ERROR_MESSAGE);
					textEnterAmount.setText("");
				}
			}
		});
		buttonPanel.add(button1Dollar);
		
		JButton button2Dollars = new JButton("$2");
		button2Dollars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (account.withdrawalIsPossible(2)) {
					dispose();
					account.withdrawMoney(2, textDescription.getText());
					HomeScreen frame = new HomeScreen(account, bank);
					frame.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Funds aren't available to withdraw!", "Error", JOptionPane.ERROR_MESSAGE);
					textEnterAmount.setText("");
				}
			}
		});
		buttonPanel.add(button2Dollars);
		
		JButton button5Dollars = new JButton("$5");
		button5Dollars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (account.withdrawalIsPossible(5)) {
					dispose();
					account.withdrawMoney(5, textDescription.getText());
					HomeScreen frame = new HomeScreen(account, bank);
					frame.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Funds aren't available to withdraw!", "Error", JOptionPane.ERROR_MESSAGE);
					textEnterAmount.setText("");
				}
			}
		});
		buttonPanel.add(button5Dollars);
		
		JButton button10Dollars = new JButton("$10");
		button10Dollars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				account.withdrawMoney(10, textDescription.getText());
				HomeScreen frame = new HomeScreen(account, bank);
				frame.setVisible(true);
			}
		});
		buttonPanel.add(button10Dollars);
		
		JButton button20Dollars = new JButton("$20");
		button20Dollars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (account.withdrawalIsPossible(20)) {
					dispose();
					account.withdrawMoney(20, textDescription.getText());
					HomeScreen frame = new HomeScreen(account, bank);
					frame.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Funds aren't available to withdraw!", "Error", JOptionPane.ERROR_MESSAGE);
					textEnterAmount.setText("");
				}
			}
		});
		buttonPanel.add(button20Dollars);
		
		JButton button50Dollars = new JButton("$50");
		button50Dollars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (account.withdrawalIsPossible(50)) {
					dispose();
					account.withdrawMoney(50, textDescription.getText());
					HomeScreen frame = new HomeScreen(account, bank);
					frame.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Funds aren't available to withdraw!", "Error", JOptionPane.ERROR_MESSAGE);
					textEnterAmount.setText("");
				}
			}
		});
		buttonPanel.add(button50Dollars);
		
		JButton button100Dollars = new JButton("$100");
		button100Dollars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (account.withdrawalIsPossible(100)) {
					dispose();
					account.withdrawMoney(100, textDescription.getText());
					HomeScreen frame = new HomeScreen(account, bank);
					frame.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Funds aren't available to withdraw!", "Error", JOptionPane.ERROR_MESSAGE);
					textEnterAmount.setText("");
				}
			}
		});
		buttonPanel.add(button100Dollars);
		
		JButton button500Dollars = new JButton("$500");
		button500Dollars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (account.withdrawalIsPossible(500)) {
					dispose();
					account.withdrawMoney(500, textDescription.getText());
					HomeScreen frame = new HomeScreen(account, bank);
					frame.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Funds aren't available to withdraw!", "Error", JOptionPane.ERROR_MESSAGE);
					textEnterAmount.setText("");
				}
			}
		});
		buttonPanel.add(button500Dollars);	
		

		/**
		 * Lower Panel of GUI
		 * Add a label and textField to enter in your own deposit amount.
		 * Button has try/catch to verify user entered correct data. 
		 */
		JPanel panelLower = new JPanel();
		contentPane.add(panelLower, BorderLayout.SOUTH);
		
		JLabel lblEnterAmount = new JLabel("Enter Amount to Withdraw:");
		panelLower.add(lblEnterAmount);
		
		textEnterAmount = new JTextField();
		panelLower.add(textEnterAmount);
		textEnterAmount.setColumns(10);
		
		JButton btnEnterButton = new JButton("Enter");
		btnEnterButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//try and catch if user enters non-double
				try {
					Double val = Double.valueOf(textEnterAmount.getText());
					//perform withdrawal if balance afterwards > 0 and round to 2 decimals. 
					if (account.withdrawalIsPossible(val)) {
						dispose();
						account.withdrawMoney(val, textDescription.getText());
						HomeScreen frame = new HomeScreen(account, bank);
						frame.setVisible(true);
					}
					else {
						JOptionPane.showMessageDialog(null, "That number entered can't be withdrawn!", "Error", JOptionPane.ERROR_MESSAGE);
						textEnterAmount.setText("");
					}
				}
				catch (NumberFormatException nfe) {
					JOptionPane.showMessageDialog(null, "That number entered can't be withdrawn!", "Error", JOptionPane.ERROR_MESSAGE);
					textEnterAmount.setText("");
				}
			}
		});
		panelLower.add(btnEnterButton);
	}
}