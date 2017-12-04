import java.awt.BorderLayout;
<<<<<<< Updated upstream
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.FlowLayout;
=======
import java.awt.EventQueue;
>>>>>>> Stashed changes

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridLayout;
<<<<<<< Updated upstream
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
=======
>>>>>>> Stashed changes
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;

public class WithdrawScreen extends JFrame {

	private JPanel contentPane;
<<<<<<< Updated upstream
	private BankSystem bank;
	private Account account;
	private JTextField textDescription;
	private JTextField textEnterAmount;
	
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
=======

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
	}*/
=======
	}
>>>>>>> Stashed changes

	/**
	 * Create the frame.
	 */
<<<<<<< Updated upstream
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
=======
	public WithdrawScreen() {
>>>>>>> Stashed changes
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
<<<<<<< Updated upstream
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
		
		JLabel lblDepositMoney = new JLabel("Withdraw Money");
		panelUpper.add(lblDepositMoney);
		
		Component horizontalStrut = Box.createHorizontalStrut(155);
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
		textDescription = new JTextField();
		textDescription.setBounds(118, 34, 286, 61);
		panelCenter.add(textDescription);
		textDescription.setColumns(10);
		
		JLabel labelBalance = new JLabel("Current Balance: 0.0");
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
				account.withdrawMoney(1);
				//transaction log?
			}
		});
		buttonPanel.add(button1Dollar);
		
		JButton button2Dollars = new JButton("$2");
		button2Dollars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				account.withdrawMoney(2);
				//transaction log?
			}
		});
		buttonPanel.add(button2Dollars);
		
		JButton button5Dollars = new JButton("$5");
		button5Dollars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				account.withdrawMoney(5);
				//transaction log?
			}
		});
		buttonPanel.add(button5Dollars);
		
		JButton button10Dollars = new JButton("$10");
		button10Dollars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				account.withdrawMoney(10);
				//transaction log?
			}
		});
		buttonPanel.add(button10Dollars);
		
		JButton button20Dollars = new JButton("$20");
		button20Dollars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				account.withdrawMoney(20);
				//transaction log?
			}
		});
		buttonPanel.add(button20Dollars);
		
		JButton button50Dollars = new JButton("$50");
		button50Dollars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				account.withdrawMoney(50);
				//transaction log?
			}
		});
		buttonPanel.add(button50Dollars);
		
		JButton button100Dollars = new JButton("$100");
		button100Dollars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				account.withdrawMoney(100);
				//transaction log?
			}
		});
		buttonPanel.add(button100Dollars);
		
		JButton button500Dollars = new JButton("$500");
		button500Dollars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				account.withdrawMoney(500);
				//transaction log?
			}
		});
		buttonPanel.add(button500Dollars);	
		
		
		/**
		 * Lower Panel of GUI
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
				dispose();
				//account.withdrawMoney();
				//transaction log?
			}
		});
		panelLower.add(btnEnterButton);
	}
}
=======
		contentPane.setLayout(null);
		
		JLabel lblWithdrawMoney = new JLabel("Withdraw Money");
		lblWithdrawMoney.setBounds(167, 6, 109, 16);
		contentPane.add(lblWithdrawMoney);
		
		JButton btn5Dollars = new JButton("$5");
		btn5Dollars.setBounds(40, 60, 117, 29);
		contentPane.add(btn5Dollars);
		
		JButton btn10Dollars = new JButton("$10");
		btn10Dollars.setBounds(40, 101, 117, 29);
		contentPane.add(btn10Dollars);
		
		JButton btn20Dollars = new JButton("$20");
		btn20Dollars.setBounds(40, 142, 117, 29);
		contentPane.add(btn20Dollars);
		
		JButton btn50Dollars = new JButton("$50");
		btn50Dollars.setBounds(287, 60, 117, 29);
		contentPane.add(btn50Dollars);
		
		JButton btn100Dollars = new JButton("$100");
		btn100Dollars.setBounds(287, 101, 117, 29);
		contentPane.add(btn100Dollars);
		
		JButton btnEnterButton = new JButton("Enter");
		btnEnterButton.setBounds(287, 205, 117, 29);
		contentPane.add(btnEnterButton);
		
		JButton btn1000Dollars = new JButton("$1000");
		btn1000Dollars.setBounds(287, 142, 117, 29);
		contentPane.add(btn1000Dollars);
		
		JFormattedTextField formattedTextField = new JFormattedTextField("Enter an Amount:");
		formattedTextField.setHorizontalAlignment(SwingConstants.CENTER);
		formattedTextField.setBounds(40, 205, 236, 26);
		contentPane.add(formattedTextField);
	}
}
>>>>>>> Stashed changes
