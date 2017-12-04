import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class PayBillScreen extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PayBillScreen frame = new PayBillScreen();
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
	public PayBillScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnWaterBill = new JButton("Water Bill");
		btnWaterBill.setBounds(40, 85, 117, 29);
		contentPane.add(btnWaterBill);
		
		JButton btnElectricBill = new JButton("Electric Bill");
		btnElectricBill.setBounds(40, 140, 117, 29);
		contentPane.add(btnElectricBill);
		
		JButton btnMortgage = new JButton("Mortgage");
		btnMortgage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMortgage.setBounds(40, 195, 117, 29);
		contentPane.add(btnMortgage);
		
		JButton btnCreditCardBill = new JButton("Credit Card");
		btnCreditCardBill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCreditCardBill.setBounds(287, 85, 117, 29);
		contentPane.add(btnCreditCardBill);
		
		JButton btnPhoneBill = new JButton("Phone Bill");
		btnPhoneBill.setBounds(287, 140, 117, 29);
		contentPane.add(btnPhoneBill);
		
		JButton btnGroceries = new JButton("Groceries");
		btnGroceries.setBounds(287, 195, 117, 29);
		contentPane.add(btnGroceries);
		
		JLabel lblPayABill = new JLabel("Pay a Bill");
		lblPayABill.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblPayABill.setHorizontalAlignment(SwingConstants.CENTER);
		lblPayABill.setBounds(45, 34, 352, 39);
		contentPane.add(lblPayABill);
	}
}
