import java.awt.BorderLayout;
import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.Box;

public class SendMoneyScreen extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private Account account;
	private JTextField textField_2;
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
		
		/**
		 * Upper Panel of GUI
		 */
		JPanel panelUpper = new JPanel();
		contentPane.add(panelUpper, BorderLayout.NORTH);
		
		JButton btnBackButton = new JButton("Back");
		btnBackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		
		textField = new JTextField();
		textField.setBounds(174, 5, 231, 26);
		panelCenter.add(textField);
		textField.setColumns(10);
		
		JLabel lblDescription = new JLabel("Description: ");
		lblDescription.setHorizontalAlignment(SwingConstants.TRAILING);
		lblDescription.setBounds(30, 43, 144, 16);
		panelCenter.add(lblDescription);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(174, 38, 231, 26);
		panelCenter.add(textField_1);
		
		JLabel labelBalance = new JLabel("Current Balance: 0.0");
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
		panelLower.add(btnSendMoney);

	}
}