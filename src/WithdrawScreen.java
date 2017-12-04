import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;

public class WithdrawScreen extends JFrame {

	private JPanel contentPane;
	private BankSystem bank;
	private Account account;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WithdrawScreen frame = new WithdrawScreen();
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
	/*public HomeScreen(BankSystem bank) {
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
		});*/ 
	
	public WithdrawScreen(Account account) {
		this.account = account;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWithdrawMoney = new JLabel("Withdraw Money");
		lblWithdrawMoney.setBounds(167, 6, 109, 16);
		contentPane.add(lblWithdrawMoney);
		
		JButton btn5Dollars = new JButton("$5");
		btn5Dollars.setBounds(40, 60, 117, 29);
		contentPane.add(btn5Dollars);
		btn5Dollars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					dispose();
					//account.
					
			}
		});
		
		JButton btn10Dollars = new JButton("$10");
		btn10Dollars.setBounds(40, 101, 117, 29);
		contentPane.add(btn10Dollars);
		btn10Dollars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					dispose();
					//account.
					
			}
		});
		
		JButton btn20Dollars = new JButton("$20");
		btn20Dollars.setBounds(40, 142, 117, 29);
		contentPane.add(btn20Dollars);
		btn20Dollars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					dispose();
					//account.
					
			}
		});
		
		JButton btn50Dollars = new JButton("$50");
		btn50Dollars.setBounds(287, 60, 117, 29);
		contentPane.add(btn50Dollars);
		btn50Dollars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					dispose();
					//account.
					
			}
		});
		
		JButton btn100Dollars = new JButton("$100");
		btn100Dollars.setBounds(287, 101, 117, 29);
		contentPane.add(btn100Dollars);
		btn100Dollars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					dispose();
					//account.
					
			}
		});
		
		JButton btn1000Dollars = new JButton("$1000");
		btn1000Dollars.setBounds(287, 142, 117, 29);
		contentPane.add(btn1000Dollars);
		btn1000Dollars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					dispose();
					//account.
					
			}
		});
		
		JFormattedTextField formattedTextField = new JFormattedTextField("Enter an Amount:");
		formattedTextField.setHorizontalAlignment(SwingConstants.CENTER);
		formattedTextField.setBounds(40, 205, 236, 26);
		contentPane.add(formattedTextField);
		
		JButton btnEnterButton = new JButton("Enter");
		btnEnterButton.setBounds(287, 205, 117, 29);
		contentPane.add(btnEnterButton);
		btnEnterButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					dispose();
					//account.
					
			}
		});
	}
}
