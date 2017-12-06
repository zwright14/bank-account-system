import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginScreen extends JFrame {

	private JPanel contentPane;
	private Account account;
	private BankSystem bank;

	/**
	 * Create the frame.
	 */
	public LoginScreen(Account account) {
		this.account = account;
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
		
		JList TransactionList = new JList(account.getTransactionLog().toArray());
		TransactionList.setBounds(239, 61, 205, 211);
		contentPane.add(TransactionList);
		
		JButton btnWithdraw = new JButton("Withdraw");
		btnWithdraw.setBounds(56, 77, 117, 29);
		contentPane.add(btnWithdraw);
		btnWithdraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					dispose();
					WithdrawScreen frame = new WithdrawScreen(account);
					frame.setVisible(true);
			}
		});
		
		JButton btnDeposit = new JButton("Deposit");
		btnDeposit.setBounds(56, 118, 117, 29);
		contentPane.add(btnDeposit);
		btnDeposit.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				dispose();
				DepositScreen frame = new DepositScreen(account);
				frame.setVisible(true);
			}
		});
		
		JButton btnPayBill = new JButton("Pay Bill");
		btnPayBill.setBounds(56, 159, 117, 29);
		contentPane.add(btnPayBill);
		/*btnPayBill.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				dispose();
				PayBillScreen frame = new PayBillScreen(account);
				frame.setVisible(true);
			}
		});*/
		
		JButton btnSendMoney = new JButton("Send Money");
		btnSendMoney.setBounds(56, 200, 117, 29);
		contentPane.add(btnSendMoney);
		btnSendMoney.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				dispose();
				SendMoneyScreen frame = new SendMoneyScreen(account);
				frame.setVisible(true);
			}
		});
	}
}
