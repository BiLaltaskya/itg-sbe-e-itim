package com.itg.oop.assignments.assignment120824.duhane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;

import java.awt.EventQueue;

public class PaymentForm {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaymentForm window = new PaymentForm();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PaymentForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ödeme Yöntemi : ");
		lblNewLabel.setBounds(66, 32, 116, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Tutar : ");
		lblNewLabel_1.setBounds(66, 74, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Ödeme Yap");
		btnNewButton.setBounds(235, 145, 108, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Sonuç : ");
		lblNewLabel_2.setBounds(53, 220, 315, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Seçiniz", "KrediKarti", "MailOrder", "GooglePay"}));
		comboBox.setBounds(235, 28, 108, 22);
		frame.getContentPane().add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(235, 71, 108, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}

}