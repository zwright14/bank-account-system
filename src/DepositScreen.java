import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.Box;

public class DepositScreen extends JFrame {

	private JPanel contentPane;
	private Account account;
	private JTextField descriptionField;
	private JTextField amountField;

	/**
	 * Create the frame.
	 */
	public DepositScreen(Account account) {
		this.account = account;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		/**
		 * Upper Panel of GUI
		 **/
		JPanel panelUpper = new JPanel();
		contentPane.add(panelUpper, BorderLayout.NORTH);
		
		JButton btnBack = new JButton("Back");
		panelUpper.add(btnBack);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(85);
		panelUpper.add(horizontalStrut_1);
		
		JLabel lblDepositMoney = new JLabel("Deposit Money");
		panelUpper.add(lblDepositMoney);
		
		Component horizontalStrut = Box.createHorizontalStrut(165);
		panelUpper.add(horizontalStrut);
		
		
		/**
		 * Center Panel of GUI
		 */
		JPanel panelCenter = new JPanel();
		contentPane.add(panelCenter, BorderLayout.CENTER);
		panelCenter.setLayout(null);
		
		JLabel lblDescription = new JLabel("Description: ");
		lblDescription.setBounds(30, 34, 81, 16);
		panelCenter.add(lblDescription);
		
		//Goes with Description
		descriptionField = new JTextField();
		descriptionField.setBounds(118, 34, 286, 61);
		panelCenter.add(descriptionField);
		descriptionField.setColumns(10);
		
		JLabel labelBalance = new JLabel("Current Balance: $" + account.getBalance());
		labelBalance.setHorizontalAlignment(SwingConstants.CENTER);
		labelBalance.setBounds(30, 6, 374, 16);
		panelCenter.add(labelBalance);
		
		
		/**
		 * Button Panel within Center Panel of GUI
		 */
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBounds(30, 107, 374, 77);
		panelCenter.add(buttonPanel);
		buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton button1Dollar = new JButton("$1");
		button1Dollar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				account.depositMoney(1);
				LoginScreen frame = new LoginScreen(account);
				frame.setVisible(true);
			}
		});
		buttonPanel.add(button1Dollar);
		
		JButton button2Dollars = new JButton("$2");
		button2Dollars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				account.depositMoney(2);
				LoginScreen frame = new LoginScreen(account);
				frame.setVisible(true);
			}
		});
		buttonPanel.add(button2Dollars);
		
		JButton button5Dollars = new JButton("$5");
		button5Dollars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				account.depositMoney(5);
				LoginScreen frame = new LoginScreen(account);
				frame.setVisible(true);
			}
		});
		buttonPanel.add(button5Dollars);
		
		JButton button10Dollars = new JButton("$10");
		button10Dollars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				account.depositMoney(10);
				LoginScreen frame = new LoginScreen(account);
				frame.setVisible(true);
			}
		});
		buttonPanel.add(button10Dollars);
		
		JButton button20Dollars = new JButton("$20");
		button20Dollars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				account.depositMoney(20);
				LoginScreen frame = new LoginScreen(account);
				frame.setVisible(true);
			}
		});
		buttonPanel.add(button20Dollars);
		
		JButton button50Dollars = new JButton("$50");
		button50Dollars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				account.depositMoney(50);
				LoginScreen frame = new LoginScreen(account);
				frame.setVisible(true);
			}
		});
		buttonPanel.add(button50Dollars);
		
		JButton button100Dollars = new JButton("$100");
		button100Dollars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				account.depositMoney(100);
				LoginScreen frame = new LoginScreen(account);
				frame.setVisible(true);
			}
		});
		buttonPanel.add(button100Dollars);
		
		JButton button500Dollars = new JButton("$500");
		button500Dollars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				account.depositMoney(500);
				LoginScreen frame = new LoginScreen(account);
				frame.setVisible(true);
			}
		});
		buttonPanel.add(button500Dollars);	
		
		
		/**
		 * Lower Panel of GUI
		 */
		JPanel panelLower = new JPanel();
		contentPane.add(panelLower, BorderLayout.SOUTH);
		
		JLabel lblEnterAmount = new JLabel("Enter Amount to Deposit:");
		panelLower.add(lblEnterAmount);
		
		amountField = new JTextField();
		panelLower.add(amountField);
		amountField.setColumns(10);
		
		//cant get this to work correctly
		JButton btnEnterButton = new JButton("Enter");
		btnEnterButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				account.depositMoney(Double.valueOf(amountField.getText()));
				LoginScreen frame = new LoginScreen(account);
				frame.setVisible(true);
			}
		});
		panelLower.add(btnEnterButton);
		
		
		
	}
}
