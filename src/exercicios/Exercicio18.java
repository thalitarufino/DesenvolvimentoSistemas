package exercicios;

import javax.swing.JOptionPane;
import java.util.Locale;
public class Exercicio18 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		/*
		 * Nome da escola; Nome do aluno; Nome da professora; Nota da 1ª prova; Nota da
		 * 2ª prova; Nota da 3ª prova;
		 * 
		 * Após receber as informações, o programa deverá calcular as três notas.
		 * 
		 * Utilize estruturas condicionais if e else para determinar a situação do
		 * aluno: Média maior ou igual a 7,0: APROVADO Média maior ou igual a 5,0 e
		 * menor que 7,0: RECUPERAÇÃO
		 * 
		 * Média menor que 5,0: REPROVADO Ao final, utilize
		 * 
		 * JOptionPane.showMessageDialog() para apresentar: Nome da escola; Nome do
		 * aluno; Nome da professora; Média final; Situação do aluno.
		 */

		String escola = JOptionPane.showInputDialog(null, "Nome da escola:" , 
				"Dados da Escola",
				JOptionPane.QUESTION_MESSAGE
				);
		String aluno = JOptionPane.showInputDialog(null, "Nome do aluno:", 
				"Dados do aluno",
				JOptionPane.QUESTION_MESSAGE);
		
		String professora = JOptionPane.showInputDialog(null, "Nome da professora",
				"Dados da professora",
				JOptionPane.QUESTION_MESSAGE); 

		double soma = 0;

		for (int i = 1; i <= 3; i++) {

			String nota = JOptionPane.showInputDialog(null, "Digite a nota " + i + ":");

			double novaNota = Double.parseDouble(nota);

			soma = soma + novaNota;
		}

		double media = soma / 3;

		String situacao;

		if (media >= 7) {
			situacao = "APROVADO";
		} else if (media >= 5) {
			situacao = "RECUPERAÇÃO";
		} else {
			situacao = "REPROVADO";
		}

		JOptionPane.showMessageDialog(null,
					"Nome da escola: " + escola 
					+ "\nNome do aluno: " + aluno 
					+ "\nNome da professora: " + professora
					+ "\nMédia final: " + String.format("%.2f", media) 
					+ "\nSituação do aluno: " 
					+ situacao , "Resultado do Aluno",
					JOptionPane.INFORMATION_MESSAGE);
		}
}