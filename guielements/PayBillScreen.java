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
import javax.swing.SwingConstants;
import java.awt.Font;

public class PayBillScreen extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public PayBillScreen(CheckingAccount account, BankSystem bank) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(6, 6, 75, 29);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				HomeScreen frame = new HomeScreen(account, bank);
				frame.setVisible(true);
			}
		});
		contentPane.add(btnBack);
		
		JButton btnWaterBill = new JButton("Water Bill");
		btnWaterBill.setBounds(40, 85, 117, 29);
		btnWaterBill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (account.withdrawalIsPossible(150)) {
					dispose();
					account.payBill("Water Bill");
					HomeScreen frame = new HomeScreen(account, bank);
					frame.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Funds aren't available to withdraw!", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		contentPane.add(btnWaterBill);
		
		JButton btnElectricBill = new JButton("Electric Bill");
		btnElectricBill.setBounds(40, 140, 117, 29);
		btnElectricBill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (account.withdrawalIsPossible(250)) {
					dispose();
					account.payBill("Electric Bill");
					HomeScreen frame = new HomeScreen(account, bank);
					frame.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Funds aren't available to withdraw!", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		contentPane.add(btnElectricBill);
		
		JButton btnMortgage = new JButton("Mortgage");
		btnMortgage.setBounds(40, 195, 117, 29);
		btnMortgage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (account.withdrawalIsPossible(1000)) {
					dispose();
					account.payBill("Mortgage");
					HomeScreen frame = new HomeScreen(account, bank);
					frame.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Funds aren't available to withdraw!", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		contentPane.add(btnMortgage);
		
		JButton btnCreditCardBill = new JButton("Credit Card");
		btnCreditCardBill.setBounds(287, 85, 117, 29);
		btnCreditCardBill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (account.withdrawalIsPossible(1750)) {
					dispose();
					account.payBill("Credit Card");
					HomeScreen frame = new HomeScreen(account, bank);
					frame.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Funds aren't available to withdraw!", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		contentPane.add(btnCreditCardBill);
		
		JButton btnPhoneBill = new JButton("Phone Bill");
		btnPhoneBill.setBounds(287, 140, 117, 29);
		btnPhoneBill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (account.withdrawalIsPossible(75)) {
					dispose();
					account.payBill("Phone Bill");
					HomeScreen frame = new HomeScreen(account, bank);
					frame.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Funds aren't available to withdraw!", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		contentPane.add(btnPhoneBill);
		
		JButton btnGroceries = new JButton("Groceries");
		btnGroceries.setBounds(287, 195, 117, 29);
		btnGroceries.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (account.withdrawalIsPossible(125)) {
					dispose();
					account.payBill("Groceries");
					HomeScreen frame = new HomeScreen(account, bank);
					frame.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Funds aren't available to withdraw!", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		contentPane.add(btnGroceries);
		
		JLabel lblPayABill = new JLabel("Pay a Bill");
		lblPayABill.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblPayABill.setHorizontalAlignment(SwingConstants.CENTER);
		lblPayABill.setBounds(45, 34, 352, 39);
		contentPane.add(lblPayABill);
	}
}
