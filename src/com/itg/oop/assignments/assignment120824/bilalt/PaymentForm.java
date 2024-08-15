package com.itg.oop.assignments.assignment120824.bilalt;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        
        JLabel lblPaymentMethod = new JLabel("Ödeme Yöntemi :");
        lblPaymentMethod.setBounds(66, 32, 116, 14);
        frame.getContentPane().add(lblPaymentMethod);
        
        JLabel lblAmount = new JLabel("Tutar :");
        lblAmount.setBounds(66, 74, 46, 14);
        frame.getContentPane().add(lblAmount);
        
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.setModel(new DefaultComboBoxModel<>(new String[] {"Seçiniz", "Kredi Kartı", "Mail Order", "Google Pay"}));
        comboBox.setBounds(235, 28, 108, 22);
        frame.getContentPane().add(comboBox);
        
        textField = new JTextField();
        textField.setBounds(235, 71, 108, 20);
        frame.getContentPane().add(textField);
        textField.setColumns(10);
        
        JLabel lblResult = new JLabel("Sonuç :");
        lblResult.setBounds(53, 220, 315, 14);
        frame.getContentPane().add(lblResult);
        
        JButton btnPay = new JButton("Ödeme Yap");
        btnPay.setBounds(235, 145, 108, 23);
        frame.getContentPane().add(btnPay);
        
        // "Ödeme Yap" butonuna tıklanma olayını işleme
        btnPay.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String paymentMethod = (String) comboBox.getSelectedItem();
                String amount = textField.getText();
                
                if ("Seçiniz".equals(paymentMethod)) {
                    lblResult.setText("Lütfen bir ödeme yöntemi seçiniz.");
                } else if (amount.isEmpty()) {
                    lblResult.setText("Lütfen bir tutar giriniz.");
                } else {
                    lblResult.setText("Ödeme yöntemi: " + paymentMethod + ", Tutar: " + amount + " TL. Ödeme başarılı!");
                }
            }
        });
    }
}
