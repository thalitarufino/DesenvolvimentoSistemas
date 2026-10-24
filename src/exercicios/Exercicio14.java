package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio14 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);

		System.out.print("Digite a nota do aluno (0 a 100): ");
		double nota = leitor.nextDouble();

		System.out.print("Digite a frequência do aluno em % (0 a 100): ");
		double frequencia = leitor.nextDouble();

		if (nota >= 60.0 && frequencia >= 75.0) {
			System.out.println("Aluno Aprovado!");
		} else {
			System.out.println("Aluno Reprovado!");
		}

		leitor.close();
	}
}
