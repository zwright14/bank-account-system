import java.awt.BorderLayout;
import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.Box;

public class SendMoneyScreen extends JFrame {

	private JPanel contentPane;
	private JTextField accountNumSent;
	private JTextField textField_1;
	private Account account;
	
	/**
	 * Create the frame.
	 */
	public SendMoneyScreen(CheckingAccount account, BankSystem bank) {
		this.account = account;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		/**
		 * Upper Panel of GUI
		 */
		JPanel panelUpper = new JPanel();
		contentPane.add(panelUpper, BorderLayout.NORTH);
		
		JButton btnBackButton = new JButton("Back");
		btnBackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				LoginScreen frame = new LoginScreen(account, bank);
				frame.setVisible(true);
			}
		});
		panelUpper.add(btnBackButton);
		
		Component horizontalStrut = Box.createHorizontalStrut(90);
		panelUpper.add(horizontalStrut);
		
		JLabel lblSendMoney = new JLabel("Send Money");
		panelUpper.add(lblSendMoney);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(180);
		panelUpper.add(horizontalStrut_1);
		
		/**
		 * Center Panel of GUI
		 */
		JPanel panelCenter = new JPanel();
		contentPane.add(panelCenter, BorderLayout.CENTER);
		panelCenter.setLayout(null);
		
		JLabel lblAccountToSend = new JLabel("Account # to Send to:");
		lblAccountToSend.setHorizontalAlignment(SwingConstants.TRAILING);
		lblAccountToSend.setBounds(30, 6, 144, 25);
		panelCenter.add(lblAccountToSend);
		
		accountNumSent = new JTextField();
		accountNumSent.setBounds(174, 5, 231, 26);
		panelCenter.add(accountNumSent);
		accountNumSent.setColumns(10);
		
		JLabel lblDescription = new JLabel("Description: ");
		lblDescription.setHorizontalAlignment(SwingConstants.TRAILING);
		lblDescription.setBounds(30, 43, 144, 16);
		panelCenter.add(lblDescription);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(174, 38, 231, 26);
		panelCenter.add(textField_1);
		
		JLabel labelBalance = new JLabel("Current Balance: " + account.getBalance());
		labelBalance.setHorizontalAlignment(SwingConstants.CENTER);
		labelBalance.setBounds(30, 79, 374, 16);
		panelCenter.add(labelBalance);
		
		/**
		 * Button Panel within Center Panel
		 */
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBounds(30, 107, 374, 77);
		panelCenter.add(buttonPanel);
		buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton buttonOneDollar = new JButton("$1");
		buttonOneDollar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (account.withdrawalIsPossible(1)) {
					if (bank.accountExists(Integer.valueOf(accountNumSent.getText()))) {
						Account otherAccount = bank.findAccount(Integer.parseInt(accountNumSent.getText()));
						dispose();
						account.sendCheck(1, otherAccount);
						LoginScreen frame = new LoginScreen(account, bank);
						frame.setVisible(true);
					}
					else {
						JOptionPane.showMessageDialog(null, "Account Doesn't Exist!", "Error", JOptionPane.ERROR_MESSAGE);
						textField_1.setText("");
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "Funds aren't available to withdraw!", "Error", JOptionPane.ERROR_MESSAGE);
					textField_1.setText("");
				}
			}
		});
		buttonPanel.add(buttonOneDollar);
		
		JButton buttonTwoDollar = new JButton("$2");
		buttonTwoDollar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (account.withdrawalIsPossible(1)) {
					if (bank.accountExists(Integer.valueOf(accountNumSent.getText()))) {
						Account otherAccount = bank.findAccount(Integer.parseInt(accountNumSent.getText()));
						dispose();
						account.sendCheck(2, otherAccount);
						LoginScreen frame = new LoginScreen(account, bank);
						frame.setVisible(true);
					}
					else {
						JOptionPane.showMessageDialog(null, "Account Doesn't Exist!", "Error", JOptionPane.ERROR_MESSAGE);
						textField_1.setText("");
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "Funds aren't available to withdraw!", "Error", JOptionPane.ERROR_MESSAGE);
					textField_1.setText("");
				}
			}
		});
		buttonPanel.add(buttonTwoDollar);
		
		JButton buttonFiveDollar = new JButton("$5");
		buttonFiveDollar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (account.withdrawalIsPossible(1)) {
					if (bank.doesAccountExist(Integer.valueOf(accountNumSent.getText()))) {
						Account otherAccount = bank.findAccount(Integer.parseInt(accountNumSent.getText()));
						dispose();
						account.sendCheck(5, otherAccount);
						LoginScreen frame = new LoginScreen(account, bank);
						frame.setVisible(true);
					}
					else {
						JOptionPane.showMessageDialog(null, "Account Doesn't Exist!", "Error", JOptionPane.ERROR_MESSAGE);
						textField_1.setText("");
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "Funds aren't available to withdraw!", "Error", JOptionPane.ERROR_MESSAGE);
					textField_1.setText("");
				}
			}
		});
		buttonPanel.add(buttonFiveDollar);
		
		JButton buttonTenDollar = new JButton("$10");
		buttonTenDollar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (account.withdrawalIsPossible(1)) {
					if (bank.doesAccountExist(Integer.valueOf(accountNumSent.getText()))) {
						Account otherAccount = bank.findAccount(Integer.parseInt(accountNumSent.getText()));
						dispose();
						account.sendCheck(10, otherAccount);
						LoginScreen frame = new LoginScreen(account, bank);
						frame.setVisible(true);
					}
					else {
						JOptionPane.showMessageDialog(null, "Account Doesn't Exist!", "Error", JOptionPane.ERROR_MESSAGE);
						textField_1.setText("");
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "Funds aren't available to withdraw!", "Error", JOptionPane.ERROR_MESSAGE);
					textField_1.setText("");
				}
			}
		});
		buttonPanel.add(buttonTenDollar);
		
		JButton buttonTwentyDollar = new JButton("$20");
		buttonTwentyDollar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (account.withdrawalIsPossible(1)) {
					if (bank.doesAccountExist(Integer.valueOf(accountNumSent.getText()))) {
						Account otherAccount = bank.findAccount(Integer.parseInt(accountNumSent.getText()));
						dispose();
						account.sendCheck(20, otherAccount);
						LoginScreen frame = new LoginScreen(account, bank);
						frame.setVisible(true);
					}
					else {
						JOptionPane.showMessageDialog(null, "Account Doesn't Exist!", "Error", JOptionPane.ERROR_MESSAGE);
						textField_1.setText("");
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "Funds aren't available to withdraw!", "Error", JOptionPane.ERROR_MESSAGE);
					textField_1.setText("");
				}
			}
		});
		buttonPanel.add(buttonTwentyDollar);
		
		JButton buttonFiftyDollar = new JButton("$50");
		buttonFiftyDollar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (account.withdrawalIsPossible(1)) {
					if (bank.doesAccountExist(Integer.valueOf(accountNumSent.getText()))) {
						Account otherAccount = bank.findAccount(Integer.parseInt(accountNumSent.getText()));
						dispose();
						account.sendCheck(50, otherAccount);
						LoginScreen frame = new LoginScreen(account, bank);
						frame.setVisible(true);
					}
					else {
						JOptionPane.showMessageDialog(null, "Account Doesn't Exist!", "Error", JOptionPane.ERROR_MESSAGE);
						textField_1.setText("");
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "Funds aren't available to withdraw!", "Error", JOptionPane.ERROR_MESSAGE);
					textField_1.setText("");
				}
			}
		});
		buttonPanel.add(buttonFiftyDollar);
		
		JButton button100Dollar = new JButton("$100");
		button100Dollar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (account.withdrawalIsPossible(1)) {
					if (bank.doesAccountExist(Integer.valueOf(accountNumSent.getText()))) {
						Account otherAccount = bank.findAccount(Integer.parseInt(accountNumSent.getText()));
						dispose();
						account.sendCheck(100, otherAccount);
						LoginScreen frame = new LoginScreen(account, bank);
						frame.setVisible(true);
					}
					else {
						JOptionPane.showMessageDialog(null, "Account Doesn't Exist!", "Error", JOptionPane.ERROR_MESSAGE);
						textField_1.setText("");
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "Funds aren't available to withdraw!", "Error", JOptionPane.ERROR_MESSAGE);
					textField_1.setText("");
				}
			}
		});
		buttonPanel.add(button100Dollar);
		
		JButton button500Dollar = new JButton("$500");
		button500Dollar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (account.withdrawalIsPossible(1)) {
					if (bank.doesAccountExist(Integer.valueOf(accountNumSent.getText()))) {
						Account otherAccount = bank.findAccount(Integer.parseInt(accountNumSent.getText()));
						dispose();
						account.sendCheck(500, otherAccount);
						LoginScreen frame = new LoginScreen(account, bank);
						frame.setVisible(true);
					}
					else {
						JOptionPane.showMessageDialog(null, "Account Doesn't Exist!", "Error", JOptionPane.ERROR_MESSAGE);
						textField_1.setText("");
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "Funds aren't available to withdraw!", "Error", JOptionPane.ERROR_MESSAGE);
					textField_1.setText("");
				}
			}
		});
		buttonPanel.add(button500Dollar);
		
		/**
		 * Lower Panel of GUI
		 */
		JPanel panelLower = new JPanel();
		contentPane.add(panelLower, BorderLayout.SOUTH);
		
		JLabel lblEnterAmountTo = new JLabel("Enter Amount to Send:");
		panelLower.add(lblEnterAmountTo);
		
		textField_1 = new JTextField();
		panelLower.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnSendMoney = new JButton("Enter");
		btnSendMoney.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (account.withdrawalIsPossible(1)) {
					if (bank.doesAccountExist(Integer.valueOf(accountNumSent.getText()))) {
						Account otherAccount = bank.findAccount(Integer.parseInt(accountNumSent.getText()));
						dispose();
						account.sendCheck(Double.valueOf(textField_1.getText()), otherAccount);
						LoginScreen frame = new LoginScreen(account, bank);
						frame.setVisible(true);
					}
					else {
						JOptionPane.showMessageDialog(null, "Account Doesn't Exist!", "Error", JOptionPane.ERROR_MESSAGE);
						textField_1.setText("");
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "Funds aren't available to withdraw!", "Error", JOptionPane.ERROR_MESSAGE);
					textField_1.setText("");
				}
			}
		});
		panelLower.add(btnSendMoney);

	}
}
