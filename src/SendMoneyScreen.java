import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.FlowLayout;

public class SendMoneyScreen extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private Account account;
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SendMoneyScreen frame = new SendMoneyScreen(account);
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
	public SendMoneyScreen(Account account) {
		this.account = account;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelLower = new JPanel();
		contentPane.add(panelLower, BorderLayout.SOUTH);
		
		JLabel lblEnterAmountTo = new JLabel("Enter Amount to Send:");
		panelLower.add(lblEnterAmountTo);
		
		textField_1 = new JTextField();
		panelLower.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnSendMoney = new JButton("Enter");
		panelLower.add(btnSendMoney);
		
		JPanel panelUpper = new JPanel();
		contentPane.add(panelUpper, BorderLayout.NORTH);
		
		JLabel lblSendMoney = new JLabel("Send Money");
		panelUpper.add(lblSendMoney);
		
		JPanel panelCenter = new JPanel();
		contentPane.add(panelCenter, BorderLayout.CENTER);
		panelCenter.setLayout(null);
		
		JLabel lblAccountToSend = new JLabel("Account # to Send to:");
		lblAccountToSend.setBounds(30, 6, 144, 25);
		panelCenter.add(lblAccountToSend);
		
		textField = new JTextField();
		textField.setBounds(174, 5, 231, 26);
		panelCenter.add(textField);
		textField.setColumns(10);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBounds(30, 79, 374, 77);
		panelCenter.add(buttonPanel);
		buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton button_6 = new JButton("$1");
		buttonPanel.add(button_6);
		
		JButton button = new JButton("$2");
		buttonPanel.add(button);
		
		JButton button_1 = new JButton("$5");
		buttonPanel.add(button_1);
		
		JButton button_2 = new JButton("$10");
		buttonPanel.add(button_2);
		
		JButton button_3 = new JButton("$20");
		buttonPanel.add(button_3);
		
		JButton button_4 = new JButton("$50");
		buttonPanel.add(button_4);
		
		JButton button_5 = new JButton("$100");
		buttonPanel.add(button_5);
		
		JButton button_7 = new JButton("$500");
		buttonPanel.add(button_7);
		
		JLabel lblCurrentBalance = new JLabel("Current Balance: " + account.getBalance());
		lblCurrentBalance.setBounds(30, 37, 374, 16);
		panelCenter.add(lblCurrentBalance);
	}
}
