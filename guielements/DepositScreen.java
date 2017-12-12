import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.Box;

public class DepositScreen extends JFrame {
	
	//initialize private variables
	private JPanel contentPane;
	private Account account;
	private JTextField descriptionField;
	private JTextField amountField;
	private BankSystem bank;

	/**
	 * Create the frame
	 * Takes the account that is logged in and the BankSystem
	 */
	public DepositScreen(Account account, BankSystem bank) {
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
		 * Upper Panel of GUI - Labels and a back button (and separation struts) 
		 **/
		JPanel panelUpper = new JPanel();
		contentPane.add(panelUpper, BorderLayout.NORTH);
		
		//create back button that returns to previous screen 
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose(); //dump current screen
				HomeScreen frame = new HomeScreen(account, bank);
				frame.setVisible(true);
			}
		});
		panelUpper.add(btnBack);
		
		//couldn't figure out how to correctly place items, googled this
		Component horizontalStrut_1 = Box.createHorizontalStrut(85);
		panelUpper.add(horizontalStrut_1);
		
		JLabel lblDepositMoney = new JLabel("Deposit Money");
		panelUpper.add(lblDepositMoney);
		
		//couldn't figure out how to correctly place items, googled this
		Component horizontalStrut = Box.createHorizontalStrut(165);
		panelUpper.add(horizontalStrut);
		
		
		/**
		 * Center Panel of GUI
		 * Creates another panel to hold the buttons within it on the lower edge
		 * Adds labels, balance display, and a text field to allow user to type description
		 */
		JPanel panelCenter = new JPanel();
		contentPane.add(panelCenter, BorderLayout.CENTER);
		panelCenter.setLayout(null); //set to null because other panel is inside of it (looked better setting bounds)
		
		JLabel lblDescription = new JLabel("Description: ");
		lblDescription.setBounds(30, 34, 81, 16);
		panelCenter.add(lblDescription);
		
		//Goes with Description
		descriptionField = new JTextField();
		descriptionField.setBounds(118, 34, 286, 61);
		panelCenter.add(descriptionField);
		descriptionField.setColumns(10);
		
		//uses current account
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
		 * Design Decision to go back to previous screen after Deposit 
		 */
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBounds(30, 107, 374, 77);
		panelCenter.add(buttonPanel);
		buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		//add buttons and their ActionListener actions so that when pressed they do something
		JButton button1Dollar = new JButton("$1");
		button1Dollar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose(); //design choice to bring back to previous screen after deposit completion
				account.depositMoney(1, descriptionField.getText());
				HomeScreen frame = new HomeScreen(account, bank);
				frame.setVisible(true);
			}
		});
		buttonPanel.add(button1Dollar);
		
		JButton button2Dollars = new JButton("$2");
		button2Dollars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose(); 
				account.depositMoney(2, descriptionField.getText());
				HomeScreen frame = new HomeScreen(account, bank);
				frame.setVisible(true);
			}
		});
		buttonPanel.add(button2Dollars);
		
		JButton button5Dollars = new JButton("$5");
		button5Dollars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				account.depositMoney(5, descriptionField.getText());
				HomeScreen frame = new HomeScreen(account, bank);
				frame.setVisible(true);
			}
		});
		buttonPanel.add(button5Dollars);
		
		JButton button10Dollars = new JButton("$10");
		button10Dollars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				account.depositMoney(10, descriptionField.getText());
				HomeScreen frame = new HomeScreen(account, bank);
				frame.setVisible(true);
			}
		});
		buttonPanel.add(button10Dollars);
		
		JButton button20Dollars = new JButton("$20");
		button20Dollars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				account.depositMoney(20, descriptionField.getText());
				HomeScreen frame = new HomeScreen(account, bank);
				frame.setVisible(true);
			}
		});
		buttonPanel.add(button20Dollars);
		
		JButton button50Dollars = new JButton("$50");
		button50Dollars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				account.depositMoney(50, descriptionField.getText());
				HomeScreen frame = new HomeScreen(account, bank);
				frame.setVisible(true);
			}
		});
		buttonPanel.add(button50Dollars);
		
		JButton button100Dollars = new JButton("$100");
		button100Dollars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				account.depositMoney(100, descriptionField.getText());
				HomeScreen frame = new HomeScreen(account, bank);
				frame.setVisible(true);
			}
		});
		buttonPanel.add(button100Dollars);
		
		JButton button500Dollars = new JButton("$500");
		button500Dollars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				account.depositMoney(500, descriptionField.getText());
				HomeScreen frame = new HomeScreen(account, bank);
				frame.setVisible(true);
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
		
		JLabel lblEnterAmount = new JLabel("Enter Amount to Deposit:");
		panelLower.add(lblEnterAmount);
		
		amountField = new JTextField();
		panelLower.add(amountField);
		amountField.setColumns(10);
		
		
		JButton btnEnterButton = new JButton("Enter");
		btnEnterButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//try and catch if the user enters in a non-double #
				try {
				Double val = Double.valueOf(amountField.getText());
				//perform deposit if possible (rounded to 2 decimals)
				if (account.depositIsPossible(val)) {
					dispose();
					account.depositMoney(val, descriptionField.getText());
					HomeScreen frame = new HomeScreen(account, bank);
					frame.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "The value entered can't be deposited!", "Error", JOptionPane.ERROR_MESSAGE);
					amountField.setText("");
				}
				}
				catch(NumberFormatException nfe) {
					JOptionPane.showMessageDialog(null, "The value entered can't be deposited!", "Error", JOptionPane.ERROR_MESSAGE);
					amountField.setText("");
				}
			}
		});
		panelLower.add(btnEnterButton);
		
		
		
	}
}
