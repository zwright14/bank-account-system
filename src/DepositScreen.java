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

public class DepositScreen extends JFrame {

	private JPanel contentPane;
	private Account account;
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DepositScreen frame = new DepositScreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

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
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.CENTER);
		
	
		JButton btn5Dollars = new JButton("$5");
		btn5Dollars.setBounds(42, 76, 75, 29);
		btn5Dollars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				account.depositMoney(5);
				//transaction log?
			}
		});
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(42, 6, 116, 26);
		panel_2.add(panel_3);
		
		JLabel lblCurrentBalance = new JLabel("Current Balance: ");
		panel_3.add(lblCurrentBalance);
		panel_2.add(btn5Dollars);
		
		JButton btn10Dollars = new JButton("$10");
		btn10Dollars.setBounds(177, 76, 75, 29);
		btn10Dollars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				account.depositMoney(10);
				//transaction log?
			}
		});
		panel_2.add(btn10Dollars);
		
		JButton btn20Dollars = new JButton("$20");
		btn20Dollars.setBounds(319, 76, 75, 29);
		btn20Dollars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				account.depositMoney(20);
				//transaction log?
			}
		});
		panel_2.add(btn20Dollars);
		
		JButton btn50Dollars = new JButton("$50");
		btn50Dollars.setBounds(97, 39, 75, 29);
		btn50Dollars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				account.depositMoney(50);
				//transaction log?
			}
		});
		panel_2.add(btn50Dollars);
		
		JButton btn100Dollars = new JButton("$100");
		btn100Dollars.setBounds(177, 39, 76, 29);
		btn100Dollars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				account.depositMoney(100);
				//transaction log?
			}
		});
		panel_2.add(btn100Dollars);
				
		JButton btn1000Dollars = new JButton("$1000");
		btn1000Dollars.setBounds(258, 39, 84, 29);
		btn1000Dollars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				account.depositMoney(1000);
				//transaction log?
			}
		});
		panel_2.add(btn1000Dollars);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JLabel lblEnterAnAmount = new JLabel("Enter an Amount:");
		panel.add(lblEnterAnAmount);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnEnterButton = new JButton("Enter");
		btnEnterButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				//account.depositMoney(5);
				//transaction log?
			}
		});
		panel.add(btnEnterButton);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.NORTH);
		
		JLabel lblDepositMoney = new JLabel("Deposit Money");
		panel_1.add(lblDepositMoney);
		
	}
	
}
