package interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListagemAT2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNome1;
	private JTextField textNome2;
	private JTextField textNome3;
	private JTextField textNome4;
	private JTextField textNome5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListagemAT2 frame = new ListagemAT2();
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
	public ListagemAT2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Listagem");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.ITALIC, 20));
		lblNewLabel.setBounds(165, 11, 98, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome 1° Pessoa:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 54, 117, 14);
		contentPane.add(lblNewLabel_1);
		
		textNome1 = new JTextField();
		textNome1.setBounds(121, 53, 207, 20);
		contentPane.add(textNome1);
		textNome1.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nome 2° Pessoa:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(10, 79, 117, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Nome 3° Pessoa:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(10, 104, 117, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Nome 4° Pessoa:");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3.setBounds(10, 129, 117, 14);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Nome 5° Pessoa:");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_4.setBounds(10, 154, 117, 14);
		contentPane.add(lblNewLabel_1_4);
		
		textNome2 = new JTextField();
		textNome2.setBounds(121, 78, 207, 20);
		contentPane.add(textNome2);
		textNome2.setColumns(10);
		
		textNome3 = new JTextField();
		textNome3.setBounds(121, 104, 207, 20);
		contentPane.add(textNome3);
		textNome3.setColumns(10);
		
		textNome4 = new JTextField();
		textNome4.setBounds(121, 129, 207, 20);
		contentPane.add(textNome4);
		textNome4.setColumns(10);
		
		textNome5 = new JTextField();
		textNome5.setBounds(121, 153, 207, 20);
		contentPane.add(textNome5);
		textNome5.setColumns(10);
		
		JButton btnNewButton = new JButton("Mostrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Nome da 1° Pessoa: " + textNome1.getText()
				+	"\nNome da 2° Pessoa: " + textNome2.getText() 
				+	"\nNome da 3° Pessoa: " + textNome3.getText()
				+	"\nNome da 4° Pessoa: " + textNome4.getText()
				+	"\nNome da 5° Pessoa: " + textNome5.getText()) ;
			}
		});
		btnNewButton.setBounds(174, 184, 89, 23);
		contentPane.add(btnNewButton);

	}

}
