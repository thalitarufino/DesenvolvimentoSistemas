package interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MinhaPrimeiraTela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField textSobrenome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MinhaPrimeiraTela frame = new MinhaPrimeiraTela();
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
	public MinhaPrimeiraTela() {
		setTitle("Minha Primeira Tela");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 579, 405);
		contentPane = new JPanel();
		contentPane.setForeground(UIManager.getColor("Button.disabledShadow"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Desenvolvimento \r\nde sistemas");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.ITALIC, 20));
		lblNewLabel.setBackground(new Color(160, 160, 160));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(123, 11, 288, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setBounds(33, 53, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		txtNome = new JTextField();
		txtNome.setBounds(76, 52, 195, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.setForeground(new Color(0, 0, 0));
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Seu nome é: " + txtNome.getText() +
				"\n Seu Sobrenome: " + textSobrenome.getText());
			
			}
		});
		btnMostrar.setBounds(145, 113, 89, 23);
		contentPane.add(btnMostrar);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 0, 255));
		panel.setForeground(new Color(255, 255, 255));
		panel.setBounds(456, 11, 97, 26);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("SENAI");
		lblNewLabel_2.setBounds(33, 5, 30, 15);
		lblNewLabel_2.setFont(new Font("Yu Gothic UI", Font.PLAIN, 11));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Sobrenome:");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(33, 83, 76, 14);
		contentPane.add(lblNewLabel_1_1);
		
		textSobrenome = new JTextField();
		textSobrenome.setBounds(112, 82, 159, 20);
		contentPane.add(textSobrenome);
		textSobrenome.setColumns(10);

	}
}
