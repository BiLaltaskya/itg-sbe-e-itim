package com.itg.oop.logger;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LogForm {

	private JFrame frame;
	private JTextField txtDurum;
	private JTextField txtSonuc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogForm window = new LogForm();
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
	public LogForm() {
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
		
		JLabel lblNewLabel = new JLabel("Log Tipi : ");
		lblNewLabel.setBounds(75, 21, 89, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Durum : ");
		lblNewLabel_1.setBounds(75, 75, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JComboBox cmbLogType = new JComboBox();
		cmbLogType.setModel(new DefaultComboBoxModel(new String[] {"Seçiniz", "DbLog", "XmlLog", "JsonLog","GrayLog"}));
		cmbLogType.setBounds(205, 17, 115, 22);
		frame.getContentPane().add(cmbLogType);
		
		txtDurum = new JTextField();
		txtDurum.setBounds(205, 72, 115, 20);
		frame.getContentPane().add(txtDurum);
		txtDurum.setColumns(10);
		
/*		txtSonuc = new JTextField();
		txtSonuc.setBounds(205, 122, 115, 20);
		frame.getContentPane().add(txtSonuc);
		txtSonuc.setColumns(10);
*/		
		JLabel lblSonuc = new JLabel("Sonuç : ");
		lblSonuc.setBounds(75, 207, 248, 14);
		frame.getContentPane().add(lblSonuc);
		
		JButton btnNewButton = new JButton("Kaydet");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String secilenLogTipi = cmbLogType.getSelectedItem().toString();
				
				LoggerImpl loggerImpl = new LoggerImpl(secilenLogTipi);
				loggerImpl.kaydet(txtDurum.getText());
			}
		});
		btnNewButton.setBounds(229, 126, 89, 34);
		frame.getContentPane().add(btnNewButton);
	}
}
