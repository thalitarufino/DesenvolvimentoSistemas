package interfaces;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class CalculadoraComplexa extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btN8;
	private JTextField textValor;

	// Variáveis utilizadas nos cálculos
	private double primeiroNumero;
	private double segundoNumero;
	private String operador;
	private double resultado;

	// Guarda a expressão que aparece no visor
	private String conta = "";

	// Guarda o número que está sendo digitado
	private String numeroAtual = "";

	// Indica quando um novo número deve começar
	private boolean novoNumero = true;

	// Indica se o resultado já foi mostrado
	private boolean resultadoMostrado = false;

	// Botões da interface
	private JButton btnResultado;
	private JButton btnNVirgula;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraComplexa frame = new CalculadoraComplexa();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CalculadoraComplexa() {
		java.net.URL caminhoImagem = getClass().getResource("/interfaces/resources/calcular.png");

		if (caminhoImagem != null) {
		    setIconImage(Toolkit.getDefaultToolkit().getImage(caminhoImagem));
		} else {
		    System.err.println("Aviso: A imagem '/resources/calcular.png' não foi encontrada na pasta resources.");
		}
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 347, 498);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 102, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Botão para limpar o visor
		JButton btnLimpar = new JButton("AC");
		btnLimpar.setForeground(new Color(51, 51, 51));
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limparTudo();
			}
		});
		btnLimpar.setBounds(10, 164, 241, 47);
		contentPane.add(btnLimpar);

		// Botão do número 7
		JButton btN7 = new JButton("7");
		btN7.setBackground(new Color(153, 153, 153));
		btN7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adicionarNumero("7");
			}
		});
		btN7.setBounds(10, 222, 73, 47);
		contentPane.add(btN7);

		// Botão do número 0
		JButton btnN0 = new JButton("0");
		btnN0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adicionarNumero("0");
			}
		});
		btnN0.setBounds(10, 401, 158, 47);
		contentPane.add(btnN0);

		// Botão da vírgula decimal
		btnNVirgula = new JButton(",");
		btnNVirgula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adicionarVirgula();
			}
		});
		btnNVirgula.setBounds(184, 401, 59, 47);
		contentPane.add(btnNVirgula);

		// Botão de divisão
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selecionarOperador("/");
			}
		});
		btnDiv.setBackground(new Color(255, 153, 51));
		btnDiv.setBounds(262, 164, 59, 47);
		contentPane.add(btnDiv);

		// Botão de multiplicação
		JButton btnMult = new JButton("*");
		btnMult.setBackground(new Color(255, 153, 0));
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selecionarOperador("*");
			}
		});
		btnMult.setBounds(262, 222, 59, 47);
		contentPane.add(btnMult);

		// Botão de subtração
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selecionarOperador("-");
			}
		});
		btnSub.setBackground(new Color(255, 153, 0));
		btnSub.setBounds(262, 280, 59, 47);
		contentPane.add(btnSub);

		// Botão de adição
		JButton btnSoma = new JButton("+");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selecionarOperador("+");
			}
		});
		btnSoma.setBackground(new Color(255, 153, 0));
		btnSoma.setBounds(262, 343, 59, 47);
		contentPane.add(btnSoma);

		// Botão de resultado
		btnResultado = new JButton("=");
		btnResultado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				executarCalculo();
			}
		});
		btnResultado.setBackground(new Color(255, 153, 0));
		btnResultado.setBounds(262, 401, 59, 47);
		contentPane.add(btnResultado);

		// Botões numéricos adicionais
		btN8 = new JButton("8");
		btN8.addActionListener(e -> adicionarNumero("8"));
		btN8.setBackground(new Color(153, 153, 153));
		btN8.setBounds(93, 221, 73, 47);
		contentPane.add(btN8);

		JButton btN9 = new JButton("9");
		btN9.addActionListener(e -> adicionarNumero("9"));
		btN9.setBackground(new Color(153, 153, 153));
		btN9.setBounds(178, 222, 73, 47);
		contentPane.add(btN9);

		JButton btN4 = new JButton("4");
		btN4.addActionListener(e -> adicionarNumero("4"));
		btN4.setBackground(new Color(153, 153, 153));
		btN4.setBounds(10, 280, 73, 47);
		contentPane.add(btN4);

		JButton btN5 = new JButton("5");
		btN5.addActionListener(e -> adicionarNumero("5"));
		btN5.setBackground(new Color(153, 153, 153));
		btN5.setBounds(95, 280, 73, 47);
		contentPane.add(btN5);

		JButton btN6 = new JButton("6");
		btN6.addActionListener(e -> adicionarNumero("6"));
		btN6.setBackground(new Color(153, 153, 153));
		btN6.setBounds(178, 280, 73, 47);
		contentPane.add(btN6);

		JButton btN1 = new JButton("1");
		btN1.addActionListener(e -> adicionarNumero("1"));
		btN1.setBackground(new Color(153, 153, 153));
		btN1.setBounds(10, 343, 73, 47);
		contentPane.add(btN1);

		JButton btN2 = new JButton("2");
		btN2.addActionListener(e -> adicionarNumero("2"));
		btN2.setBackground(new Color(153, 153, 153));
		btN2.setBounds(95, 343, 73, 47);
		contentPane.add(btN2);

		JButton btN3 = new JButton("3");
		btN3.addActionListener(e -> adicionarNumero("3"));
		btN3.setBackground(new Color(153, 153, 153));
		btN3.setBounds(178, 338, 73, 47);
		contentPane.add(btN3);

		// Visor da calculadora
		textValor = new JTextField();
		textValor.setForeground(new Color(255, 255, 255));
		textValor.setBackground(new Color(51, 51, 51));
		textValor.setFont(new Font("Tahoma", Font.PLAIN, 60));
		textValor.setHorizontalAlignment(SwingConstants.RIGHT);
		textValor.setBounds(10, 11, 311, 142);
		textValor.setColumns(10);
		
		// BLOQUEIA EDIÇÃO DIRETA: Evita que expressões sejam digitadas de forma solta
		textValor.setEditable(false); 
		
		contentPane.add(textValor);

		// Configuração completa dos atalhos globais de teclado
		configurarTeclado();
	}

	private void adicionarNumero(String numero) {
		if (resultadoMostrado) {
			conta = "";
			numeroAtual = "";
			operador = null;
			novoNumero = true;
			resultadoMostrado = false;
		}

		if (novoNumero) {
			numeroAtual = "";
			novoNumero = false;
		}

		numeroAtual += numero;
		textValor.setText(conta + numeroAtual);
	}

	private void adicionarVirgula() {
		if (resultadoMostrado) {
			conta = "";
			numeroAtual = "";
			operador = null;
			novoNumero = true;
			resultadoMostrado = false;
		}

		if (novoNumero) {
			numeroAtual = "0";
			novoNumero = false;
		}

		if (!numeroAtual.contains(",")) {
			numeroAtual += ",";
		}

		textValor.setText(conta + numeroAtual);
	}

	private void selecionarOperador(String novoOperador) {
		if (numeroAtual.isEmpty() || numeroAtual.equals(",")) {
			return;
		}

		try {
			segundoNumero = Double.parseDouble(numeroAtual.replace(",", "."));

			if (operador != null) {
				primeiroNumero = calcular(primeiroNumero, segundoNumero, operador);
			} else {
				primeiroNumero = segundoNumero;
			}

			conta = textValor.getText() + " " + novoOperador + " ";
			textValor.setText(conta);

			operador = novoOperador;
			numeroAtual = "";
			novoNumero = true;
			resultadoMostrado = false;

		} catch (NumberFormatException erro) {
			JOptionPane.showMessageDialog(null, "Erro! Digite apenas números.");
		} catch (ArithmeticException erro) {
			JOptionPane.showMessageDialog(null, erro.getMessage());
			limparTudo();
		}
	}

	private void executarCalculo() {
		try {
			if (numeroAtual.isEmpty() || numeroAtual.equals(",")) {
				return;
			}

			segundoNumero = Double.parseDouble(numeroAtual.replace(",", "."));

			if (operador != null) {
				resultado = calcular(primeiroNumero, segundoNumero, operador);
			} else {
				resultado = segundoNumero;
			}

			textValor.setText(String.format("%.2f", resultado).replace(".", ","));

			primeiroNumero = resultado;
			numeroAtual = String.format("%.2f", resultado).replace(".", ",");
			conta = "";
			operador = null;
			novoNumero = true;
			resultadoMostrado = true;

		} catch (NumberFormatException erro) {
			JOptionPane.showMessageDialog(null, "Erro! Digite apenas números.");
		} catch (ArithmeticException erro) {
			JOptionPane.showMessageDialog(null, erro.getMessage());
			limparTudo();
		}
	}

	private double calcular(double n1, double n2, String op) {
		switch (op) {
			case "+": return n1 + n2;
			case "-": return n1 - n2;
			case "*": return n1 * n2;
			case "/":
				if (n2 == 0) throw new ArithmeticException("Não é possível dividir por zero.");
				return n1 / n2;
			default: return n2;
		}
	}

	private void limparTudo() {
		textValor.setText("");
		primeiroNumero = 0;
		segundoNumero = 0;
		resultado = 0;
		operador = null;
		conta = "";
		numeroAtual = "";
		novoNumero = true;
		resultadoMostrado = false;
	}

	private void configurarTeclado() {
		javax.swing.InputMap mapa = getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		javax.swing.ActionMap acoes = getRootPane().getActionMap();

		// Mapear dígitos de 0 a 9 do teclado numérico e alfanumérico
		for (int i = 0; i <= 9; i++) {
			final String num = String.valueOf(i);
			mapa.put(KeyStroke.getKeyStroke(Character.forDigit(i, 10)), "num_" + i);
			mapa.put(KeyStroke.getKeyStroke("NUMPAD" + i), "num_" + i);

			acoes.put("num_" + i, new javax.swing.AbstractAction() {
				public void actionPerformed(ActionEvent e) {
					adicionarNumero(num);
				}
			});
		}

		// Vírgula e Ponto
		mapa.put(KeyStroke.getKeyStroke(KeyEvent.VK_COMMA, 0), "virgula");
		mapa.put(KeyStroke.getKeyStroke(KeyEvent.VK_PERIOD, 0), "virgula");
		mapa.put(KeyStroke.getKeyStroke(KeyEvent.VK_DECIMAL, 0), "virgula");
		acoes.put("virgula", new javax.swing.AbstractAction() {
			public void actionPerformed(ActionEvent e) {
				adicionarVirgula();
			}
		});

		// Operadores
		mapa.put(KeyStroke.getKeyStroke('+'), "somar");
		mapa.put(KeyStroke.getKeyStroke("ADD"), "somar");
		acoes.put("somar", new javax.swing.AbstractAction() {
			public void actionPerformed(ActionEvent e) { selecionarOperador("+"); }
		});

		mapa.put(KeyStroke.getKeyStroke('-'), "subtrair");
		mapa.put(KeyStroke.getKeyStroke("SUBTRACT"), "subtrair");
		acoes.put("subtrair", new javax.swing.AbstractAction() {
			public void actionPerformed(ActionEvent e) { selecionarOperador("-"); }
		});

		mapa.put(KeyStroke.getKeyStroke('*'), "multiplicar");
		mapa.put(KeyStroke.getKeyStroke("MULTIPLY"), "multiplicar");
		acoes.put("multiplicar", new javax.swing.AbstractAction() {
			public void actionPerformed(ActionEvent e) { selecionarOperador("*"); }
		});

		mapa.put(KeyStroke.getKeyStroke('/'), "dividir");
		mapa.put(KeyStroke.getKeyStroke("DIVIDE"), "dividir");
		acoes.put("dividir", new javax.swing.AbstractAction() {
			public void actionPerformed(ActionEvent e) { selecionarOperador("/"); }
		});

		// Tecla Enter e Numpad Enter
		mapa.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "calcular");
		acoes.put("calcular", new javax.swing.AbstractAction() {
			public void actionPerformed(ActionEvent e) {
				executarCalculo();
			}
		});
	}
}