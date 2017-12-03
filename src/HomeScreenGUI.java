import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JButton;

public class HomeScreenGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeScreenGUI frame = new HomeScreenGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HomeScreenGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList list = new JList();
		list.setBounds(239, 61, 205, 211);
		contentPane.add(list);
		
		JLabel lblBalance = new JLabel("Balance:");
		lblBalance.setBounds(277, 6, 61, 16);
		contentPane.add(lblBalance);
		
		JLabel lblUnknown = new JLabel("Unknown");
		lblUnknown.setBounds(350, 6, 61, 16);
		contentPane.add(lblUnknown);
		
		JLabel lblAccountNumber = new JLabel("Account Number:");
		lblAccountNumber.setBounds(18, 6, 116, 16);
		contentPane.add(lblAccountNumber);
		
		JLabel lblNewLabel = new JLabel("New Label");
		lblNewLabel.setBounds(146, 6, 70, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblTransactionLog = new JLabel("Transaction Log");
		lblTransactionLog.setBounds(287, 33, 101, 16);
		contentPane.add(lblTransactionLog);
		
		JButton btnWithdraw = new JButton("Withdraw");
		btnWithdraw.setBounds(56, 77, 117, 29);
		contentPane.add(btnWithdraw);
		
		JButton btnDeposit = new JButton("Deposit");
		btnDeposit.setBounds(56, 118, 117, 29);
		contentPane.add(btnDeposit);
		
		JButton btnPayBill = new JButton("Pay Bill");
		btnPayBill.setBounds(56, 159, 117, 29);
		contentPane.add(btnPayBill);
		
		JButton btnSendMoney = new JButton("Send Money");
		btnSendMoney.setBounds(56, 200, 117, 29);
		contentPane.add(btnSendMoney);
	}
}
