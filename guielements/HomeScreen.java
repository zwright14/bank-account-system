import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeScreen extends JFrame {

	private JPanel contentPane;
	private Account account;
	private BankSystem bank;

	/**
	 * Create the frame.
	 */
	public HomeScreen(Account account, BankSystem bank) {
		this.account = account;
		this.bank = bank;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBalance = new JLabel("Balance: $" + account.getBalance());
		lblBalance.setHorizontalAlignment(SwingConstants.CENTER);
		lblBalance.setBounds(235, 6, 209, 16);
		contentPane.add(lblBalance);
		
		JLabel lblAccountNumber = new JLabel("Account Number: " + account.getNumber());
		lblAccountNumber.setBounds(21, 6, 128, 16);
		contentPane.add(lblAccountNumber);
		
		JLabel lblAccountName = new JLabel("Account Owner: " + account.getName());
		lblAccountName.setBounds(21, 33, 187, 16);
		contentPane.add(lblAccountName);
		
		JLabel lblTransactionLog = new JLabel("Transaction Log");
		lblTransactionLog.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		lblTransactionLog.setHorizontalAlignment(SwingConstants.CENTER);
		lblTransactionLog.setBounds(239, 33, 205, 16);
		contentPane.add(lblTransactionLog);
		
		JScrollPane scrollPane = new JScrollPane();
		JList TransactionList = new JList(account.getTransactionLog().toArray());
		scrollPane.setBounds(239, 61, 205, 211);
		scrollPane.setViewportView(TransactionList);
		contentPane.add(scrollPane);
		
		JButton btnWithdraw = new JButton("Withdraw");
		btnWithdraw.setBounds(56, 77, 117, 29);
		contentPane.add(btnWithdraw);
		btnWithdraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					dispose();
					WithdrawScreen frame = new WithdrawScreen(account, bank);
					frame.setVisible(true);
			}
		});
		
		JButton btnDeposit = new JButton("Deposit");
		btnDeposit.setBounds(56, 118, 117, 29);
		contentPane.add(btnDeposit);
		btnDeposit.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				dispose();
				DepositScreen frame = new DepositScreen(account, bank);
				frame.setVisible(true);
			}
		});
		
		JButton btnPayBill = new JButton("Pay Bill");
		btnPayBill.setBounds(56, 159, 117, 29);
		contentPane.add(btnPayBill);
		btnPayBill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					PayBillScreen frame = new PayBillScreen((CheckingAccount) account, bank);
					dispose();
					frame.setVisible(true);
				}
				catch(ClassCastException exc) {
					JOptionPane.showMessageDialog(null, "This action cannot be performed for Savings Account", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		
		JButton btnSendMoney = new JButton("Send Money");
		btnSendMoney.setBounds(56, 200, 117, 29);
		btnSendMoney.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					SendMoneyScreen frame = new SendMoneyScreen((CheckingAccount) account, bank);
					dispose();
					frame.setVisible(true);
				}
				catch(ClassCastException exc) {
					JOptionPane.showMessageDialog(null, "This action cannot be performed for Savings Account", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		contentPane.add(btnSendMoney);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBounds(6, 243, 76, 29);
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				LoginScreen frame = new LoginScreen(bank);
				frame.setVisible(true);
			}
		});
		contentPane.add(btnLogout);
		
		JButton LimitResetbutton = new JButton("Reset Limit");
		LimitResetbutton.setBounds(132, 241, 95, 29);
		LimitResetbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					((SavingsAccount) account).resetWithdrawalLimit();
				}
				catch(ClassCastException exc) {
					JOptionPane.showMessageDialog(null, "This action cannot be performed for Checking Account", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		contentPane.add(LimitResetbutton);
		
	}
}
